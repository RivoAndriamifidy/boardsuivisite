<%-- 
    Document   : historique.jsp
    Created on : 26 avr. 2023, 14:19:36
    Author     : Workdev
--%>


<%@page import="java.text.DateFormatSymbols"%>
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
    String username = (String) session.getAttribute("username");
    Connection Conn = DBconnect.config.connect();
    ResultSet vres = users.affichage(username,Conn);
    ResultSet resultat = historiqueSeule.affichetable1(request.getParameter("nomSite"),Conn);
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>historique  de <%= request.getParameter("nomSite") %></title>
        <link href="CSSfile/styleNew.css" rel="stylesheet">
        <link rel="stylesheet" href="CSSfile/style.css">
        <link rel="stylesheet" href="dist/css/bootstrap.css">
        <link href="font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
        <link rel="shortcut icon" href="image/favicon.ico"/> 
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/plug-ins/1.11.3/i18n/fr.json"></script>
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

  
  
  <div style="margin-top: 80px">
      
        <div class="pagetitle mt-5">
            <h1>Liste des sites corrigés triés par mois</h1>
        </div><!-- End Page Title -->
      
  </div>
            <div class="table-responsive">
                <table class="table table-bordered" width="100%" cellspacing="0">
                    <caption>Liste des sites corrigés triés par mois et année</caption>
                    <thead class="table-secondary text-lowercase text-center">
                        <tr>
                            <th>idsite</th>
                            <th>Site</th>
                            <th>Plateforme</th>
                            <th >Datasource</th>
                            <th >MtchMPN</th>
                            <th >TOUS</th>
                            <th >EAN</th>
                            <th >SKU</th>
                            <th >MPN</th>
                            <th >MODEL</th>
                            <th >BRAND</th>
                            <th >TITLE</th>
                            <th >PATHURL</th>
                            <th >IMGURL</th>
                            <th >SKU_DISTINCT</th>
                            <th >EAN_DISTINCT</th>
                            <th >MPN_DISTINCT</th>
                            <th >MODEL_DISTINCT</th>
                            <th >BRAND_DISTINCT</th>
                            <th >TITLE_DISTINCT</th>
                            <th >PATHURL_DISTINCT</th>
                            <th >IMGURL_DISTINCT</th>
                            <th >SKU_VIDE</th>
                            <th >SKU=MPN</th>
                            <th >SKU=EAN</th>
                            <th >MPN=EAN</th>
                            <th >MODEL=MPN</th>
                            <th >BRAND=MPN</th>
                            <th >MODEL=BRAND</th>
                            <th >EAN!=13</th>
                            <th >SKU<4</th>
                            <th >MPN<4</th>
                            <th >PRICE<=0</th>
                            <th >PREVIEWS_PRICE<PRICE</th>
                            <th >DELIVERY_PRICE>PRICE</th>
                            <th >EAN_NON_DIGIT</th>
                            <th >MPN_NUMERIQUE</th>
                            <th >MPN_ALPHABETIQUE</th>
                            <th >REVIEWS</th>
                            <th >RATING</th>
                            <th >REVIEW_COMMENT</th>
                            <th >REVIEW_USER</th>
                            <th >REVIEW_TITLE</th>
                            <th >REVIEW_URL</th>
                            <th >REVIEW_DATE</th>
                            <th >SKU%</th>
                            <th >EAN%</th>
                            <th >MPN%</th>
                            <th >MODEL%</th>
                            <th >TITLE%</th>
                            <th >PATHURL%</th>
                            <th >IMGURL%</th>
                            <th >A_TRAITER</th>
                            <th >Nombre_de_clients</th>
                            <th >DATE</th>
                            <th>Date</th>
                            <th>#</th>
                        </tr>
                    </thead>
                    <tbody class="text-center">
                        <% 
                        String lastMonth = "";
                        int lastYear = 0;
                        while(resultat.next()) {
                            java.util.Date date = resultat.getDate("DATES");
                            java.util.Calendar cal = java.util.Calendar.getInstance();
                            cal.setTime(date);
                            String monthName = new DateFormatSymbols().getMonths()[cal.get(java.util.Calendar.MONTH)];
                            int year = cal.get(java.util.Calendar.YEAR);
                            if (!monthName.equals(lastMonth) || year != lastYear) {
                                out.print("<tr><td colspan=\"2\"><b><li style=\"color: orangered; margin-left: 5px;\">" + monthName + " " + year + "</li></b></td></tr>");
                                lastMonth = monthName;
                                lastYear = year;
                            }
                        %>
                        <tr>
                            <td><%= resultat.getString("idsite") %></td>
                            <td><%= resultat.getString("SITE") %></td>
                            <td><%= resultat.getString("PF") %></td>
                            <td><%= resultat.getString("MtchMPN")%></td>
                            <td><%= resultat.getString("TOUS")%></td>
                            <td><%= resultat.getString("EAN")%></td>
                            <td><%= resultat.getString("SKU")%></td>
                            <td><%= resultat.getString("MPN")%></td>
                            <td><%= resultat.getString("MODEL")%></td>
                            <td><%= resultat.getString("BRAND")%></td>
                            <td><%= resultat.getString("TITLE")%></td>
                            <td><%= resultat.getString("PATHURL")%></td>
                            <td><%= resultat.getString("IMGURL")%></td>
                            <td><%= resultat.getString("SKU_DISTINCT")%></td>
                            <td><%= resultat.getString("EAN_DISTINCT")%></td>
                            <td><%= resultat.getString("MPN_DISTINCT")%></td>
                            <td><%= resultat.getString("MODEL_DISTINCT")%></td>
                            <td><%= resultat.getString("BRAND_DISTINCT")%></td>
                            <td><%= resultat.getString("TITLE_DISTINCT")%></td>
                            <td><%= resultat.getString("PATHURL_DISTINCT")%></td>
                            <td><%= resultat.getString("IMGURL_DISTINCT")%></td>
                            <td><%= resultat.getString("SKU_VIDE")%></td>
                            <td><%= resultat.getString("SKU_EGAL_MPN")%></td>
                            <td><%= resultat.getString("MPN_EAN")%></td>
                            <td><%= resultat.getString("MODEL_EGAL_MPN")%></td>
                            <td><%= resultat.getString("BRAND_EGAL_MPN")%></td>
                            <td><%= resultat.getString("MODEL_EGAL_BRAND")%></td>
                            <td><%= resultat.getString("EAN_DIFF_13")%></td>
                            <td><%= resultat.getString("SKU_INF_4")%></td>
                            <td><%= resultat.getString("MPN_INF_4")%></td>
                            <td><%= resultat.getString("PRICE_INFEGAL_0")%></td>
                            <td><%= resultat.getString("PREVIEWS_PRICE_INF_PRICE")%></td>
                            <td><%= resultat.getString("DELIVERY_PRICE_SUP_PRICE")%></td>
                            <td><%= resultat.getString("EAN_NON_DIGIT")%></td>
                            <td><%= resultat.getString("MPN_NUMERIQ")%></td>
                            <td><%= resultat.getString("MPN_ALPHABETIQUE")%></td>
                            <td><%= resultat.getString("IMGURL_DISTINCT")%></td>
                            <td><%= resultat.getString("REVIEWS")%></td>
                            <td><%= resultat.getString("RATING")%></td>
                            <td><%= resultat.getString("REVIEW_COMMENT")%></td>
                            <td><%= resultat.getString("REVIEW_USER")%></td>
                            <td><%= resultat.getString("REVIEW_TITLE")%></td>
                            <td><%= resultat.getString("REVIEW_URL")%></td>
                            <td><%= resultat.getString("REVIEW_DATE")%></td>
                            <td><%= resultat.getString("SKU_DOUBLONS")%></td>
                            <td><%= resultat.getString("EAN_DOUBLONS")%></td>
                            <td><%= resultat.getString("MPN_DOUBLONS")%></td>
                            <td><%= resultat.getString("MODEL_DOUBLONS")%></td>
                            <td><%= resultat.getString("TITLE_DOUBLONS")%></td>
                            <td><%= resultat.getString("PATHURL_DOUBLONS")%></td>
                            <td><%= resultat.getString("IMG_URL")%></td>
                            <td><%= resultat.getString("ATRAITER")%></td>
                            <td><%= resultat.getString("ATRAITER")%></td>
                            <td><%= resultat.getString("NBR_CLIENT")%></td>
                            <td><%= resultat.getString("DATES") %></td>
                            <td><%= resultat.getString("idtable1") %></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
</body>
</html>
