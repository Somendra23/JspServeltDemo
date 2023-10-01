<%!String includedJsp = "JSP hola comes from Include!!";%>
<%=includedJsp%>

<jsp:include page="dynamic_include_hola.jsp">
	<jsp:param value="DYNAMIC PROXY" name="dynamicParam1" />
</jsp:include>