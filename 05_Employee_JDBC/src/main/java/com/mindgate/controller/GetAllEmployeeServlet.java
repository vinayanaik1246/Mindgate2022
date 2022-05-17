package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

@WebServlet("/GetAllEmployeeServlet")
public class GetAllEmployeeServlet extends HttpServlet {
	private PrintWriter out;
	private EmployeeDAO employeeDAO=new EmployeeDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		out=response.getWriter();
		out.println("Getting all employees");
		Set<Employee> employeesSet=employeeDAO.getAllEmployee();
		
		HttpSession session=request.getSession();
		session.setAttribute("data", employeesSet);
		
		response.sendRedirect("displayAll.jsp");
	}


}
