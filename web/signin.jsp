<%-- 
    Document   : signin.jsp
    Created on : 14 avr. 2023, 10:45:53
    Author     : Workdev
--%>
<%@ include file="dashnew.jsp"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Pages / Login - NiceAdmin Bootstrap Template</title>
  <meta content="" name="description">
  <meta content="" name="keywords">
   <link rel="shortcut icon" href="image/favicon.ico"/> 
  

</head>

<body>

  <main id="main" class="main">

      <section class="section register  d-flex flex-column align-items-center justify-content-center ">
        <div class="container">
          <div class="row justify-content-center ">

              

              <div class="card mb-5 mt-5">

                <div class="card-body">
                  <div class="pt-4 pb-2"></div>
                  <figure class="text-center">
                    <blockquote class="blockquote">
                      <p>Se connecter en tant qu'utilisateur simple</p>
                    </blockquote>
                    <figcaption class="blockquote-footer">
                      Entrez votre nom d'utilisateur et votre mot de passe pour vous connecter
                    </figcaption>
                  </figure>
                  </div>

                  <form action="login" method="GET">
    
                    <header class="d-flex justify-content-center header-login">
                        <h4 class="bg-secondary w-100 d-flex align-items-center justify-content-center"><span class="text-light ">Identifiez-vous</span></h4>
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
                        <input  class="btn-color mt-2 w-100 mb-5" value="Se connecter"  type="submit" ></input>
                    </div>
        
            
                </form>

                </div>
              </div>


            
          </div>
        </div>

      </section>

  </main><!-- End #main -->
  
  <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">
    <div class="copyright">
      &copy; Created by <strong><span>RivoAndriamifidy</span></strong>.
    </div>
    <div class="credits">
      Designed by <a href="https://bootstrapmade.com/">Boot</a>
    </div>
  </footer><!-- End Footer -->
</body>

</html>
