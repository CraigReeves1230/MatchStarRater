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
        <link rel="stylesheet" href="style.css">
    </head>
    
    <body>
        <div class="navbar">
            <nav class="main-navigation">
                <ul>
                    <img id="MSRLogo" src="MSRLogo.gif" alt="Logo">
                    <li><a href="index.html">HOME</a></li>
                    <li><a href="news.html">NEWS</a></li>
                    <li><a href="matchstarrater.html">MATCH STAR RATER</a></li>
                    <li><a href="#">ABOUT</a></li>
                    <li><a href="#">CONTACT</a></li>
                </ul>
            </nav>
        </div>
        <div class="fixed-wrapper">
            <h2 style="text-align:center; font-size: 40px">MATCH STAR RATING</h2>
            <h2 style="text-align:center; font-size:60px;"><%=rating_value%></h2>
            <br><br>
            <p style="text-align:center;"><a href = "matchstarrater.html">BACK</a></p>
        </div>
        <div class='footer'>Copyright &copy 2016 Match Star Rater</div>
    </body>
</html>
