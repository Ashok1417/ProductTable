<%@ page language="java" contentType="text/html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link rel="stylesheet" href="RegisterPage.css" type="text/Css"/>
<style>
ul
{
list-style-type:None;
margin:0;
padding:25px;
overflow:hidden;
background-color: #A9A9A9;
}

li
{
float:right;
}
li a
{
display: initial;
font-size : 20px;
color : #000000;
text-align: centre;
padding: 18px 20px;
text-decoration: none;
}
li a:hover
{
background-color:#FF69B4;
}
.active {
  background-color: "black";
  }
</style>
</head>
<body>
<h1 style="color:Red;font-weight:bold;font-style: italic;font-size:xx-large;text-align:center;text-shadow:2px 2px ;">SRINIVASAN'S METALS</h1>
<ul>
<li><a class="active"
href="Home.jsp">Home</a></li>
<li><a href="Register.jsp">Register</a></li>
<li><a href="Product.jsp">Products Details</a></li>
<li><a href="login.jsp">Login</a></li>
</ul>
</body>
</html>