<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
input,textarea,select {
    border: 2px solid white; 
    -webkit-box-shadow: 
      inset 0 0 8px  rgba(0,0,0,0.1),
            0 0 16px rgba(0,0,0,0.1); 
    -moz-box-shadow: 
      inset 0 0 8px  rgba(0,0,0,0.1),
            0 0 16px rgba(0,0,0,0.1); 
    box-shadow: 
      inset 0 0 8px  rgba(0,0,0,0.1),
            0 0 16px rgba(0,0,0,0.1); 
    padding: 15px;
    background: rgba(255,255,255,0.5);
    margin: 0 0 10px 0;
    border-radius: 20px;
    
}
input:focus,textarea:focus,select:focus {
  border-color: #1E90FF;
}
table
{
	text-align: left;
	cellspacing  : 10px;
	background-color: #E8E4DD;
}
td
{
	border-right: 1px solid #fff;
	border-left: 1px solid #e8e8e8;
	border-top: 1px solid #fff;
	border-bottom: 1px solid #e8e8e8;
	padding: 10px 15px;
	position: relative;
	transition: all 300ms;
}
input[type=submit],input[type=reset]
{
	width: 100px;
	text-align: center;
	background-color: #E8E4DD;
}
</style>
</head>
<body bgcolor="#FFEFDB">
<%@include file="admin_header.jsp" %>
<center>
<br><br><br><br>
<h3>Enter The Following Details To Add New Product</h3>
<form method="post" action="addProduct" name="form" id="form" autocomplete="off">
<table>

<tr>
<td>Product Id</td>
<td><input type="text" name="productId"/></td>
</tr>
<tr>
<td>Product Name</td>
<td><input type="text" name="productName"/></td>
</tr>
<tr>
<td>Product Company</td>
<td><input type="text" name="productCompany"/></td>
</tr>
<tr>
<td>Product Category</td>
            <td> 
            	<select name="productCategory">
            		
            		<option value="Electronics" >Electronics</option>
            		<option value="Kitchen">Kitchen</option>
            		<option value="Mobile and Computer Accessories">Mobile and Computer Accessories</option>
            		<option value="Men's Fashion">Men's Fashion</option>
            		<option value="Women's Fashion">Women's Fashion</option>
            		<option value="Kids's Fashion">Kids's Fashion</option>
            		<option value="Sports/Fitness">Sports/Fitness</option>
            		<option value="Beauty/Health">Beauty/Health</option>
            		<option value="Kindle/E-Books">Kindle/E-Books</option>
            	</select>
             </td>

</tr>
<tr>
<td>Product Description</td>
<td><textarea name="productDescription"></textarea></td>
</tr>
<tr>
<td>Product Price</td>
<td><input type="text" name="productPrice"/></td>
</tr>

</table><br>
<input type="submit" value="ADD">
             <input type="reset" value="Reset">
</form>
</center>

</body>
</html>