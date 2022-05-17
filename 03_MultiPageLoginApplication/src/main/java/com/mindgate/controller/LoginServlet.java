package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  private String login;
  private String pass;
  private PrintWriter printWriter;
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		printWriter=response.getWriter();
		login=request.getParameter("loginId");
		pass=request.getParameter("password");
		
		if(login.equals("vinaya") && pass.equals("vinaya@123"))
		{
			response.sendRedirect("success.html");
		}
		else
		response.sendRedirect("success.html");

	}

}
