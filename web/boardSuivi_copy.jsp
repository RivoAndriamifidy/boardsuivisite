<%-- 
    Document   : dashnew
    Created on : 12 avr. 2023, 20:28:11
    Author     : Rivo
--%>
<%@page import="java.util.List"%>
<%@page import="java.time.LocalDate"%>
<%@page import="Model.historiqueSeule"%>
<%@page import="Model.afficheSite"%>
<%@page import="Model.users"%>
<%@page import="DBconnect.config"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%   
    int SKU_VIDE=0;
    int SKU_EGAL_MPN=0;
    int SKU_EGAL_EAN=0;
    int MPN_EAN=0;
    int MODEL_EGAL_MPN=0;
    int BRAND_EGAL_MPN=0;
    int MODEL_EGAL_BRAND=0;
    int EAN_DIFF_13=0;
    int SKU_INF_4=0;
    int MPN_INF_4=0;
    int PRICE_INFEGAL_0=0;
    int PREVIEWS_PRICE_INF_PRICE=0;
    int DELIVERY_PRICE_SUP_PRICE=0;
    int EAN_NON_DIGIT=0;
    int MPN_NUMERIQ=0;
    int MPN_ALPHABETIQUE=0;
    int idStatut=0;
    String PF=null;
    String username = (String) session.getAttribute("username");
    Connection Conn = DBconnect.config.connect();
    ResultSet vres = users.affichage(username,Conn);
    ResultSet res = afficheSite.test(SKU_VIDE,SKU_EGAL_MPN,SKU_EGAL_EAN,MPN_EAN,MODEL_EGAL_MPN,BRAND_EGAL_MPN,MODEL_EGAL_BRAND,EAN_DIFF_13,SKU_INF_4,MPN_INF_4,PRICE_INFEGAL_0,PREVIEWS_PRICE_INF_PRICE,DELIVERY_PRICE_SUP_PRICE,EAN_NON_DIGIT,MPN_NUMERIQ,MPN_ALPHABETIQUE,idStatut,Conn);
    ResultSet kres = historiqueSeule.affichePF(PF, Conn);
    
    String Statut = request.getParameter("selectName");
    if(Statut != null){
        session.setAttribute("selectName",Statut);
    }else{
        Statut = (String) session.getAttribute("selectName");
    }
%>

<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <title>Board suivi site</title>
  <meta content="" name="description">
  <meta content="" name="keywords">
  
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
  
  <link href="CSSfile/styleNew.css" rel="stylesheet">
  <link rel="stylesheet" href="CSSfile/style.css">
  <link href="font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
  <link rel="shortcut icon" href="image/favicon.ico"/> 

  <!-- =======================================================
  * Template Name: NiceAdmin
  * Updated: Mar 09 2023 with Bootstrap v5.2.3
  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
  <link rel="stylesheet" href="dist/css/bootstrap.css">
  
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
    
    
        <nav class="header-nav ms-auto ">
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

            <a class="nav-link nav-icon" data-bs-toggle="dropdown">
                <a href="skype:skype: ?chat">
                    <img src="<%= request.getContextPath() %>/image/skype.jfif" alt="Icône Skype" style="width: 40px; height: 30px">
                </a>
            </a><!-- End Messages Icon -->
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
                            <b id="user"><% out.println(vres.getString("username"));%> </b><br>
                            <% out.println(vres.getString("email"));%>
                            <% String idUser = vres.getString("iduser"); %> 
                            <script>
                            var idUserJs = '<%= idUser %>';  
                            </script>
                        </div>
                    </div>
                <hr> 

                <a  href="profileUser.jsp?edituser=<% out.println(vres.getString("username")); %>"><img src="image/editprofile.jpg" width="25px" id="#exampleModalToggle">  Votre profil</a>

                <hr>
                <form method="get" action="logout">
                    <a href="logout"><i class="fa fa-sign-out fa-2x" aria-hidden="true"></i>  Deconnection</a>
                </form>

              
            </div>
      </div>
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
              <a href="listeEffectuee.jsp?getiduser=<% out.println(vres.getString("iduser")); %>"class="text-decoration-none">
              <i class="fa fa-circle-o" aria-hidden="true"></i><span>Verification de travail effectuée</span>
            </a>
          </li>
          <li>
            <a href="historiqueTous.jsp" class="text-decoration-none">
              <i class="fa fa-circle-o" aria-hidden="true"></i><span>Historiques</span>
            </a>
          </li>
          <li>
            <a href="#" class="text-decoration-none">
              <i class="fa fa-circle-o" aria-hidden="true"></i><span>Triage</span>
            </a>
          </li>
          
        </ul>
      </li><!-- End Components Nav -->


      
      <li class="nav-heading">Gestion d'utilisateur</li>

      
      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#components-nav2" data-bs-toggle="collapse" >
          <i class="fa fa-user-circle-o" aria-hidden="true"></i><span>Mon compte</span>
        </a>
          
        <ul id="components-nav2" class="nav-content collapse " data-bs-parent="#sidebar-nav">
            <li class="nav-item">
              <a class="nav-link collapsed"  href="profileUser.jsp?edituser=<% out.println(vres.getString("username")); %>">
                <i class="fa fa-user" aria-hidden="true"></i>
                <span>Modifier profile</span>
              </a>
            </li><!-- End Profile Page Nav -->
        </ul>
      </li><!-- End Components Nav -->
      
  <% } %>    
      
      


    </ul>

  </aside><!-- End Sidebar-->
</div>
</nav>
  
</div>


<main id="main" class="main">
<!-- board suivi site main -->
    <div class="pagetitle titreDash">
      
        <h1>Liste des sites à traiter</h1>
        <nav>
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="">Site</a></li>
              <li class="breadcrumb-item active">A traiter</li>
            </ol>
        </nav>
    </div><!-- End Page Title -->
    <!-- tableau avec site erreur------------------------------------------------------------------------->
    
        <div class="container-fluid">
          <div class="container">
            <div class="table-responsive">
              <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-table mr-1"></i>
                     taches à faire
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-bordered" id="monTableau" width="100%" cellspacing="0">
                            <thead class="table-secondary text-center">
                              <tr>
                                <th >Date</th>
                                <th >Site</th>
                                <th >DS</th>
                                <th >Plateforme</th>
                                <th>Statut</th>
                                <th>Ticket</th>
                                <th>Commentaire</th>
                                <th>User</th>
                                <th style="display: none"></th>
                              </tr>
                            </thead>

                             <tbody class="text-center">
                                <% int nombre =0; %>
                                <% while (res.next()){%>
                                <% 
                                    String idtable=(res.getString("idtable1"));
                                    int entierId = Integer.parseInt(idtable);
                                    String liste = "ligne";
                                    String id = liste+idtable;
                                    String user = "users,";
                                    String users= user+idtable;
                                    nombre= entierId+1;
                                    String ticket = "ticket"+idtable;
                                    String commentaire = "coms"+idtable;
                                    
                                    String userr = "id";
                                    String userrs= userr+idtable;
                                    String idStat = (res.getString("idStatut"));
                                    int idStatu = Integer.parseInt(idStat);
                                %>

                                  <tr id="<%=id%>" title="<%=idtable%>" class="tableau">
                                    <form action="SaveItemServlet" method="POST">
                                        <td ><% out.println(res.getString("DATES"));%></td>
                                        <td name="site"><a id="historique" href="historique.jsp?nomSite=<% out.println(res.getString("SITE"));%>"  class="text-decoration-none"><% out.println(res.getString("SITE"));%></a></td>

                                        <td><% out.println(res.getString("DS"));%></td>
                                        <td><% out.println(res.getString("PF"));%></td>
                                        <td>
                                                <select title="<%= users %>" onclick="handleClick(event)"  class="form-control text-center  Statut" name="selectName" id="<%= users %>" onchange="saveItem()" style="font-size: 12px;">
                                                    <option title="<%= users %>" value="1">A faire</option>    
                                                    <option title="<%= users %>" value="2">En cours</option>    
                                                    <option title="<%= users %>" value="3">En attente</option>
                                                    <option  title="<%= users %>" value="4">Terminer</option>
                                                </select>
                                        </td>
                                     
                                        <td><input id="<%=ticket%>" name="Num_Ticket"  type="text" placeholder="" class="ms-2 me-2 form-control"   style="font-size: 12px"></td>


                                        <td><input id="<%=commentaire%>" name="commentaire"  type="text" placeholder="" class="form-control"   style="font-size: 12px"></td>
                                        <% String userVide1 = res.getString("username"); 
                                            String userVide2 = res.getString("username");
                                            if (userVide1 == null){
                                                String uservide1 = " ";
                                        %>
                                            <td name="users"><%= uservide1 %></td>
                                        <%
                                            }else{ %>
                                                <td name="users"><%= userVide2 %></td>
                                        <%}%>    
                                        <td style="display:none"> <div id="<%=userrs%>"> <% out.println(res.getString("idStatut"));%> </div></td>
                                  </form>
                                  </tr> 

                              <% } %>
                                </tbody>
                              </table>
                <!-- pagination -->
                
           </div> 
          </div>
    
    </div>
   </div>

  </div>
</div>                                   
  <!-- Template Main JS File -->
</main>
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
  <script src="JSfile/mainNew.js"></script>
  <script src="dist/js/bootstrap.js"></script>
  <script src="dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>
