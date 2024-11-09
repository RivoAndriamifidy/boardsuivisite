/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Workdev
 */
public class Comment {
    int idComment;
    String Commentaire;

    public Comment(int idComment, String Commentaire) {
        this.idComment = idComment;
        this.Commentaire = Commentaire;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getCommentaire() {
        return Commentaire;
    }

    public void setCommentaire(String Commentaire) {
        this.Commentaire = Commentaire;
    }
    public static void InsertComment(String Commentaire, Connection con) throws Exception{
        Statement st =  con.createStatement();
        String sql = "INSERT INTO comment values (null,'"+Commentaire+"')";
        st.executeUpdate(sql);
    }
}
