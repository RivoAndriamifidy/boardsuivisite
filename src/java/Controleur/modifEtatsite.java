/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import DBconnect.config;
import Model.afficheSite;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Workdev
 */
public class modifEtatsite extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection cn = config.connect();
        String idtable1 = request.getParameter("idtable1");
        String idtable = request.getParameter("idtable");
        String idStatut = "0"; 
        try {
           afficheSite.updateStatutannuler(idStatut, idtable, cn);
           afficheSite.DeleteetatSite(idtable1,cn);
           out.println("<script>alert('modification effectuée');</script>") ;
           response.sendRedirect("sitecorrige.jsp");

        } catch (Exception e) {
           // TODO: handle exception
        }  

    }
    }
    

    

