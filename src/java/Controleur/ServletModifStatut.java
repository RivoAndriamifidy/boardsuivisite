/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import DBconnect.config;
import Model.afficheSite;
import Model.users;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rivo
 */
public class ServletModifStatut extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     Connection cn = config.connect();
     String idTable1 = request.getParameter("idsite");
     String idUser = request.getParameter("idUser");
     String idStatut = request.getParameter("idstatut");
     try {
           afficheSite.updateStatut(idTable1,idUser,idStatut,cn);
           response.sendRedirect("sitecorrige.jsp");

        } catch (Exception e) {
           // TODO: handle exception
        }  

    }
}
