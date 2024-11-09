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
    ResultSet res = ajoutTerminer.AfficheSiteCorriger(con);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    /* Définition du style pour la classe "selected" */
        .selected {
          background-color: yellow;
        }
    </style>
    <body>
        <main id="main" class="main">
        <div class="card">
            <div class="card-header">
               
                <table class="table table-bordered" id="monTableau">
                    <caption>Liste des site corriger</caption>
                    <thead class="table-secondary">

                      <tr>
                            <th>Date d'entrée</th>
                            <th scope="col">Site</th>
                            <th scope="col">DS</th>
                            <th scope="col">PF</th>
                            <th scope="col">Statut</th>
                            <th scope="col" class="text-center">Ticket</th>
                            <th scope="col" class="text-center">Commentaire</th>
                            <th scope="col" class="text-center">User</th>
                            <th scope="col" class="text-center">Date de modification</th>
                            <th scope="col" class="text-center">Action</th>
                      </tr>
                    </thead>
                    
                    <tbody>
                        <% while (res.next()) { %>
                        <tr>
                            <td><%= res.getString("DATES") %></td>
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

                            <td class="d-flex justify-content-evenly">
                            

                                <form method="post" action="modifEtatsite">
                                    <input type="hidden" name="idtable" value="<%= res.getString("idtable1") %>">
                                    <input type="hidden" name="idtable1" value="<%= res.getString("idtable1") %>">
                                    
                                    <button type="submit" class="btn">
                                        <i class="fa fa-times text-danger fa-2x" aria-hidden="true"></i>
                                    </button>
                                </form>

                               

                            
                            
                            <%--<a href="sitecorrige.jsp?annuler=<% out.println(res.getString("idtable1"));%>"><i class="fa fa-times text-danger fa-2x" aria-hidden="true"></i></a>--%>
                        
                            </td>

                        </tr>
                        <% } %>
                    </tbody>
                    
                </table>
                
                
                
               

            </div>
        </div>
                
           
    
        </main>
    <script>
        // Récupérer les paramètres d'URL
        const urlParams = new URLSearchParams(window.location.search);
        const selectedRow = urlParams.get('row');

        // Changer la couleur de la ligne sélectionnée
        if (selectedRow) {
          const table = document.getElementById('monTableau');
          const rows = table.getElementsByTagName('tr');
          rows[selectedRow - 1].classList.add('selected');
        }
    </script>
    </body>
</html>
