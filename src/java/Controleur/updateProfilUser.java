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
import java.io.PrintWriter;
import static java.lang.System.out;

/**
 *
 * @author Workdev
 */

public class updateProfilUser extends HttpServlet {
    
    
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Connection cn = null;
        PrintWriter out = null;

        try {
            cn = config.connect();
            out = response.getWriter();
            
            String Telephone = request.getParameter("Telephone");
            String Adresse = request.getParameter("Adresse");
            String iduser = request.getParameter("iduser");
            
            users.updateProfilUser(Telephone, Adresse, iduser, cn);
            out.println("<script>alert('Modification effectuée');</script>");
            response.sendRedirect("boardSuivi_copy.jsp");
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
