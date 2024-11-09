/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import DBconnect.config;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.ticket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Workdev
 */
@WebServlet(name = "ServletTicket", urlPatterns = {"/ServletTicket"})
public class ServletTicket extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    Connection cn = config.connect();
    String Num_Ticket = request.getParameter("Num_Ticket");
        try {
            ticket.InsertTicket(Num_Ticket,cn);
            response.sendRedirect("boardSuivi.jsp");
        } catch (Exception ex) {
            Logger.getLogger(ServletTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     

    }

    
    

}
