<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String msg="vinaya naik"; %>
<%! double num1=100.0; %>
<%! double num2=500.0; %>
<%! LocalDate localDate=LocalDate.now(); %>
<% 
for(int i=0;i<10;i++){


%>
<h3>JSP is simple</h3>

<%
out.println(localDate);

%>
<br>
<%= num1 + num2 %>
<%

}
%>

</body>
</html>