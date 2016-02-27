<%-- 
    Document   : result
    Created on : Feb 27, 2016, 6:32:21 AM
    Author     : reeve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Match Star Rating</title>
        <%!String rating;%>
        <%
            rating = (String) session.getAttribute("star_rating");
        %>
        <style>
            body {
                font-family:verdana, arial, sans-serif;
            }
            p {
                text-align:center;
                font-size:20px;
            }
        </style>
    </head>
    <body>
        <h1 style="text-align:center;">MATCH STAR RATING</h1>
        <h1 style="text-align:center;"><%=rating%></h1>
        <br><br>
        <p><a href = "index.html">BACK</a></p>
    </body>
</html>
