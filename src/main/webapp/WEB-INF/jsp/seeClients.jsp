<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.app.SpringBootApp.model.Client" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show Clients</title>
</head>
<body>
    <h1>List of Clients</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Middle Name</th>
            <th>Adress</th>
            <th>County</th>
            <th>CNP</th>
        </tr>
        <% 
            List<Client> clients = (List<Client>) request.getAttribute("client");
            if (clients != null && !clients.isEmpty()) {
                for (Client client : clients) {
        %>
        <tr>
            <td><%= client.getIdClient() %></td>
            <td><%= client.getClientName() %></td>
            <td><%= client.getClientPrenume() %></td>
            <td><%= client.getAdress() %></td>
            <td><%= client.getCounty() %></td>
            <td><%= client.getCnp() %></td>
        </tr>
        <% 
                }
            } else {
        %>
        <tr>
            <td colspan="3">No clients found</td>
        </tr>
        <% } %>
    </table>
</body>
</html>
