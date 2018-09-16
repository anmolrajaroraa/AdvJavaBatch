<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		public void jspInit(){
			String defaultUser = getServletConfig().getInitParameter("defaultUser");
			ServletContext context = getServletContext();
			context.setAttribute("default_username", defaultUser);
	}
	%>

 	Servlet running...
 	User from ServletConfig is :  <%=getServletConfig().getInitParameter("defaultUser") %>
 	Value in Servlet Context is: <%=getServletContext().getAttribute("default_username") %>
</body>
</html>