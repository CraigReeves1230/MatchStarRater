package com.matchstarrater;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name="Result", value="/Results.do")
class Controller extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) 
        throws IOException, ServletException {
        
        // Get the ratings
        float execution = Float.parseFloat(req.getParameter("execution"));
        float heat = Float.parseFloat(req.getParameter("heat"));
        float action = Float.parseFloat(req.getParameter("action_diff"));
        float story = Float.parseFloat(req.getParameter("story"));
       
        
        // Create new model object
        Model model = new Model();
        
        // Get star rating of match
        String star_rating = model.calculate(execution, heat, action, story);
        
        // Create session
        HttpSession session = req.getSession();
        
        // Store match rating into attribute
        session.setAttribute("star_rating", star_rating);
        
        // Dispatch to JSP to display
        RequestDispatcher dispatch = req.getRequestDispatcher("result.jsp");
        dispatch.forward(req, res);
    
        // Print star rating
        // res.setContentType("text/html");
        //PrintWriter out = res.getWriter();
        // out.println("<h1>Star Rating for this match: " + star_rating + "</h1>");
    }
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws IOException, ServletException {
     
    }
    
    
}

