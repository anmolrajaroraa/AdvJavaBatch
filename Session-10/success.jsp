<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello 
	<!-- <%=session.getAttribute("saveduserid") %>-->
	
	<jsp:useBean id="user" class="com.advjava.users.dto.User" scope="request">
		<jsp:setProperty name="user" property="userid" value="Tom"/>
	</jsp:useBean>
	
	<jsp:getProperty property="userid" name="user"/>
	
	<!-- <%=user.getUserid() %> -->
	
	<!-- <%=request.getParameter("userid")%>-->
</body>
</html>