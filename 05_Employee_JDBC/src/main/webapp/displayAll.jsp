<%@page import="com.mindgate.pojo.Employee"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Employees</h1>
<% Set<Employee> allEmployees=(Set<Employee>)(session.getAttribute("data")); %>

<table border="1">
	<tr>
		<td>EmpId</td>
		<td>name</td>
		<td>salary</td>
		
		</tr>
		
		<%  
		for(Employee employee:allEmployees)
		{%>
		
		<tr>
		<td><%=employee.getEmpId() %></td>
		<td><%= employee.getName() %></td>
		<td><%=employee.getSalary() %></td>
		</tr>
		<% 	
		}%>
		
		


</table>
</body>
</html>