/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Workdev
 */
@WebServlet(name = "logout", urlPatterns = {"/logout"})
public class logout extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public logout() {
        super();
    }
    @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        System.out.println("Session before invalidate: "+ request.getSession(false));
        request.getSession(false).invalidate();
        System.out.println("Session after invalidate: "+ request.getSession(false));
        response.sendRedirect("index.jsp");
        System.out.println("deconnection reussi...");
        out.close();
    }  

}
