/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Workdev
 */
public class users {

    public static void updateMDP(String newpassword, Connection cn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String iduser;
    private String username;
    private String email;
    private String password;
    private String typeUser;
    private String Photo;
    private String nomComplet;
    private String Telephone;
    private String Adresse;
    
    
    public users(String iduser, String username, String email, String password, String typeUser, String Photo, String nomComplet, String Telephone, String Adresse) {
        this.iduser = iduser;
        this.username = username;
        this.email = email;
        this.password = password;
        this.typeUser = typeUser;
        this.Photo = Photo;
        this.nomComplet = nomComplet;
        this.Telephone = Telephone;
        this.Adresse = Adresse;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    


    public static boolean checklogin(String username, String password,String typeUser, Connection cn) throws Exception {
    Statement startreq = cn.createStatement();
    String sql = "SELECT * FROM user where username='"+username+"' and  password='"+password+"' and typeUser='"+typeUser+"'";
    ResultSet res = startreq.executeQuery(sql);
        if(res.next()== true){
            return true;
        }else{
            return false;
        }
    }    
    public static void Insertion(String username,String email, String password,String Photo,String typeUser, String nomComplet, String Telephone, String Adresse, Connection Conn)throws Exception{
        Statement startreq =  Conn.createStatement();
        String sql = "INSERT INTO user values (null,'"+username+"','"+email+"','"+password+"','"+Photo+"','"+typeUser+"','"+nomComplet+"','"+Telephone+"','"+Adresse+"')";
        startreq.executeUpdate(sql);
    }
    
    public static ResultSet affichage(String username,Connection Conn) throws Exception{
        String sql = "SELECT * FROM user where username = '"+username+"'";
        Statement cs = Conn.createStatement();
        ResultSet res = cs.executeQuery(sql);
        return res;
    }
    
    public static ResultSet affichageTout(Connection Conn) throws Exception{
        String sql = "SELECT * FROM user";
        Statement cs = Conn.createStatement();
        ResultSet res = cs.executeQuery(sql);
        return res;
    }
    
    public static void updateMDP(String newpassword, String iduser, Connection con) throws Exception {
        String sql = "UPDATE user SET password = ? WHERE iduser = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, newpassword);
        pst.setString(2, iduser);

        pst.executeUpdate();
        pst.close();
    }
    public static void updateProfile(String username, String email, String typeUser, String nomComplet, String Telephone, String Adresse, String iduser, Connection con) throws Exception {
        String sql = "UPDATE user SET username = ?, email = ? , typeUser = ?, nomComplet = ?, Telephone = ?,  Adresse = ?  WHERE iduser = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, email);
        pst.setString(3, typeUser);
        pst.setString(4, nomComplet);
        pst.setString(5, Telephone);
        pst.setString(6, Adresse);
        pst.setString(7, iduser);

        pst.executeUpdate();
        pst.close();
    }

    
    public static void updateMDPuser(String newpassword,String iduser, Connection con) throws Exception{
        String sql ="UPDATE user SET password = ? WHERE iduser = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, iduser);
        pst.setString(2, newpassword);
        
        pst.executeUpdate();
        pst.close();
    }
    
    public static void updateProfilUser(String Telephone,String Adresse, String iduser, Connection con) throws Exception {
        String sql = "UPDATE user SET  Telephone = ? , Adresse = ? WHERE iduser = ?";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, Telephone);
        pstm.setString(2, Adresse);
        pstm.setString(3, iduser);
        pstm.executeUpdate();
        pstm.close();
    }

    
    
    public boolean existsInDatabase(Connection cn) throws Exception {
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String sql = "SELECT COUNT(*) FROM user WHERE username = ? OR email = ?";
            statement = cn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, email);

            resultSet = statement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);

            return count > 0;
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
    }
    
    

}
