package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
 private PrintWriter printWriter;      
  private double num1;
  private double num2;
  private double add;

  
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		num1=Double.valueOf(request.getParameter("txtAcceptDetails1"));
		num2=Double.valueOf(request.getParameter("txtAcceptDetails2"));
		add=num1+num2;
		printWriter=response.getWriter();
		
		printWriter.println("Addition is:"+add);

	}

}
