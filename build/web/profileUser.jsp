<%-- 
    Document   : profile.jsp
    Created on : 14 avr. 2023, 09:44:26
    Author     : Workdev
--%>
<%@page import="Model.users"%>
<%@page import="DBconnect.config"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%   
    String nomUser = (String) session.getAttribute("username");
    Connection connect = DBconnect.config.connect();
     ResultSet vres = users.affichage(nomUser,connect);
    ResultSet rs = users.affichage(request.getParameter("edituser"),connect);
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
              <li class="breadcrumb-item active">Votre Profil</li>
            </ol>
        </nav>
        <h1>Detail de votre profil</h1>

    </div><!-- End Page Title -->

    <section class="section profile">
      <div class="row">
        <div class="col-xl-4">

          <div class="card">
            <div class="card-body profile-card pt-4 d-flex flex-column align-items-center">
            <% while (rs.next()){ %>
            <img src="image/<% out.println(rs.getString("Photo")); %>" alt="" width="50px" style="border-radius: 50%;">
            <span style="width: 15px; height: 15px; border: 1px solid salmon"><i class="fa fa-pencil justify-content-center" aria-hidden="true" ></i></span>
              
              <h2><% out.println(rs.getString("username")); %></h2>
              <strong class="mb-2"><% out.println(rs.getString("email")); %></strong>
              <caption><% out.println(rs.getString("typeUser")); %></caption>
              
              <div class="social-links mt-2">
                <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
                <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
                <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
                <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></a>
              </div>
            </div>
          </div>

        </div>

        <div class="col-xl-8">

          <div class="card">
            <div class="card-body pt-3">
              <!-- Bordered Tabs -->
              <ul class="nav nav-tabs nav-tabs-bordered">

                <li class="nav-item">
                  <button class="nav-link active" data-bs-toggle="tab" data-bs-target="#profile-overview">Aperçu</button>
                </li>

                <li class="nav-item">
                  <button class="nav-link" data-bs-toggle="tab" data-bs-target="#profile-edit">Modifier le profil</button>
                </li>

                <li class="nav-item">
                  <button class="nav-link" data-bs-toggle="tab" data-bs-target="#profile-change-password">Modifier le mot de passe</button>
                </li>

              </ul>
              <div class="tab-content pt-2">

                <div class="tab-pane fade show active profile-overview" id="profile-overview">
            

                  <h5 class="card-title">Détails du profil</h5>
                    
                  <div class="row">
                    <div class="col-lg-3 col-md-4 label ">Nom</div>
                    
                    <div class="col-lg-9 col-md-8"><% out.println(rs.getString("username")); %></div>
                     
                  </div>
                   
                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Societe</div>
                    <div class="col-lg-9 col-md-8">Value-IT</div>
                  </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Type d'utilisateur</div>
                    
                    <div class="col-lg-9 col-md-8"><% out.println(rs.getString("typeUser")); %></div>
                    
                  </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Pays</div>
                    <div class="col-lg-9 col-md-8">Madagascar</div>
                  </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Addresse</div>
                    <div class="col-lg-9 col-md-8">A108 tsahay,  535022</div>
                  </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Telephone</div>
                    <div class="col-lg-9 col-md-8">034 78 123 45</div>
                  </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Email</div>
                    
                    <div class="col-lg-9 col-md-8"><% out.println(rs.getString("email")); %></div>
                    
                  </div>

                </div>

                <div class="tab-pane fade profile-edit pt-3" id="profile-edit">

                  <!-- Profile Edit Form -->
                  <form action="updateProfilUser" method="POST">
                                 
                    <div class="row mb-3 " style="display: none">
                        <label for="iduser" class="col-md-4 col-lg-3 col-form-label">id</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="iduser" type="text" class="form-control" value="<% out.println(rs.getString("iduser")); %>">
                        </div>
                    </div>
                      
                    <div class="row mb-3">
                      <label for="Address" class="col-md-4 col-lg-3 col-form-label">Adresse</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="Adresse" type="text" class="form-control" id="Address" value="<% out.println(rs.getString("Adresse")); %>">
                      </div>
                    </div>

                    <div class="row mb-3">
                      <label for="Phone" class="col-md-4 col-lg-3 col-form-label">Telephone</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="Telephone" type="text" class="form-control" id="Phone" value="<% out.println(rs.getString("Telephone")); %>">
                      </div>
                    </div>

                    <div class="text-center">
                      <button type="submit" class="btn btn-primary">Sauvegarder les modifications</button>
                    </div>
                  </form><!-- End Profile Edit Form -->
                 
                </div>
                <div class="tab-pane fade pt-3" id="profile-change-password">
                  <!-- Change Password Form -->
                  
                  
                  <form action="updateMdpUser" method="POST" >
                      
                    <div class="row mb-3 " style="display: none">
                        <label for="iduser" class="col-md-4 col-lg-3 col-form-label">id</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="iduser" type="text" class="form-control" value="<% out.println(rs.getString("iduser")); %>">
                        </div>
                    </div>
                     
                    <div class="row mb-3">
                        <label for="newPassword" class="col-md-4 col-lg-3 col-form-label">Nouveau mot de passe</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="newpassword" type="password" class="form-control" id="newPassword">
                        </div>
                    </div>

                    <div class="row mb-3">
                        <label for="renewPassword" class="col-md-4 col-lg-3 col-form-label">Confirmer le nouveau mot de passe</label>
                        <div class="col-md-8 col-lg-9">
                            <input name="renewpassword" type="password" class="form-control" id="renewPassword">
                        </div>
                    </div>
                      
                    <div class="text-center">
                      <button type="submit" class="btn btn-primary">Change Password</button>
                    </div>
                    
                  </form><!-- End Change Password Form -->
                  
                       <% } %>

                </div>

              </div><!-- End Bordered Tabs -->

            </div>
          </div>

        </div>
      </div>
    </section>
</div>
  <script src="JSfile/scripterror.js"></script>
  <script src="dist/js/bootstrap.js"></script>
  <script src="dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>
