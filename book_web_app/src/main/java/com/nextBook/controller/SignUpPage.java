package com.nextBook.controller;import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
@WebServlet(
        name = "signUpPage",
        urlPatterns = "/signuptoday")
public class SignUpPage extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        String url = "/next_book/signup/signup.jsp";

        RequestDispatcher dispatcher =
            getServletContext().getRequestDispatcher(url);

        dispatcher.forward(request, response);
    }
        
}