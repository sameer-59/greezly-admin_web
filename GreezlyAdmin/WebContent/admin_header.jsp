<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#admin_name
{
   
   position:fixed;
   right:10%;
   top:20px;
   display:inline-block;
}

#logout_link{

position:fixed;
margin-right:20px;
   right:10px;
   top:20px;
}

#search
{
	position:fixed;
	padding: 10px 15px;
   left:400px;
   top:15px;
   
   width : 400px;
   display: inline-block;
    padding: 7px 20px;
	border-radius: 25px;
   
    color: gray;
	width  : 400px;
}

#toplogo
{
	position:fixed;

   left: 10px;
   top: 10px;
   height: 40px;
   width : 200px;
}
#adminimage
{
	position :fixed;
	margin : 50px;
	top : 10%;
	height: 250px;
}
#adminLabel
{
	left: 10%;
	position :fixed;
	top : 400px;
}
</style>
</head>
<body bgcolor="#FFEFDB">
<%
HttpSession s = request.getSession();
	
	
	String admin=session.getAttribute("username").toString();	
%>
<img id="toplogo" alt="" src="images/logo.jpg">
<input type="text" id="search" name="search" placeholder="What are you looking for?" >
<span id="admin_name">Welcome, <%=admin %></span>
<a href="logout" id="logout_link">Logout</a>
<img id="adminimage" alt="" src="images/adminimage.png">
<div id="adminLabel">User : <%=admin %><br>Contact : #########<br>Email-ID : abc@xyz.com</div>
	</body>
</html>