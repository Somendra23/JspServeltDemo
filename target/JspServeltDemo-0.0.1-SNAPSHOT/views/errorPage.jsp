<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Error Page</h1>
<br><h3><%=exception.getMessage() %></h3></br>

<%
String jangoStatus = (String)session.getAttribute("Jango");


%>
<h2><%= jangoStatus %></h2>
<h2><%= this.getServletInfo() %></h2>
</body>
</html>