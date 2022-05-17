<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int tab; %>
<%  tab=Integer.valueOf(request.getParameter("number"));%>

<table border="1">
<% for(int i=1;i<=10;i++) {%>
	<tr>
	
	<td ><%= tab %></td>
	
	<td><%= i%></td>
	<td><%=tab*i %>
	
	</tr>
	
	<%} %>
	
	
	</table>
</body>
</html>