<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahooo!!! From JSP</title>
</head>
<body>

<%
System.out.println("This is a scriptlet");
Date date = new Date();

/*
	We've a normal Scriptlet and the below we are using to print the 'date' is a Scriptlet expression
	But the use of Scriptlets is a bad practise in a real world app, then the best way is use a modular program
	That is the write of your business logic in your business layer without mixing anything
*/
%>

<div>Current date is <%=date %></div>

My First JSP ${name} 


<!-- Post Request -->
<form action="/login.do" method="post">

	Enter your name: <input type="text" name="name"/>
	<input type="submit" value="Login"/>

</form>

</body>
</html>