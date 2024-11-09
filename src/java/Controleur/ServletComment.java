/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import DBconnect.config;
import Model.Comment;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Workdev
 */
@WebServlet(name = "ServletComment", urlPatterns = {"/ServletComment"})
public class ServletComment extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    Connection cn = config.connect();
    String commentaire = request.getParameter("commentaire");
        try {
            Comment.InsertComment(commentaire,cn);
            response.sendRedirect("boardSuivi.jsp");
        } catch (Exception ex) {
            Logger.getLogger(ServletTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     

    
    }


}
