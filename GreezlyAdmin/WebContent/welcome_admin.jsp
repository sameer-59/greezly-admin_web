<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#links
{
	position: absolute;
	top: 10%;
	left : 600px;
}

</style>
</head>
<body bgcolor="#FFEFDB">
<%@include file="admin_header.jsp" %>

<%
	
	
	//admin=session.getAttribute("username").toString();	
	
	
%><center>
<div id ="links"><br>
<h1><a href="addProduct.jsp">Add Product</a><br><br>
<a href="ListProduct.jsp">List Product</a></h1>

</div>
</center>
</body>
</html>