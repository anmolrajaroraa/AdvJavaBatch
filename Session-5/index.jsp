<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Testing JSP</h3>
	<%!
	//declaration block
	public int add(int a, int b){
		return a+b;
	}
	%>
	
	
	
	<%
		int i = 1;
		int j = 2;
		int k;
		k= i +j;
	%>
	
	The value of k is : <%=1 + 3 %>
	
	<br>
	
	<%
		k= add(4556, 56326);
	%>
	
	The value of k after addition is : <%=k %>
	
	<%
		for(i = 0; i<5; i++){
	%>
	<br>
	Value of i is : <%=i %>
	<%	
		}
	%>
</body>
</html>