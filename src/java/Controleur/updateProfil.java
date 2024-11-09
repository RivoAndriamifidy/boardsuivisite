/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import DBconnect.config;
import Model.users;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Workdev
 */
public class updateProfil extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Connection cn = null;
        PrintWriter out = null;

        try {
            cn = config.connect();
            out = response.getWriter();
            
            
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String typeUser = request.getParameter("typeUser");
            String nomComplet = request.getParameter("nomComplet");
            String Adresse = request.getParameter("Adresse");
            String Telephone = request.getParameter("Telephone");
            String iduser = request.getParameter("iduser");
            
            users.updateProfile(username,email,typeUser,nomComplet,  Telephone, Adresse,iduser,  cn);
            out.println("<script>alert('Modification effectuée');</script>");
            response.sendRedirect("userlist.jsp");  
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
