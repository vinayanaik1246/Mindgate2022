<%@page import="javax.security.auth.message.callback.SecretKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  String name= request.getParameter("name")	;
	session.setAttribute("username", name);
%>

<form action="display.jsp" method="post">
Address:<input type="text" name="add">

<input type="submit" value="OK">



</form>
</body>
</html>