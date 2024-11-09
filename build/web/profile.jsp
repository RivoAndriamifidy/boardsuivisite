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
    Connection connect = DBconnect.config.connect();
    ResultSet rs = users.affichage(request.getParameter("edituser"),connect);
%>

<%@ include file = "dashnew.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Profil</title>
  <meta content="" name="description">
  <meta content="" name="keywords">
  <link rel="shortcut icon" href="image/favicon.ico"/> 
 
</head>

<body>



  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Profil</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.html">Tableau de bord</a></li>
          <li class="breadcrumb-item">Utilisateur</li>
          <li class="breadcrumb-item active">Profil</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section profile">
      <div class="row">
        <div class="col-xl-4">

          <div class="card">
            <div class="card-body profile-card pt-4 d-flex flex-column align-items-center">
            <% while (rs.next()){ %>
              <img src="image/<% out.println(rs.getString("Photo")); %>" alt="" width="50px" style="border-radius: 50%;">
              
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
                    
                    <div class="col-lg-9 col-md-8"><% out.println(rs.getString("nomComplet")); %></div>
                     
                  </div>
                   
                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Nom d'utilisateur</div>
                    <div class="col-lg-9 col-md-8"><% out.println(rs.getString("username")); %></div>
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
                    <div class="col-lg-9 col-md-8"><% out.println(rs.getString("Adresse")); %></div>
                  </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Telephone</div>
                    <div class="col-lg-9 col-md-8"><% out.println(rs.getString("Telephone")); %></div>
                  </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Email</div>
                    
                    <div class="col-lg-9 col-md-8"><% out.println(rs.getString("email")); %></div>
                    
                  </div>

                </div>

                <div class="tab-pane fade profile-edit pt-3" id="profile-edit">

                  <!-- Profile Edit Form -->
                    <form action="updateProfil" method="POST">
                        <div class="row mb-3 " style="display: none">
                            <label for="iduser" class="col-md-4 col-lg-3 col-form-label">id</label>
                            <div class="col-md-8 col-lg-9">
                              <input name="iduser" type="text" class="form-control" value="<% out.println(rs.getString("iduser")); %>">
                            </div>
                        </div>
                        <div class="row mb-3">
                          <label for="profileImage" class="col-md-4 col-lg-3 col-form-label">Photo de profile</label>
                          <div class="col-md-8 col-lg-9">
                            <img src="image/<% out.println(rs.getString("photo")); %>" alt="Profile" width="50px" style="border-radius: 50%;">
                            <div class="pt-2">
                              <a href="#" class="btn btn-primary btn-sm" title="Upload new profile image"><i class="bi bi-upload"></i></a>
                              <a href="#" class="btn btn-danger btn-sm" title="Remove my profile image"><i class="bi bi-trash"></i></a>
                            </div>
                          </div>
                        </div>

                        <div class="row mb-3">
                          <label for="fullName" class="col-md-4 col-lg-3 col-form-label">Nom complet</label>
                          <div class="col-md-8 col-lg-9">
                            <input name="nomComplet" type="text" class="form-control" id="fullName" value="<% out.println(rs.getString("nomComplet")); %>">
                          </div>
                        </div>

                        <div class="row mb-3">
                          <label for="" class="col-md-4 col-lg-3 col-form-label">Nom d'utilisateur</label>
                          <div class="col-md-8 col-lg-9">
                            <input name="username" type="text" class="form-control" id="fullName" value="<% out.println(rs.getString("username")); %>">
                          </div>
                        </div>

                        <div class="row mb-3">
                          <label for="company" class="col-md-4 col-lg-3 col-form-label">Societe</label>
                          <div class="col-md-8 col-lg-9">
                            <input name="company" type="text" class="form-control" id="company" value="Value-IT" disabled>
                          </div>
                        </div>

                        <div class="row mb-3">
                          <label for="Country" class="col-md-4 col-lg-3 col-form-label">Pays</label>
                          <div class="col-md-8 col-lg-9">
                            <input name="country" type="text" class="form-control" id="Country" value="Madagascar" disabled>
                          </div>
                        </div>

                        <div class="row mb-3">
                          <label for="Address" class="col-md-4 col-lg-3 col-form-label">Addresse</label>
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
                        <div class="row mb-3">
                          <label for="Email" class="col-md-4 col-lg-3 col-form-label">Email</label>
                          <div class="col-md-8 col-lg-9">
                            <input name="email" type="email" class="form-control" id="Email" value="<% out.println(rs.getString("email")); %>">
                          </div>
                        </div>
                        <div class="row mb-3">
                            <label for="" class="col-md-4 col-lg-4 col-form-label">Type d'utilisateur</label>
                            <div class="form-check col-lg-4">
                                <input class="form-check-input" type="radio" name="typeUser" id="flexRadioDefault1" value="Admin"
                                 <% String typeUser1 = "Admin";
                                        if(typeUser1.equals(rs.getString("typeUser"))){%>
                                            Checked
                                    <% } %> >
                                <label class="form-check-label" for="flexRadioDefault1">
                                  Admin
                                </label>
                            </div>
                            <div class="form-check col-lg-4">
                              <input class="form-check-input" type="radio" name="typeUser" id="flexRadioDefault2" value ="utilisateur simple"
                                    <% String typeUser = "Utilisateur simple";
                                        if(typeUser.equals(rs.getString("typeUser"))){%>
                                            Checked
                                    <% } %> >
                              <label class="form-check-label" for="flexRadioDefault2">
                                Utilisateur simple
                              </label>
                            </div>
                        </div> 
                        <div class="text-center">
                          <button type="submit" class="btn btn-primary" onclick="validateForm()">Sauvegarder les modifications</button>
                        </div>
                    </form><!-- End Profile Edit Form -->
                 
                </div>
                <div class="tab-pane fade pt-3" id="profile-change-password">
                  <!-- Change Password Form -->
                  
                  
                  <form action="ModifMDP" method="POST" >
                      
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

  </main><!-- End #main -->
  
</body>

</html>
