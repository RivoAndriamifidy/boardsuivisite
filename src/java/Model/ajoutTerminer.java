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
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *
 * @author Workdev
 */
public class ajoutTerminer {
    private String idSiteCorrige;
    private String idtable1;
    private String idStatut;
    private String Ticket;
    private String Comment;
    private String dateTerminer;

    public String getIdSiteCorrige() {
        return idSiteCorrige;
    }

    public void setIdSiteCorrige(String idSiteCorrige) {
        this.idSiteCorrige = idSiteCorrige;
    }

    public String getIdtable1() {
        return idtable1;
    }

    public void setIdtable1(String idtable1) {
        this.idtable1 = idtable1;
    }

    public String getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(String idStatut) {
        this.idStatut = idStatut;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public String getDateTerminer() {
        return dateTerminer;
    }

    public void setDateTerminer(String dateTerminer) {
        this.dateTerminer = dateTerminer;
    }

    public ajoutTerminer(String idSiteCorrige, String idtable1, String idStatut, String Ticket, String Comment, String dateTerminer) {
        this.idSiteCorrige = idSiteCorrige;
        this.idtable1 = idtable1;
        this.idStatut = idStatut;
        this.Ticket = Ticket;
        this.Comment = Comment;
        this.dateTerminer = dateTerminer;
    }

    

    
    /*public static void Insertion(String idtable1, String idStatut,String iduser,String Ticket,String Comment, LocalDate dateTerminer, Connection Conn)throws Exception{
         LocalDate date = LocalDate.now();
        Statement startreq =  Conn.createStatement();
        String sql = "INSERT INTO sitecorrige values (null,'"+idtable1+"','"+idStatut+"','"+iduser+"','"+Ticket+"','"+Comment+"','Date.valueOf(LocalDate.now())')";
        startreq.executeUpdate(sql);
    }*/
    
    public static void Insertion(String idtable1, String idStatut, String iduser, String Ticket, String Comment, Connection Conn) throws Exception {
    LocalDateTime dateTime = LocalDateTime.now();
    String sql = "INSERT INTO sitecorrige VALUES (null, ?, ?, ?, ?, ?, ?)";
    PreparedStatement statement = Conn.prepareStatement(sql);
    statement.setString(1, idtable1);
    statement.setString(2, idStatut);
    statement.setString(3, iduser);
    statement.setString(4, Ticket);
    statement.setString(5, Comment);
    statement.setTimestamp(6, Timestamp.valueOf(dateTime));
    int rowsInserted = statement.executeUpdate();
    /*if (rowsInserted > 0) {
        System.out.println("La date du jour a été insérée avec succès !");
    }*/
}

    
    public static ResultSet AfficheSiteCorriger(Connection con) throws Exception {
    String sql = "SELECT *, DATE_FORMAT(dateTerminer, '%d-%b-%Y %H:%i:%s') AS formattedDateTime\n" +
                "FROM sitecorrige\n" +
                "INNER JOIN table1 ON sitecorrige.idtable1 = table1.idtable1\n" +
                "INNER JOIN statut ON sitecorrige.idStatut = statut.idStatut\n" +
                "INNER JOIN user ON sitecorrige.iduser = user.iduser\n" +
                "WHERE sitecorrige.idStatut = 4";
    PreparedStatement statement = con.prepareStatement(sql);
    return statement.executeQuery();
}
    public static ResultSet AfficheSiteEnCours(Connection con) throws Exception {
    String sql = "SELECT *, DATE_FORMAT(dateTerminer, '%d-%b-%Y %H:%i:%s') AS formattedDateTime\n" +
                "FROM sitecorrige\n" +
                "INNER JOIN table1 ON sitecorrige.idtable1 = table1.idtable1\n" +
                "INNER JOIN statut ON sitecorrige.idStatut = statut.idStatut\n" +
                "INNER JOIN user ON sitecorrige.iduser = user.iduser\n";
    PreparedStatement statement = con.prepareStatement(sql);
    return statement.executeQuery();
}
    /*public static ResultSet triSiteCorrige(Connection con)throws Exception{
        String sql = "SELECT *, DATE_FORMAT(dateTerminer, '%d-%b-%Y %H:%i:%s') AS formattedDateTime FROM sitecorrige \n" +
                    "INNER JOIN table1 ON sitecorrige.idtable1 = table1.idtable1  \n" +
                    "INNER JOIN statut ON sitecorrige.idStatut = statut.idStatut \n" +
                    "INNER JOIN user ON sitecorrige.iduser = user.iduser\n" +
                    "ORDER BY MONTH(dateTerminer) DESC";
        PreparedStatement statement = con.prepareStatement(sql);
        ResultSet res = statement.executeQuery();
        return res;
    } */
    
    public static ResultSet listeEffectueUser( String iduser,  Connection Conn) throws Exception{
        String query = "SELECT * FROM siteCorrige "+
                "INNER JOIN table1 ON sitecorrige.idtable1 = table1.idtable1\n" +
                "INNER JOIN statut ON sitecorrige.idStatut = statut.idStatut\n" +
                "INNER JOIN user ON sitecorrige.iduser = user.iduser\n"+
                "WHERE  sitecorrige.iduser = '"+iduser+"' AND sitecorrige.idStatut = 4";
        Statement st = Conn.createStatement();
        ResultSet resultat = st.executeQuery(query);
        return resultat; 
        
        
    }
}
