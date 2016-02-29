<%-- 
    Document   : result
    Created on : Feb 27, 2016, 6:32:21 AM
    Author     : Craig Reeves
--%>

<%@page import="com.matchstarrater.model.StandardMatchRating"%>
<%@page import="com.matchstarrater.model.MatchRating"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Match Star Rating</title>
        
        <%-- Declare variables--%>
        <%!float execution;%>
        <%!float heat;%>
        <%!float action;%>
        <%!float story;%>
        <%!MatchRating rating;%>
       
        <%!String rating_value;%>
        
        <%-- Get ratings from session--%>
        <%
            execution = (float) session.getAttribute("execution");
            heat = (Float) session.getAttribute("heat");
            action = (Float) session.getAttribute("action");
            story = (Float) session.getAttribute("story");
            
            // For now, we'll just use the Standard rating
            rating = new StandardMatchRating();
            rating_value = rating.calculate(execution, heat, action, story);
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
        <h1 style="text-align:center; font-size:60px;"><%=rating_value%></h1>
        <br><br>
        <p><a href = "index.html">BACK</a></p>
    </body>
</html>
