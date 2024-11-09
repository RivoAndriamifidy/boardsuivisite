<%-- 
    Document   : sitecorrige
    Created on : 11 mai 2023, 08:21:20
    Author     : Workdev
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Model.users"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.ajoutTerminer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    String username = (String) session.getAttribute("username");
    Connection Conn = DBconnect.config.connect();
    ResultSet vres = users.affichage(username,Conn);
    ResultSet resul = ajoutTerminer.listeEffectueUser(request.getParameter("getiduser"), Conn);

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>historique  de <%= request.getParameter("username") %></title>
        <link href="CSSfile/styleNew.css" rel="stylesheet">
        <link rel="stylesheet" href="CSSfile/style.css">
        <link rel="stylesheet" href="dist/css/bootstrap.css">
        <link href="font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
        <link rel="shortcut icon" href="image/favicon.ico"/> 
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
    </head>
    
        <!-- tableau historique dun site ---------------------------------------------------------------------------------- -->
   
<body style="font-size: 11px">
        <header id="header" class="header fixed-top d-flex align-items-center">

    <div class="d-flex align-items-center justify-content-between">
      <a href="#" class="logo d-flex align-items-center text-decoration-none text-dark">
          <span class="d-none d-lg-block ">
              <img src="image/logo.png">
          </span>
      </a>
    
    </div><!-- End Logo -->
    <a href="boardSuivi_copy.jsp"><i class="fa fa-reply bouttonbars" aria-hidden="true"></i>

    
    
    <nav class="header-nav ms-auto">
        
      <ul class="d-flex align-items-center " >
        

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

          <a class="nav-link nav-icon" href="#" data-bs-toggle="dropdown">
            <i class="fa fa-twitch" aria-hidden="true"></i>
            <span class="badge bg-success badge-number">3</span>
          </a><!-- End Messages Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow messages">
            <li class="dropdown-header">
              You have 3 new messages
              <a href="#"><span class="badge rounded-pill bg-primary p-2 ms-2">View all</span></a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="message-item">
              <a href="#">
                <img src="assets/img/messages-1.jpg" alt="" class="rounded-circle">
                <div>
                  <h4>Maria Hudson</h4>
                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>
                  <p>4 hrs. ago</p>
                </div>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="message-item">
              <a href="#">
                <img src="assets/img/messages-2.jpg" alt="" class="rounded-circle">
                <div>
                  <h4>Anna Nelson</h4>
                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>
                  <p>6 hrs. ago</p>
                </div>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="message-item">
              <a href="#">
                <img src="assets/img/messages-3.jpg" alt="" class="rounded-circle">
                <div>
                  <h4>David Muldon</h4>
                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>
                  <p>8 hrs. ago</p>
                </div>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="dropdown-footer">
              <a href="#">Show all messages</a>
            </li>

          </ul><!-- End Messages Dropdown Items -->

        </li><!-- End Messages Nav -->
          
         
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
                          <b id="user"><% out.println(vres.getString("username"));%></b><br>
                          <% out.println(vres.getString("email"));%>
                      </div>
                  </div>
              <hr>   
              <a href="#"><img src="image/editprofile.jpg" width="25px">  Edit profile</a>
              <hr>
              <form method="get" action="logout">
                  <a href="logout"><img src="image/logout.png " width="25px">  Logout</a>
              </form>
              
            <% } %>
          </div>

              
      </div>
    </nav><!-- End Icons Navigation -->

  </header><!-- End Header -->
        <div class="container">
            <div class="pagetitle titreDash1 ">
                <nav>
                    <ol class="breadcrumb">
                      <li class="breadcrumb-item"><a href="boardSuivi_copy.jsp">Board</a></li>
                      <li class="breadcrumb-item active">Verification</li>
                    </ol>
                </nav>
                <h1>Verification des sites effectuées</h1>
                
            </div><!-- End Page Title -->
            <div class="card">
                <div class="card-header">
                    <table class="table table-bordered" id="monTableau">
                        <thead class="table-secondary">
                          <tr>
                                <th>Date d'entrée</th>
                                <th scope="col">Site</th>
                                <th scope="col">DS</th>
                                <th scope="col">PF</th>
                                <th scope="col">Statut</th>
                                <th scope="col" class="text-center">Ticket</th>
                                <th scope="col" class="text-center">Commentaire</th>
                                <th scope="col" class="text-center">User</th>
                                <th scope="col" class="text-center">Date de modification</th>
                          </tr>
                        </thead>

                        <tbody>
                            <% while (resul.next()) { %>
                            <tr>
                                <td><%= resul.getString("DATES") %></td>
                                <td><%= resul.getString("SITE") %></td>
                                <td><%= resul.getString("DS") %></td>
                                <td><%= resul.getString("PF") %></td>
                                <td><%= resul.getString("nomStatut") %></td>
                                <td><%= resul.getString("Ticket") %></td>
                                <td><%= resul.getString("commentaire") %></td>
                                <td><%= resul.getString("username") %></td>
                                <%
                                    java.sql.Timestamp timestamp = resul.getTimestamp("dateTerminer");
                                    LocalDateTime dateTime = timestamp.toLocalDateTime();
                                    String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss"));
                                %>
                                <td><%= formattedDateTime %></td>

                            </tr>
                            <% } %>
                        </tbody>

                    </table>
                </div>
            </div>
        </div>
    <script>
        $(document).ready(function() {
            $('#monTableau').DataTable({
              "language": {
                "sProcessing": "Traitement en cours...",
                "sSearch": "Rechercher&nbsp;:",
                "sLengthMenu": "Afficher _MENU_ &eacute;l&eacute;ments",
                "sInfo": "Affichage de l'&eacute;lement _START_ &agrave; _END_ sur _TOTAL_ &eacute;l&eacute;ments",
                "sInfoEmpty": "Affichage de l'&eacute;lement 0 &agrave; 0 sur 0 &eacute;l&eacute;ments",
                "sInfoFiltered": "(filtr&eacute; de _MAX_ &eacute;l&eacute;ments au total)",
                "sInfoPostFix": "",
                "sLoadingRecords": "Chargement en cours...",
                "sZeroRecords": "Aucun &eacute;l&eacute;ment &agrave; afficher",
                "sEmptyTable": "Aucune donn&eacute;e disponible dans le tableau",
                "oPaginate": {
                  "sFirst": "Premier",
                  "sPrevious": "Pr&eacute;c&eacute;dent",
                  "sNext": "Suivant",
                  "sLast": "Dernier"
                },
                "oAria": {
                  "sSortAscending": ": activer pour trier la colonne par ordre croissant",
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
    </body>
</html>
