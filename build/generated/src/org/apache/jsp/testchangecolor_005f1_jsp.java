package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testchangecolor_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <table>\n");
      out.write("    <tr onclick=\"selectRow(1)\"> <!-- Ligne 1 -->\n");
      out.write("      <td>Ligne 1, Colonne 1</td>\n");
      out.write("      <td>Ligne 1, Colonne 2</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr onclick=\"selectRow(2)\"> <!-- Ligne 2 -->\n");
      out.write("      <td>Ligne 2, Colonne 1</td>\n");
      out.write("      <td>Ligne 2, Colonne 2</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr onclick=\"selectRow(3)\"> <!-- Ligne 3 -->\n");
      out.write("      <td>Ligne 3, Colonne 1</td>\n");
      out.write("      <td>Ligne 3, Colonne 2</td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    function selectRow(rowNumber) {\n");
      out.write("      window.location.href = \"testchangecolor_2.jsp?row=\" + rowNumber;\n");
      out.write("    }\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
