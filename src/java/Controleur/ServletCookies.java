/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Workdev
 */
public class ServletCookies extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Récupération de la valeur de l'élément de sélection
    String selectValue = request.getParameter("selectName");
    
    // Création du cookie avec la valeur de l'élément de sélection
    Cookie selectCookie = new Cookie("selectCookie", selectValue);
    // Définition de la durée de vie du cookie (en secondes)
    selectCookie.setMaxAge(60*60*24*7);
    // Ajout du cookie à la réponse HTTP
    response.addCookie(selectCookie);
    
    // Redirection vers la page JSP
    response.sendRedirect("boardSuivi.jsp");
  }

}
