package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private String user;
	private String pass;
	private PrintWriter out;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		out=response.getWriter();
		
		user=request.getParameter("name");
		pass=request.getParameter("pass");
		
		if(user.equals(pass))
		{
			//response.sendRedirect("success.jsp");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("success.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("fail.jsp");
		requestDispatcher.forward(request, response);
	}}

}
