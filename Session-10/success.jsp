<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class="org.webapp.users.dto.User" scope="request">
		<jsp:setProperty property="*" name="user" />
	</jsp:useBean>
	<jsp:getProperty property="name" name="user"/>
	<jsp:getProperty property="age" name="user"/>
	<jsp:getProperty property="city" name="user"/>
	<jsp:getProperty property="mobile" name="user"/>
</body>
</html>