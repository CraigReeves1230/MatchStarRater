package com.matchstarrater.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name="Result", value="/Results.do")
class Controller extends HttpServlet implements Serializable {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) 
        throws IOException, ServletException {
        
        // Create session
        HttpSession session = req.getSession();
        
        // Get the ratings
        float execution = Float.parseFloat(req.getParameter("execution"));
        float heat = Float.parseFloat(req.getParameter("heat"));
        float action = Float.parseFloat(req.getParameter("action_diff"));
        float story = Float.parseFloat(req.getParameter("story"));
        
        // Store all of these in session
        session.setAttribute("execution", execution);
        session.setAttribute("heat", heat);
        session.setAttribute("action", action);
        session.setAttribute("story", story);
        
        // Dispatch to JSP to display
        RequestDispatcher dispatch = req.getRequestDispatcher("result.jsp");
        dispatch.forward(req, res);
    
    }
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws IOException, ServletException {
        doPost(req, res);
    }
    
    
}

