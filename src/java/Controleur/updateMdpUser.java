/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBconnect.config;
import Model.users;
import static java.lang.System.out;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Workdev
 */
@WebServlet(name = "updateMdpUser", urlPatterns = { "/updateMdpUser" })
public class updateMdpUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     Connection cn = config.connect();
     String newpassword = request.getParameter("newpassword");
     String renewpassword = request.getParameter("renewpassword");
     String iduser = request.getParameter("iduser");
     try {
        if(!renewpassword.equals(newpassword)){
           out.println("<script>alert('Mot de passe non identique');</script>") ;
           response.sendRedirect("boardSuivi_copy.jsp");
        }else{
            users.updateMDPuser(iduser,newpassword,cn);
            out.println("<script>alert('modification effectuée');</script>") ;
            response.sendRedirect("userlist.jsp");

        }
     } catch (Exception e) {
        // TODO: handle exception
     }  

    }

}
