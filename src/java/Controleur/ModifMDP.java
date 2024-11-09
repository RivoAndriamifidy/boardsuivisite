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

public class ModifMDP extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Connection cn = null;
        PrintWriter out = null;

        try {
            cn = config.connect();
            out = response.getWriter();
            
            String newpassword = request.getParameter("newpassword");
            String renewpassword = request.getParameter("renewpassword");
            String iduser = request.getParameter("iduser");

            if (renewpassword.equals(newpassword)) {
                 users.updateMDP( newpassword, iduser,  cn);
                out.println("<script>alert('Modification effectuée');</script>");
                response.sendRedirect("dashnew.jsp");
            } else {
                out.println("<script>alert('Mot de passe non identique');</script>");
                response.sendRedirect("profile.jsp");
            }
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
