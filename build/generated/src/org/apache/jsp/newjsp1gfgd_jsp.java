package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1gfgd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write(" <style>\n");
      out.write("   .notification {\n");
      out.write("    position: fixed;\n");
      out.write("    top: 20px;\n");
      out.write("    right: 20px;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    color: #333;\n");
      out.write("    padding: 10px;\n");
      out.write("    border-radius: 4px;\n");
      out.write(" }\n");
      out.write(" \n");
      out.write(" #close-button {\n");
      out.write("    float: right;\n");
      out.write("    cursor: pointer;\n");
      out.write(" }\n");
      out.write(" \n");
      out.write("   </style>\n");
      out.write("<body>\n");
      out.write("   <div id=\"floating-notification\" class=\"notification\">\n");
      out.write("      <span id=\"close-button\" onclick=\"closeNotification()\">X</span>\n");
      out.write("      <p id=\"notification-content\"></p>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("   <select title=\"");
      out.print( users );
      out.write("\" class=\"form-control text-center Statut\" name=\"selectName\" id=\"selectName\" onchange=\"handleSelectionChange()\" style=\"font-size: 12px;\">\n");
      out.write("      <option title=\"");
      out.print( users );
      out.write("\" value=\"1\">A faire</option>\n");
      out.write("      <option title=\"");
      out.print( users );
      out.write("\" value=\"2\">En cours</option>\n");
      out.write("      <option title=\"");
      out.print( users );
      out.write("\" value=\"3\">En attente</option>\n");
      out.write("      <option title=\"");
      out.print( users );
      out.write("\" value=\"4\">Terminer</option>\n");
      out.write("   </select>\n");
      out.write("\n");
      out.write("   <script>\n");
      out.write("       var notificationVisible = false;\n");
      out.write("\n");
      out.write("function handleSelectionChange() {\n");
      out.write("   var selectElement = document.getElementById(\"selectName\");\n");
      out.write("   var selectedOption = selectElement.options[selectElement.selectedIndex].value;\n");
      out.write("\n");
      out.write("   if (selectedOption === \"2\" && !notificationVisible) {\n");
      out.write("      document.getElementById(\"notification-content\").textContent = \"En cours\";\n");
      out.write("      document.getElementById(\"floating-notification\").style.display = \"block\";\n");
      out.write("      notificationVisible = true;\n");
      out.write("   } else {\n");
      out.write("      document.getElementById(\"floating-notification\").style.display = \"none\";\n");
      out.write("      notificationVisible = false;\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function closeNotification() {\n");
      out.write("   document.getElementById(\"floating-notification\").style.display = \"none\";\n");
      out.write("   notificationVisible = false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("   </script>\n");
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
