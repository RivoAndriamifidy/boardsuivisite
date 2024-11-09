<%-- 
    Document   : dashnew
    Created on : 12 avr. 2023, 20:28:11
    Author     : Rivo
--%>

<%@page import="Model.historiqueSeule"%>
<%@page import="Model.users"%>
<%@page import="DBconnect.config"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%   
    String PF=null;
    String username = (String) session.getAttribute("username");
    Connection Conn = DBconnect.config.connect();
    ResultSet vres = users.affichage(username,Conn);
    ResultSet kres = historiqueSeule.affichePF(PF, Conn);
%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Dashboard - QC MAINTENANCE</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
  
  <link href="CSSfile/styleNew.css" rel="stylesheet">
  <link rel="stylesheet" href="CSSfile/style.css">
  <link href="font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
  <link rel="shortcut icon" href="image/favicon.ico"/> 
    <link rel="stylesheet" href="dist/css/bootstrap.css">
  <!-- =======================================================
  * Template Name: NiceAdmin
  * Updated: Mar 09 2023 with Bootstrap v5.2.3
  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
  
  <style>
    *{font-size: 12px;}
  </style>
</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="header fixed-top d-flex align-items-center">

   <div class="d-flex align-items-center justify-content-between">
        <a href="#" class="logo d-flex align-items-center text-decoration-none text-dark">
            <span class="d-none d-lg-block ">
                <img src="image/logo.png">
            </span>
        </a>
        <i class="fa fa-bars toggle-sidebar-btn bouttonbars"></i>
    </div><!-- End Logo -->

    

    <nav class="header-nav ms-auto">
      
        <ul class="d-flex align-items-center">
        
        <!--Plateforme filtre-->

            <div class="col-auto plateformeFiltre me-4">
                <label class="visually-hidden" for="autoSizingSelect">Preference</label>

                <select class="form-select" id="platformFilter">
                    <option value="" selected>Plateforme</option>
                        <% while(kres.next()) { %>
                            <% String pfValue = kres.getString("PF"); %>
                            <option value="<%= pfValue %>"><%= pfValue %></option>
                        <% } %>

                </select>
            </div>
        
        
        <li class="nav-item dropdown">

          <a class="nav-link nav-icon" href="#" data-bs-toggle="dropdown">
            <i class="fa fa-bell-o" aria-hidden="true"></i>
            <span class="badge bg-primary badge-number">4</span>
          </a><!-- End Notification Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow notifications">
            <li class="dropdown-header">
              You have 4 new notifications
              <a href="#"><span class="badge rounded-pill bg-primary p-2 ms-2">View all</span></a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="notification-item">
              <i class="bi bi-exclamation-circle text-warning"></i>
              <div>
                <h4>Lorem Ipsum</h4>
                <p>Quae dolorem earum veritatis oditseno</p>
                <p>30 min. ago</p>
              </div>
            </li>

            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="notification-item">
              <i class="bi bi-x-circle text-danger"></i>
              <div>
                <h4>Atque rerum nesciunt</h4>
                <p>Quae dolorem earum veritatis oditseno</p>
                <p>1 hr. ago</p>
              </div>
            </li>

            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="notification-item">
              <i class="bi bi-check-circle text-success"></i>
              <div>
                <h4>Sit rerum fuga</h4>
                <p>Quae dolorem earum veritatis oditseno</p>
                <p>2 hrs. ago</p>
              </div>
            </li>

            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="notification-item">
              <i class="bi bi-info-circle text-primary"></i>
              <div>
                <h4>Dicta reprehenderit</h4>
                <p>Quae dolorem earum veritatis oditseno</p>
                <p>4 hrs. ago</p>
              </div>
            </li>

            <li>
              <hr class="dropdown-divider">
            </li>
            <li class="dropdown-footer">
              <a href="#">Show all notifications</a>
            </li>

          </ul><!-- End Notification Dropdown Items -->

        </li><!-- End Notification Nav -->

        <li class="nav-item dropdown">

            <a class="nav-link nav-icon" data-bs-toggle="dropdown">
                <a href="skype:skype: ?chat">
                    <img src="<%= request.getContextPath() %>/image/skype.jfif" alt="Icône Skype" style="width: 40px; height: 30px">
                </a>
            </a><!-- End Messages Icon -->
        </li><!-- End Messages Nav -->
    
            <!---- icon avec dropdown user--------------------->
           <div class="dropdown float-right">
          <% while (vres.next()){%>
          <span class="dropbtn">
            <img src="image/<% out.println(vres.getString("Photo"));%>" alt="" width="50px" style="border-radius: 50%;">
          </span>
          <div class="dropdown-content" style="border-radius: 20px">
            
                  <div class=" row">
                        <div class="col-lg-3 d-flex justify-content-center">
                            <img src="image/<% out.println(vres.getString("Photo"));%>" alt="" width="50px" style="border-radius: 50%;">
                        </div>
                        <div class="col-lg-9">
                            <b id="user"><% out.println(vres.getString("username"));%> </b><br>
                            <% out.println(vres.getString("email"));%>
                            <% String idUser = vres.getString("iduser"); %> 
                            <script>
                            var idUserJs = '<%= idUser %>';  
                            </script>
                        </div>
                    </div>
              <hr>   
              <a href="profile.jsp?edituser=<% out.println(vres.getString("username")); %>"><img src="image/editprofile.jpg" width="25px">  Edit profile</a>
              
              <hr>
              <form method="get" action="logout">
                  <a href="logout"><i class="fa fa-sign-out fa-2x" aria-hidden="true"></i>  Logout</a>
              </form>
              
            
          </div> 
      </ul>
    </nav><!-- End Icons Navigation -->

  </header><!-- End Header -->
  
  <!-- ======= Sidebar ======= -->
  <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-block bg-light sidebar collapse">
    <div class="position-sticky pt-3 sidebar-sticky">
  <aside id="sidebar" class="sidebar">

    <ul class="sidebar-nav" id="sidebar-nav">
    <li class="nav-heading">Gestion des sites</li>
      <%---<li class="nav-item">
        <a class="nav-link " href="#">
          <i class="fa fa-home" aria-hidden="true"></i>
          <span>Tableau de bord</span>
        </a>
      </li> End Dashboard Nav --%>

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#components-nav" data-bs-toggle="collapse" href="#">
          <i class="fa fa-globe" aria-hidden="true"></i><span>Site</span>
        </a>
        <ul id="components-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="siteEnCours.jsp"class="text-decoration-none">
              <i class="fa fa-circle-o" aria-hidden="true"></i><span>Traitement en cours</span>
            </a>
          </li>
          <li>
            <a href="sitecorrige.jsp" class="text-decoration-none">
              <i class="fa fa-circle-o" aria-hidden="true"></i><span>Deja traiter</span>
            </a>
          </li>
          <li>
            <a href="newjsp.jsp" class="text-decoration-none">
              <i class="fa fa-circle-o" aria-hidden="true"></i><span>A traiter</span>
            </a>
          </li>
          
        </ul>
      </li><!-- End Components Nav -->


      
      <li class="nav-heading">Gestion d'utilisateur</li>

      
      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#components-nav2" data-bs-toggle="collapse" >
          <i class="fa fa-user-circle-o" aria-hidden="true"></i><span>Utilisateur</span>
        </a>
          
        <ul id="components-nav2" class="nav-content collapse " data-bs-parent="#sidebar-nav">
            <li class="nav-item">
              <a class="nav-link collapsed"  href="profile.jsp?edituser=<% out.println(vres.getString("username")); %>">
                <i class="fa fa-user" aria-hidden="true"></i>
                <span>Profile</span>
              </a>
              <% } %>
            </li><!-- End Profile Page Nav -->


            <li class="nav-item">
              <a class="nav-link collapsed" href="userlist.jsp">
                  <i class="fa fa-users" aria-hidden="true"></i>
                <span>Liste des utilisateur</span>
              </a>
            </li><!-- End Contact Page Nav -->

            <li class="nav-item">
              <a class="nav-link collapsed" href="register.jsp">
                <i class="fa fa-user-plus" aria-hidden="true"></i>
                <span>Creer un utilisateur</span>
              </a>
            </li><!-- End Register Page Nav -->

            <li class="nav-item">
              <a class="nav-link collapsed" href="signin.jsp">
                <i class="fa fa-sign-in" aria-hidden="true"></i>
                <span>Se connecter</span>
              </a>
            </li><!-- End Login Page Nav -->
          
        </ul>
      </li><!-- End Components Nav -->
      
      
      
      


    </ul>

  </aside><!-- End Sidebar-->
</div>
</nav>
<script>
        $(document).ready(function() {
            $('#monTableau').DataTable({
                "language": {
                            "sProcessing":     "Traitement en cours...",
                            "sSearch":         "Rechercher&nbsp;:",
                        "sLengthMenu":     "Afficher _MENU_ &eacute;l&eacute;ments",
                            "sInfo":           "Affichage de l'&eacute;lement _START_ &agrave; _END_ sur _TOTAL_ &eacute;l&eacute;ments",
                            "sInfoEmpty":      "Affichage de l'&eacute;lement 0 &agrave; 0 sur 0 &eacute;l&eacute;ments",
                            "sInfoFiltered":   "(filtr&eacute; de _MAX_ &eacute;l&eacute;ments au total)",
                            "sInfoPostFix":    "",
                            "sLoadingRecords": "Chargement en cours...",
                        "sZeroRecords":    "Aucun &eacute;l&eacute;ment &agrave; afficher",
                            "sEmptyTable":     "Aucune donn&eacute;e disponible dans le tableau",
                            "oPaginate": {
                                    "sFirst":      "Premier",
                                    "sPrevious":   "Pr&eacute;c&eacute;dent",
                                    "sNext":       "Suivant",
                                    "sLast":       "Dernier"
                            },
                            "oAria": {
                                    "sSortAscending":  ": activer pour trier la colonne par ordre croissant",
                                    "sSortDescending": ": activer pour trier la colonne par ordre d&eacute;croissant"
                            }
                    },
                "pagingType": "full_numbers",
                "stateSave": true
                
            });
             var table = $('#monTableau').DataTable();

            $('#platformFilter').on('change', function() {
              var platform = $(this).val();

              table.column(3).search(platform).draw();
            });
        });
    </script>
  <!-- Template Main JS File -->
  <script src="JSfile/mainNew.js"></script>
  <script src="JSfile/scripterror.js"></script>
  <script src="dist/js/bootstrap.js"></script>
  <script src="dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>
