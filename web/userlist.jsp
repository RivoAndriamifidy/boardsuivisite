<%-- 
    Document   : contact.jsp
    Created on : 14 avr. 2023, 10:05:12
    Author     : Workdev
--%>
<%@page import="Model.users"%>
<%@page import="DBconnect.config"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%   
    Connection con = DBconnect.config.connect();
    ResultSet res = users.affichageTout(con);
%>
<%@ include file = "dashnew.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>user list</title>
  <meta content="" name="description">
  <meta content="" name="keywords">
  <link rel="shortcut icon" href="image/favicon.ico"/> 


</head>

<body>


  <main id="main" class="main">
    <div class="pagetitle mt-5">
      
            <h1>Liste des utilisateurs</h1>
            <nav>
              <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="">Home</a></li>
                <li class="breadcrumb-item">Pages</li>
                <li class="breadcrumb-item active">Liste des utilisateurs</li>
              </ol>
            </nav>
        
    
    </div><!-- End Page Title -->
        <div class="card">
            <div class="card-header">
                <div >
                      <a  class="d-flex justify-content-end text-decoration-none" data-bs-toggle="modal" href="#exampleModalToggle" role="button"><i class="fa fa-user-plus text-success fa-2x" aria-hidden="true"></i></a>
                </div>
                <table class="table table-bordered" id="monTableau">
                    <caption>Liste des utilisateur</caption>
                    <thead class="table-secondary">

                      <tr>
                        <th scope="col">Nom complet</th>                 
                        <th scope="col">Nom d'utilisateur</th>
                        <th scope="col">Mot de passe</th>
                        <th scope="col">Email</th>
                        <th scope="col">Type</th>
                        <th scope="col">Photo de profil</th>
                        <th scope="col" class="text-center">Action</th>

                      </tr>
                    </thead>
                    <tbody>
                         <% while (res.next()){%>
                      <tr>
                        <td><% out.println(res.getString("nomComplet"));%></td>
                        <td><a href="#historique" class="text-decoration-none"><% out.println(res.getString("username"));%></a></td>
                        <td><% out.println(res.getString("password"));%></td>
                        <td><% out.println(res.getString("email"));%></td>
                        <td><% out.println(res.getString("typeUser"));%></td>
                        <td class="text-center">
                            <img src="image/<% out.println(res.getString("Photo"));%>" alt="" width="30px" style="border-radius: 50%;">
                        </td>
                        <td class="d-flex justify-content-evenly">
                          <a href="profile.jsp?edituser=<% out.println(res.getString("username")); %>"  ><i class="fa fa-pencil-square-o text-primary fa-2x" aria-hidden="true"></i></a>
                        </td>
                      </tr>
                      <% } %>
                    </tbody>
                </table>
            </div>
        </div>
                    
                    
         <div class="modal fade" id="exampleModalToggle" aria-hidden="true" aria-labelledby="exampleModalToggleLabel" tabindex="-1">
            <div class="modal-dialog modal-dialog-centered modal-lg">
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                  <section class="section register  d-flex flex-column align-items-center justify-content-center ">
                    <div class="container">
                      <div class="row justify-content-center">

                          <!-- <div class="d-flex justify-content-center py-4">
                            <span href="" class="logo d-flex align-items-center w-auto">
                              <span class="d-none d-lg-block  ">Creer un utilisateur</span>
                            </span>
                          </div>End Logo -->

                          <div class="card mb-5 mt-5">

                            <div class="card-body">

                              <div class="pt-4 pb-2  text-light" style="background-color: #c6c6c9;">
                                <h5 class="card-title text-center pb-0 fs-4 text-dark">Creer un utilisateur</h5>
                                <p class="text-center small">Entrez des informations personnelles pour créer un compte</p>
                              </div>

                              <form action="login" method="POST">

                                    <div class="row mb-3 mt-3">
                                        <label for="fullName" class="col-md-5 col-lg-3 col-form-label">Nom complet</label>
                                        <div class="col-md-7 col-lg-9">
                                            <input name = "nomComplet" type="text" class="form-control" id="nomComplet" placeholder="Nom complet" required>
                                            <span id="champVidenomComplet" style="display: none; color:red;">Veuillez compléter le champ requis pour pouvoir continuer.</span>
                                        </div>

                                    </div>

                                     <div class="row mb-3 mt-3">
                                        <label for="fullName" class="col-md-5 col-lg-3 col-form-label">Nom d'utilisateur</label>
                                        <div class="col-md-7 col-lg-9">
                                            <input name = "username" type="text" class="form-control" id="username" placeholder="Nom d'utilisateur" required>
                                            <span id="champVideusername" style="display: none; color:red;">Veuillez compléter le champ requis pour pouvoir continuer.</span>
                                        </div>

                                    </div>

                                    <div class="row mb-3 mt-3">
                                        <label for="fullName" class="col-md-5 col-lg-3 col-form-label">Email</label>
                                        <div class="col-md-7 col-lg-9">
                                            <input type="email" name ="email" class="form-control" id="email" placeholder="email" required>
                                            <span id="email-error" style="display: none; color:red;">Veuillez entrer un email valide.</span>
                                        </div>
                                    </div>

                                    <div class="row mb-3 mt-3">
                                        <label for="fullName" class="col-md-5 col-lg-3 col-form-label">Telephone</label>
                                        <div class="col-md-7 col-lg-9">
                                            <input name = "Telephone" type="tel" class="form-control" id="phone" placeholder="Telephone" maxlength="10"  required>
                                            <span id="phone-error" style="display: none; color:red;">Veuillez entrer un numéro de téléphone valide.</span>
                                        </div>
                                    </div>

                                    <div class="row mb-3 mt-3">
                                        <label for="fullName" class="col-md-5 col-lg-3 col-form-label">Adresse</label>
                                        <div class="col-md-7 col-lg-9">
                                            <input name = "Adresse" type="text" class="form-control" id="Adresse" placeholder="Adresse" required>
                                            <span id="champVideAdresse" style="display: none; color:red;">Veuillez compléter le champ requis pour pouvoir continuer.</span>
                                        </div>
                                    </div>

                                    <div class="input-group mt-2">
                                        <input name="Photo" type="file" class="form-control" id="inputGroupFile04" aria-describedby="inputGroupFileAddon04" aria-label="Upload">
                                    </div>  

                                    <div class="row mb-3 mt-3">
                                        <label for="fullName" class="col-md-5 col-lg-3 col-form-label">Mot de passe</label>
                                        <div class="col-md-7 col-lg-9">
                                            <input type="password" name ="password" class="form-control" id="motDePasse" placeholder="Mot de passe" required>
                                            <span id="mdp-error" style="display: none; color:red;">
                                            Le mot de passe doit contenir au moins une lettre majuscule et une lettre minuscule, ainsi qu'avoir une longueur minimale de 8 caractères. Par exemple : « Abcdefg1 ».
                                            </span>
                                        </div>
                                    </div>

                                    <div class="row mb-3 mt-3">
                                        <label for="fullName" class="col-md-5 col-lg-3 col-form-label">Confirmer mot de passe</label>
                                        <div class="col-md-7 col-lg-9">
                                            <input type="password" name ="confpassword" class="form-control" id="floatingPassword" placeholder="Confirmer mot de passe" required>
                                        </div>
                                    </div>
                                <div class="row mt-2">

                                    <div class="col-lg-4">
                                        <label for="fullName" >Type d'utilisateur</label>
                                    </div>

                                    <div class="form-check col-lg-4">
                                        <input class="form-check-input" type="radio" name="typeUser" id="flexRadioDefault1" value="Admin">
                                        <label class="form-check-label" for="flexRadioDefault1">
                                          Admin
                                        </label>
                                    </div>
                                    <div class="form-check col-lg-4">
                                      <input class="form-check-input" type="radio" name="typeUser" id="flexRadioDefault2" value ="Utilisateur simple" checked>
                                      <label class="form-check-label" for="flexRadioDefault2">
                                        Utilisateur simple
                                      </label>
                                    </div>
                                </div>  
                                <div class="row">
                                    <div >
                                      <button class="btn-color mt-2 w-100 "  type="submit" onclick="validateForm()">Valider</button>

                                    </div>
                                </div>  
                            </form>

                            </div>
                          </div>


                      </div>
                    </div>

                  </section>
                </div>
              </div>
            </div>
          </div>
          
  </main><!-- End #main -->

</body>

</html>
