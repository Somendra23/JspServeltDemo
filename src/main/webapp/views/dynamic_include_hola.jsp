<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 String param1 = (String)request.getParameter("dynamicParam1");
out.println("dynamic request param is :");
out.println(param1);
%>

</body>
</html>