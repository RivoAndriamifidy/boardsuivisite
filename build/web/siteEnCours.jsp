<%-- 
    Document   : sitecorrige
    Created on : 11 mai 2023, 08:21:20
    Author     : Workdev
--%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.ajoutTerminer"%>
<%@ include file = "dashnew.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    Connection con = DBconnect.config.connect();
    ResultSet res = ajoutTerminer.AfficheSiteEnCours(con);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <main id="main" class="main">
            <div class="pagetitle mt-5">
                <h1>Listes des sites en cours de traitement</h1>
                <nav>
                  <ol class="breadcrumb">
                      <li class="breadcrumb-item"><a href="dashnew.jsp">Home</a></li>
                    <li class="breadcrumb-item active">Procédures de vérification de la qualité de la maintenance d'un site.</li>
                  </ol>
                </nav>
            </div><!-- End Page Title -->
        <div class="card">
            <div class="card-header">
               
                <table class="table table-bordered" id="monTableau">
                    <caption>Liste des site corriger</caption>
                    <thead class="table-secondary">

                      <tr>    
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
                        <% while (res.next()) { %>
                        <tr onclick="selectRow(1)">
                            <td><%= res.getString("SITE") %></td>
                            <td><%= res.getString("DS") %></td>
                            <td><%= res.getString("PF") %></td>
                            <td><%= res.getString("nomStatut") %></td>
                            <td><%= res.getString("Ticket") %></td>
                            <td><%= res.getString("commentaire") %></td>
                            <td><%= res.getString("username") %></td>
                            <%
                                java.sql.Timestamp timestamp = res.getTimestamp("dateTerminer");
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
                
           
    
        </main>
        <script>
            function selectRow(rowNumber) {
              window.location.href = "sitecorrige.jsp?row=" + rowNumber;
            }
        </script>
    </body>
</html>




