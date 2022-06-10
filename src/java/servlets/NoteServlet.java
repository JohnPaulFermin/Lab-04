/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author johnp
 */
public class NoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // GET requests will end up here!
        
        // Load a JSP from this servlet
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        return; // VERY IMPORTANT!
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // POST requests will end up here!
        
        // Capture the incoming parameters from the JSP
        String newtitle = request.getParameter("Title");
        String newcontext = request.getParameter("Context");
        
        // Set attributes in the request object, to be forwarded to the JSP
        request.setAttribute("Newtitle", newtitle);
        request.setAttribute("Newcontext", newcontext);
        
        // Validation
        if( newtitle == null || newtitle.equals("") || newcontext == null || newcontext.equals("") ){
            // if validation fails:
            // Set up an error message
            String message = "Please enter both a title and context.";
            // put the error message into the request object as an attribute
            request.setAttribute("message", message);
            // load the form once again
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            // after a JSP has been loaded, stop the code call
            return;
        }
        

        
        //instantialting a note object after the validation
        Note newTopic = new Note(newtitle,newcontext);
        //set the note object as an attribute
        request.setAttribute("topic", newTopic);
        
        // Load the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        // Stop the code call after loading a JSP
        return;
    }

}

    

