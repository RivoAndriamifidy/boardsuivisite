package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormatSymbols;
import Model.ajoutTerminer;
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.Connection;
import Model.users;
import DBconnect.config;
import java.sql.Connection;
import java.sql.ResultSet;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/dashnew.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
   
    String username = (String) session.getAttribute("username");
    Connection Conn = DBconnect.config.connect();
    ResultSet vres = users.affichage(username,Conn);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("  <title>Dashboard - QC MAINTENANCE</title>\n");
      out.write("  <meta content=\"\" name=\"description\">\n");
      out.write("  <meta content=\"\" name=\"keywords\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <link href=\"CSSfile/styleNew.css\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"CSSfile/style.css\">\n");
      out.write("  <link href=\"font-awesome-4.7.0/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"shortcut icon\" href=\"image/favicon.ico\"/> \n");
      out.write("\n");
      out.write("  <!-- =======================================================\n");
      out.write("  * Template Name: NiceAdmin\n");
      out.write("  * Updated: Mar 09 2023 with Bootstrap v5.2.3\n");
      out.write("  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/\n");
      out.write("  * Author: BootstrapMade.com\n");
      out.write("  * License: https://bootstrapmade.com/license/\n");
      out.write("  ======================================================== -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"dist/css/bootstrap.css\">\n");
      out.write("  <style>\n");
      out.write("    *{font-size: 12px;}\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- ======= Header ======= -->\n");
      out.write("  <header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\n");
      out.write("\n");
      out.write("    <div class=\"d-flex align-items-center justify-content-between\">\n");
      out.write("      <a href=\"index.html\" class=\"logo d-flex align-items-center text-decoration-none\">\n");
      out.write("        <span class=\"d-none d-lg-block\">Value-IT</span>\n");
      out.write("      </a>\n");
      out.write("      <i class=\"fa fa-bars toggle-sidebar-btn\"></i>\n");
      out.write("    </div><!-- End Logo -->\n");
      out.write("\n");
      out.write("    <div class=\"search-bar\">\n");
      out.write("      <form class=\"search-form d-flex align-items-center\" method=\"POST\" action=\"#\">\n");
      out.write("        <input type=\"text\" name=\"query\" placeholder=\"Search\" title=\"Enter search keyword\">\n");
      out.write("        <button type=\"submit\" title=\"Search\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\n");
      out.write("      </form>\n");
      out.write("    </div><!-- End Search Bar -->\n");
      out.write("\n");
      out.write("    <nav class=\"header-nav ms-auto\">\n");
      out.write("      <ul class=\"d-flex align-items-center\">\n");
      out.write("\n");
      out.write("        <li class=\"nav-item d-block d-lg-none\">\n");
      out.write("          <a class=\"nav-link nav-icon search-bar-toggle \" href=\"#\">\n");
      out.write("            <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("          </a>\n");
      out.write("        </li><!-- End Search Icon-->\n");
      out.write("\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("          <a class=\"nav-link nav-icon\" href=\"#\" data-bs-toggle=\"dropdown\">\n");
      out.write("            <i class=\"fa fa-bell-o\" aria-hidden=\"true\"></i>\n");
      out.write("            <span class=\"badge bg-primary badge-number\">4</span>\n");
      out.write("          </a><!-- End Notification Icon -->\n");
      out.write("\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow notifications\">\n");
      out.write("            <li class=\"dropdown-header\">\n");
      out.write("              You have 4 new notifications\n");
      out.write("              <a href=\"#\"><span class=\"badge rounded-pill bg-primary p-2 ms-2\">View all</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"notification-item\">\n");
      out.write("              <i class=\"bi bi-exclamation-circle text-warning\"></i>\n");
      out.write("              <div>\n");
      out.write("                <h4>Lorem Ipsum</h4>\n");
      out.write("                <p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("                <p>30 min. ago</p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"notification-item\">\n");
      out.write("              <i class=\"bi bi-x-circle text-danger\"></i>\n");
      out.write("              <div>\n");
      out.write("                <h4>Atque rerum nesciunt</h4>\n");
      out.write("                <p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("                <p>1 hr. ago</p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"notification-item\">\n");
      out.write("              <i class=\"bi bi-check-circle text-success\"></i>\n");
      out.write("              <div>\n");
      out.write("                <h4>Sit rerum fuga</h4>\n");
      out.write("                <p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("                <p>2 hrs. ago</p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"notification-item\">\n");
      out.write("              <i class=\"bi bi-info-circle text-primary\"></i>\n");
      out.write("              <div>\n");
      out.write("                <h4>Dicta reprehenderit</h4>\n");
      out.write("                <p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("                <p>4 hrs. ago</p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown-footer\">\n");
      out.write("              <a href=\"#\">Show all notifications</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          </ul><!-- End Notification Dropdown Items -->\n");
      out.write("\n");
      out.write("        </li><!-- End Notification Nav -->\n");
      out.write("\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("          <a class=\"nav-link nav-icon\" href=\"#\" data-bs-toggle=\"dropdown\">\n");
      out.write("            <i class=\"fa fa-twitch\" aria-hidden=\"true\"></i>\n");
      out.write("            <span class=\"badge bg-success badge-number\">3</span>\n");
      out.write("          </a><!-- End Messages Icon -->\n");
      out.write("\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow messages\">\n");
      out.write("            <li class=\"dropdown-header\">\n");
      out.write("              You have 3 new messages\n");
      out.write("              <a href=\"#\"><span class=\"badge rounded-pill bg-primary p-2 ms-2\">View all</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"message-item\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"assets/img/messages-1.jpg\" alt=\"\" class=\"rounded-circle\">\n");
      out.write("                <div>\n");
      out.write("                  <h4>Maria Hudson</h4>\n");
      out.write("                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>\n");
      out.write("                  <p>4 hrs. ago</p>\n");
      out.write("                </div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"message-item\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"assets/img/messages-2.jpg\" alt=\"\" class=\"rounded-circle\">\n");
      out.write("                <div>\n");
      out.write("                  <h4>Anna Nelson</h4>\n");
      out.write("                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>\n");
      out.write("                  <p>6 hrs. ago</p>\n");
      out.write("                </div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"message-item\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"assets/img/messages-3.jpg\" alt=\"\" class=\"rounded-circle\">\n");
      out.write("                <div>\n");
      out.write("                  <h4>David Muldon</h4>\n");
      out.write("                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>\n");
      out.write("                  <p>8 hrs. ago</p>\n");
      out.write("                </div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"dropdown-footer\">\n");
      out.write("              <a href=\"#\">Show all messages</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          </ul><!-- End Messages Dropdown Items -->\n");
      out.write("\n");
      out.write("        </li><!-- End Messages Nav -->\n");
      out.write("\n");
      out.write("            <!---- icon avec dropdown user--------------------->\n");
      out.write("           <div class=\"dropdown float-right\">\n");
      out.write("          <span class=\"dropbtn\">\n");
      out.write("            <img src=\"image/user.jpg\" alt=\"\" width=\"50px\" style=\"border-radius: 50%;\">\n");
      out.write("          </span>\n");
      out.write("          <div class=\"dropdown-content\">\n");
      out.write("              \n");
      out.write("            ");
 while (vres.next()){
      out.write("\n");
      out.write("                  <div class=\" row\">\n");
      out.write("                      <div class=\"col-lg-3 d-flex justify-content-center\">\n");
      out.write("                          <img src=\"image/user.jpg\" alt=\"\" width=\"50px\" style=\"border-radius: 50%;\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-lg-9\">\n");
      out.write("                          <b>");
 out.println(vres.getString("username"));
      out.write("</b><br>\n");
      out.write("                          ");
 out.println(vres.getString("email"));
      out.write("\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("              <hr>   \n");
      out.write("              <a href=\"profile.jsp?edituser=");
 out.println(vres.getString("username")); 
      out.write("\"><img src=\"image/editprofile.jpg\" width=\"25px\">  Edit profile</a>\n");
      out.write("              <a href=\"#\"><img src=\"image/setting.png\" >  Setting</a>\n");
      out.write("              <hr>\n");
      out.write("              <a href=\"#\"><img src=\"image/guide.png\" width=\"25px\">  Guide</a>                \n");
      out.write("              <a href=\"#\"><img src=\"image/help.png\" width=\"25px\">  Help</a>\n");
      out.write("              <hr>\n");
      out.write("              <form method=\"get\" action=\"logout\">\n");
      out.write("                  <a href=\"logout\"><i class=\"fa fa-sign-out fa-2x\" aria-hidden=\"true\"></i>  Logout</a>\n");
      out.write("              </form>\n");
      out.write("              \n");
      out.write("            \n");
      out.write("          </div> \n");
      out.write("      </ul>\n");
      out.write("    </nav><!-- End Icons Navigation -->\n");
      out.write("\n");
      out.write("  </header><!-- End Header -->\n");
      out.write("  \n");
      out.write("  <!-- ======= Sidebar ======= -->\n");
      out.write("  <nav id=\"sidebarMenu\" class=\"col-md-3 col-lg-2 d-block bg-light sidebar collapse\">\n");
      out.write("    <div class=\"position-sticky pt-3 sidebar-sticky\">\n");
      out.write("  <aside id=\"sidebar\" class=\"sidebar\">\n");
      out.write("\n");
      out.write("    <ul class=\"sidebar-nav\" id=\"sidebar-nav\">\n");
      out.write("    <li class=\"nav-heading\">Gestion des sites</li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" href=\"#\">\n");
      out.write("          <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\n");
      out.write("          <span>Tableau de bord</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Dashboard Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#components-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n");
      out.write("          <i class=\"fa fa-bars\" aria-hidden=\"true\"></i></i><span>Site</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul id=\"components-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-alerts.html\"class=\"text-decoration-none\">\n");
      out.write("              <i class=\"fa fa-circle-o\" aria-hidden=\"true\"></i><span>A traiter</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"sitecorrige.jsp\" class=\"text-decoration-none\">\n");
      out.write("              <i class=\"fa fa-circle-o\" aria-hidden=\"true\"></i><span>Deja traiter</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </li><!-- End Components Nav -->\n");
      out.write("\n");
      out.write("\n");
      out.write("      <li class=\"nav-heading\">Gestion d'utilisateur</li>\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"profile.jsp?edituser=");
 out.println(vres.getString("username")); 
      out.write("\">\n");
      out.write("          <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("          <span>Profile</span>\n");
      out.write("        </a>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("      </li><!-- End Profile Page Nav -->\n");
      out.write("\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"userlist.jsp\">\n");
      out.write("            <i class=\"fa fa-users\" aria-hidden=\"true\"></i>\n");
      out.write("          <span>Liste des utilisateur</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Contact Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"register.jsp\">\n");
      out.write("          <i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i>\n");
      out.write("          <span>Creer un utilisateur</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Register Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"signin.jsp\">\n");
      out.write("          <i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i>\n");
      out.write("          <span>Se connecter</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Login Page Nav -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("  </aside><!-- End Sidebar-->\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("<script>\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $('#monTableau').DataTable({\n");
      out.write("                \"language\": {\n");
      out.write("                            \"sProcessing\":     \"Traitement en cours...\",\n");
      out.write("                            \"sSearch\":         \"Rechercher&nbsp;:\",\n");
      out.write("                        \"sLengthMenu\":     \"Afficher _MENU_ &eacute;l&eacute;ments\",\n");
      out.write("                            \"sInfo\":           \"Affichage de l'&eacute;lement _START_ &agrave; _END_ sur _TOTAL_ &eacute;l&eacute;ments\",\n");
      out.write("                            \"sInfoEmpty\":      \"Affichage de l'&eacute;lement 0 &agrave; 0 sur 0 &eacute;l&eacute;ments\",\n");
      out.write("                            \"sInfoFiltered\":   \"(filtr&eacute; de _MAX_ &eacute;l&eacute;ments au total)\",\n");
      out.write("                            \"sInfoPostFix\":    \"\",\n");
      out.write("                            \"sLoadingRecords\": \"Chargement en cours...\",\n");
      out.write("                        \"sZeroRecords\":    \"Aucun &eacute;l&eacute;ment &agrave; afficher\",\n");
      out.write("                            \"sEmptyTable\":     \"Aucune donn&eacute;e disponible dans le tableau\",\n");
      out.write("                            \"oPaginate\": {\n");
      out.write("                                    \"sFirst\":      \"Premier\",\n");
      out.write("                                    \"sPrevious\":   \"Pr&eacute;c&eacute;dent\",\n");
      out.write("                                    \"sNext\":       \"Suivant\",\n");
      out.write("                                    \"sLast\":       \"Dernier\"\n");
      out.write("                            },\n");
      out.write("                            \"oAria\": {\n");
      out.write("                                    \"sSortAscending\":  \": activer pour trier la colonne par ordre croissant\",\n");
      out.write("                                    \"sSortDescending\": \": activer pour trier la colonne par ordre d&eacute;croissant\"\n");
      out.write("                            }\n");
      out.write("                    },\n");
      out.write("                \"pagingType\": \"full_numbers\" // Configure le type de pagination\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("  <!-- Template Main JS File -->\n");
      out.write("  <script src=\"JSfile/mainNew.js\"></script>\n");
      out.write("  <script src=\"JSfile/scripterror.js\"></script>\n");
      out.write("  <script src=\"dist/js/bootstrap.js\"></script>\n");
      out.write("  <script src=\"dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write('\n');
 
    Connection con = DBconnect.config.connect();
    ResultSet res = ajoutTerminer.triSiteCorrige(con);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main id=\"main\" class=\"main\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    <table class=\"table table-bordered\" id=\"monTableau\">\n");
      out.write("                        <caption>Liste des sites corrigés triés par mois</caption>\n");
      out.write("                        <thead class=\"table-secondary\">\n");
      out.write("                            <tr>    \n");
      out.write("                                <th scope=\"col\">Site</th>\n");
      out.write("                                <th scope=\"col\">DS</th>\n");
      out.write("                                <th scope=\"col\">PF</th>\n");
      out.write("                                <th scope=\"col\">Statut</th>\n");
      out.write("                                <th scope=\"col\" class=\"text-center\">Ticket</th>\n");
      out.write("                                <th scope=\"col\" class=\"text-center\">Commentaire</th>\n");
      out.write("                                <th scope=\"col\" class=\"text-center\">User</th>\n");
      out.write("                                <th scope=\"col\" class=\"text-center\">Mois de modification</th>\n");
      out.write("                                <th scope=\"col\" class=\"text-center\">Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                            ");
 while (res.next()) { 
      out.write("\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print( res.getString("SITE") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( res.getString("DS") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( res.getString("PF") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( res.getString("nomStatut") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( res.getString("Ticket") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( res.getString("commentaire") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( res.getString("username") );
      out.write("</td>\n");
      out.write("                                        <td>");

                                                java.util.Date date = res.getDate("dateTerminer");
                                                java.util.Calendar cal = java.util.Calendar.getInstance();
                                                cal.setTime(date);
                                                String monthName = new DateFormatSymbols().getMonths()[cal.get(java.util.Calendar.MONTH)];
                                                out.print(monthName);
                                            
      out.write("</td>\n");
      out.write("                                        <td class=\"d-flex justify-content-evenly\">\n");
      out.write("                                            <form method=\"post\" action=\"modifEtatsite\">\n");
      out.write("                                                <input type=\"hidden\" name=\"idtable1\" value=\"");
      out.print( res.getString("idSiteCorrige") );
      out.write("\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn\">\n");
      out.write("                                                    <i class=\"fa fa-times text-danger fa-2x\" aria-hidden=\"true\"></i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </form>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
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
