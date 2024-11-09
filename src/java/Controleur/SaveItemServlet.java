/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;


import DBconnect.config;
import Model.ajoutTerminer;
import java.io.IOException;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Workdev
 */
public class SaveItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Connection conn = config.connect();
        String idtable1 = request.getParameter("idsite");
        String idStatut = request.getParameter("idstatut");
        String iduser = request.getParameter("idUser");
        String Comment = request.getParameter("comment");
        String Ticket = request.getParameter("ticket");
        try {
            ajoutTerminer.Insertion( idtable1, idStatut, iduser,Ticket, Comment, conn);
            response.sendRedirect("boardSuivi_copy.jsp");
        } catch (Exception ex) {
            Logger.getLogger(ServletTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        

}
}