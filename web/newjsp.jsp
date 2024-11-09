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


<%@include file = "dashnew.jsp" %>
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

    Connection Con = DBconnect.config.connect();
    ResultSet res = afficheSite.test(SKU_VIDE,SKU_EGAL_MPN,SKU_EGAL_EAN,MPN_EAN,MODEL_EGAL_MPN,BRAND_EGAL_MPN,MODEL_EGAL_BRAND,EAN_DIFF_13,SKU_INF_4,MPN_INF_4,PRICE_INFEGAL_0,PREVIEWS_PRICE_INF_PRICE,DELIVERY_PRICE_SUP_PRICE,EAN_NON_DIGIT,MPN_NUMERIQ,MPN_ALPHABETIQUE,idStatut,Con);

    
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
  <main id="main" class="main">
  <!-- ======= Header ======= -->

       
  <!-- ======= Sidebar ======= -->



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
                                        <td name="site"><a id="historique" href="historiqueAdmin.jsp?nomSite=<% out.println(res.getString("SITE"));%>"  class="text-decoration-none"><% out.println(res.getString("SITE"));%></a></td>

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
</main>
  <!-- Template Main JS File -->
  
  
  <script src="JSfile/script.js"></script>
  
</body>

</html>
