<%-- 
    Document   : register.jsp
    Created on : 14 avr. 2023, 09:30:05
    Author     : Workdev
--%>




<%@ include file = "dashnew.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    String erreurMessage = (String) session.getAttribute("erreurMessage");
    session.removeAttribute("erreurMessage"); // Supprime la variable d'erreur de la session pour la prochaine requête
%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Pages / Register - NiceAdmin Bootstrap Template</title>
  <meta content="" name="description">
  <meta content="" name="keywords">
  <link rel="shortcut icon" href="image/favicon.ico"/> 
  

</head>

<body>

  <main id="main" class="main">
      <div class="pagetitle mt-5">
      
            <h1>Creer un utilisateur</h1>
            <nav>
              <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="">Utilisateur</a></li>
                <li class="breadcrumb-item">Creer un Utilisateur</li>
                <li class="breadcrumb-item active">Entrez des informations personnelles pour créer un compte</li>
              </ol>
            </nav>
        
    
    </div><!-- End Page Title -->
    
      <%-- Affiche le message d'erreur s'il est présent --%>
        <%
            if (erreurMessage != null && !erreurMessage.isEmpty()) {
        %>
            <div class="text-center alert alert-danger">
                <%= erreurMessage %>
            </div>
        <%
            }
        %>
    <div class="container">

      <section class="section register  d-flex flex-column align-items-center justify-content-center ">
        <div class="container">
          <div class="row justify-content-center">

              <!-- <div class="d-flex justify-content-center py-4">
                <span href="" class="logo d-flex align-items-center w-auto">
                  <span class="d-none d-lg-block  ">Creer un utilisateur</span>
                </span>
              </div>End Logo -->

              <div class="card mb-5 ">

                <div class="card-body">

                  <form action="login" method="POST" enctype="multipart/form-data">
                      
                        <div class="row mb-3 mt-3">
                            <label for="fullName" class="col-md-5 col-lg-2 col-form-label">Nom complet</label>
                            <div class="col-md-7 col-lg-10">
                                <input name = "nomComplet" type="text" class="form-control" id="nomComplet" placeholder="Nom complet" required>
                                <span id="champVidenomComplet" style="display: none; color:red;">Veuillez compléter le champ requis pour pouvoir continuer.</span>
                            </div>
                            
                        </div>
                      
                         <div class="row mb-3 mt-3">
                            <label for="fullName" class="col-md-5 col-lg-2 col-form-label">Nom d'utilisateur</label>
                            <div class="col-md-7 col-lg-10">
                                <input name = "username" type="text" class="form-control" id="username" placeholder="Nom d'utilisateur" required>
                                <span id="champVideusername" style="display: none; color:red;">Veuillez compléter le champ requis pour pouvoir continuer.</span>
                            </div>
                            
                        </div>
                      
                        <div class="row mb-3 mt-3">
                            <label for="fullName" class="col-md-5 col-lg-2 col-form-label">Email</label>
                            <div class="col-md-7 col-lg-10">
                                <input type="email" name ="email" class="form-control" id="email" placeholder="email" required>
                                <span id="email-error" style="display: none; color:red;">Veuillez entrer un email valide.</span>
                            </div>
                        </div>
                      
                        <div class="row mb-3 mt-3">
                            <label for="fullName" class="col-md-5 col-lg-2 col-form-label">Telephone</label>
                            <div class="col-md-7 col-lg-10">
                                <input name = "Telephone" type="tel" class="form-control" id="phone" placeholder="Telephone" maxlength="10"  required>
                                <span id="phone-error" style="display: none; color:red;">Veuillez entrer un numéro de téléphone valide.</span>
                            </div>
                        </div>
                      
                        <div class="row mb-3 mt-3">
                            <label for="fullName" class="col-md-5 col-lg-2 col-form-label">Adresse</label>
                            <div class="col-md-7 col-lg-10">
                                <input name = "Adresse" type="text" class="form-control" id="Adresse" placeholder="Adresse" required>
                                <span id="champVideAdresse" style="display: none; color:red;">Veuillez compléter le champ requis pour pouvoir continuer.</span>
                            </div>
                        </div>
                        <div class="row mb-3 mt-3">
                            <label for="fullName" class="col-md-5 col-lg-2 col-form-label">Mot de passe</label>
                            <div class="col-md-7 col-lg-10">
                                <input type="password" name ="password" class="form-control" id="motDePasse" placeholder="Mot de passe" required>
                                <span id="mdp-error" style="display: none; color:red;">
                                Le mot de passe doit contenir au moins une lettre majuscule et une lettre minuscule, ainsi qu'avoir une longueur minimale de 8 caractères. Par exemple : « Abcdefg1 ».
                                </span>
                            </div>
                        </div>
                      
                        <div class="row mb-3 mt-3">
                            <label for="fullName" class="col-md-5 col-lg-2 col-form-label">Confirmer mot de passe</label>
                            <div class="col-md-7 col-lg-10">
                                <input type="password" name ="confpassword" class="form-control" id="floatingPassword" placeholder="Confirmer mot de passe" required>
                            </div>
                        </div>
                      
                      
                        <%--<form method="post" action="FileUploadServlet" enctype="multipart/form-data">--%>
                           

                            <div class="input-group mt-2">
                                <input name="file" type="file" class="form-control" id="inputGroupFile04" aria-describedby="inputGroupFileAddon04" aria-label="Upload">
                            </div> 

                        <%--</form>--%>

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
                        <div class="col-lg-6">
                          <button class="btn-color mt-2 w-100 "  type="submit" onclick="validateForm()">Valider</button>
                          
                        </div>
                        <div class="col-lg-6">
                          <input  class="btn-color2 mt-2 w-100 text-dark" value="Annuler"  type="submit" ></input>
                        </div>
                    </div>  
                </form>

                </div>
              </div>

           
          </div>
        </div>

      </section>

    </div>
  </main><!-- End #main -->
  
  
  <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">
    <div class="copyright">
      &copy; Create by <strong><span>RivoAndriamifidy</span></strong>.
    </div>
    
  </footer><!-- End Footer -->
</body>

</html>
