<%-- 
    Document   : index
    Created on : 30 mars 2023, 10:28:30
    Author     : Workdev
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Model.users"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Se connecter</title>
    <link rel="stylesheet" href="CSSfile/style.css">
    <link rel="stylesheet" href="dist/css/bootstrap.css">
    <link rel="shortcut icon" href="image/favicon.ico"/> 

</head>
<body class=" d-flex justify-content-center align-items-center" style="font-size: 13px; margin-top: 130px;">
    
    <!-- <div class=" d-flex justify-content-center align-items-center login-top" style=" background-color: #c6c6c9;">
        <div class="container-login ">
            
            <% 
                if(session.getAttribute("erreurMessage") != null && !session.getAttribute("erreurMessage").toString().isEmpty()){
                    out.println("<div class=\"text-center alert alert-danger\">" + session.getAttribute("erreurMessage")+"</div>");
                }
            %>
        <form action="login" method="GET" class="row g-3 needs-validation" novalidate>
    
            <header class="d-flex justify-content-center ">
                <h4 class=" w-100 d-flex align-items-center justify-content-center mb-3"><span class="text-dark ">Identifiez-vous</span></h4>
            </header>
            <div class="row mb-2 align-items-center" style="font-size: 13px;">
                    <div class="col-lg-4"><label for="floatingInput" >Nom d'utilisateur</label></div>
                    <div class="col-lg-8 "><input name = "username" type="text" class="form-control" id="floatingInput"  required></div>
                    
                </div>

                <div class="row align-items-center" style="font-size: 13px;">
                    <div class="col-lg-4 "><label for="floatingPassword">Mot de passe</label></div>
                    <div class="col-lg-8"><input type="password" name ="password" class="form-control" id="floatingPassword"  required></div>
                    
                </div>
    
          
            <div class="d-flex justify-content-center align-items-center">
                <input  class="btn-color mt-2 w-50 d-flex justify-content-center align-items-center"  style="border-radius: 7px; font-size: 13px;" value="Se connecter"  type="submit" ></input>
            </div>

    
        </form>
    
        </div>
    </div> -->

    <section class="login-top section d-flex flex-column align-items-center justify-content-center ">
        <div class="container">


            <% 
                if(session.getAttribute("erreurMessage") != null && !session.getAttribute("erreurMessage").toString().isEmpty()){
                    out.println("<div class=\"text-center alert alert-danger\">" + session.getAttribute("erreurMessage")+"</div>");
                    session.removeAttribute("erreurMessage");
                }
                
            %>
          <div class="row justify-content-center ">

              

              <div class="card">

                <div class="card-body">
                  <figure class="text-center">
                    <blockquote class="blockquote">
                      <p>Se connecter en tant qu'utilisateur</p>
                    </blockquote>
                    <figcaption class="blockquote-footer">
                        Veuillez saisir votre nom d'utilisateur et votre mot de passe afin de vous connecter.
                    </figcaption>
                  </figure>
                  </div>

                  <form action="login" method="GET">
    
                    <header class="d-flex justify-content-center header-login">
                        <h5 class=" w-100 d-flex align-items-center justify-content-center" style="background-color:  #635C5F "><span class="text-light ">Identifiez-vous</span></h5>
                    </header>
            
                  
            
                        <div class="form-floating mb-2">
                            <input name = "username" type="text" class="form-control" id="floatingInput" placeholder="Nom d'utilisateur" required>
                            <label for="floatingInput">Nom d'utilisateur</label>
                        </div>
        
                        <div class="form-floating">
                            <input type="password" name ="password" class="form-control" id="floatingPassword" placeholder="Mot de passe" required>
                            <label for="floatingPassword">Mot de passe</label>
                        </div>
            
                  
                    <div>
                            <input  class="btn-color mt-2 w-100 mb-4" value="Se connecter"  type="submit" >
                    </div>
        
            
                </form>

                </div>
              </div>


            
          </div>
        </div>

      </section>
    <script src = "dist/js/bootstrap.js"></script>
</body>
</html>
