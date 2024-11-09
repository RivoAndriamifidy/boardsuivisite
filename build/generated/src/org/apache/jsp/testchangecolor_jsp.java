package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testchangecolor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <style>\n");
      out.write("    /* Définition du style pour la classe \"clicked\" */\n");
      out.write("    .clicked {\n");
      out.write("      color: red;\n");
      out.write("      font-weight: bold;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <table>\n");
      out.write("    <tr>\n");
      out.write("      <td><a href=\"#\" class=\"link\">Lien 1</a></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><a href=\"#\" class=\"link\">Lien 2</a></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><a href=\"#\" class=\"link\">Lien 3</a></td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("    /* Définition du style pour la classe \"selected\" */\n");
      out.write("    .selected {\n");
      out.write("      background-color: yellow;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <table>\n");
      out.write("    <tr>\n");
      out.write("      <td onclick=\"changeColor(this)\">Ligne 1, Colonne 1</td>\n");
      out.write("      <td>Ligne 1, Colonne 2</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td onclick=\"changeColor(this)\">Ligne 2, Colonne 1</td>\n");
      out.write("      <td>Ligne 2, Colonne 2</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td onclick=\"changeColor(this)\">Ligne 3, Colonne 1</td>\n");
      out.write("      <td>Ligne 3, Colonne 2</td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script >\n");
      out.write("      // Attacher un gestionnaire d'événements à chaque lien\n");
      out.write("var links = document.getElementsByClassName(\"link\");\n");
      out.write("for (var i = 0; i < links.length; i++) {\n");
      out.write("  links[i].addEventListener(\"click\", handleClick);\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Fonction appelée lorsqu'un lien est cliqué\n");
      out.write("function handleClick(event) {\n");
      out.write("  event.preventDefault(); // Empêcher le comportement par défaut du lien\n");
      out.write("\n");
      out.write("  // Changer la couleur de la ligne du lien cliqué\n");
      out.write("  var row = event.target.parentNode.parentNode; // Obtenir l'élément parent de l'élément parent du lien (la ligne de la table)\n");
      out.write("  row.style.color = \"red\"; // Changer la couleur de la ligne\n");
      out.write("\n");
      out.write("  // Rediriger vers une autre page\n");
      out.write("  window.location.href = \"https://www.example.com\"; // Remplacez \"https://www.example.com\" par l'URL de la page vers laquelle vous souhaitez rediriger\n");
      out.write("}\n");
      out.write("\n");
      out.write("function changeColor(element) {\n");
      out.write("  element.classList.toggle(\"selected\");\n");
      out.write("}\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
