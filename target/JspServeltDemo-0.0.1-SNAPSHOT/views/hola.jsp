<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Hola Says SAM!!</h1>
 <%! int count=0;
 	String getApp(){
		 return "Bingo Farmer";
 	}
 
 %>

<%count++;  %>
<h3>Value of count is </h3>
<%=count %>
<%=getApp() %>

<%@ include file="hola_include.jsp" %>

<%@ include file="hola_include.html" %>

<%
if(request.getParameter("error")!=null){
	session.setAttribute("Jango", "Jango is set on EXCEPTION");
	throw new NumberFormatException("This is error thrown from hola jsp");
}
if(request.getParameter("redirect")!=null){
	session.setAttribute("Jango", "Jango is set on REDIRECTION");
	
	//RequestDispatcher rd = request.getRequestDispatcher("redirect.jsp");
	//rd.forward(requet,response)
	pageContext.forward("redirect.jsp");
}

%>

<h1><a href="#"></a></h1>
</body>
</html>