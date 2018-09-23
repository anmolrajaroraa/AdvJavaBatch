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
	String userid = request.getParameter("userid");
	if(userid!=null){
		session.setAttribute("saveduserid", userid);
		application.setAttribute("saveduserid", userid);
		pageContext.setAttribute("saveduserid", userid);
		pageContext.setAttribute("sessionuserid", userid, pageContext.SESSION_SCOPE);
		pageContext.setAttribute("applicationuserid", userid, pageContext.APPLICATION_SCOPE);
	}
	out.println("Username is " + userid);
	%> 
	<br>
	Userid in session is : <%=session.getAttribute("saveduserid") %>
	<br>
	Userid in application is : <%=application.getAttribute("saveduserid") %>
	<br>
	Userid in page context is : <%=pageContext.findAttribute("saveduserid") %>
	<br>
	Userid in page context - session scope is : <%=pageContext.findAttribute("sessionuserid") %>
	<br>
	Userid in page context - application scope is : <%=pageContext.findAttribute("applicationuserid") %>
	
</body>
</html>