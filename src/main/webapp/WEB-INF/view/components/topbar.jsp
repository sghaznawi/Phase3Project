<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>     
<%@ page isELIgnored="false" %>
<table><tr><td><h1 style="color:red;">Sporty</h1></td>
<td><h1 style="color:blue;">Shoes</h1></td></tr></table>
<a href="home">Home</a> | 
<% if (session.getAttribute("user_id") == null ) { %>
	<a href="login">Login/Signup</a> | 
<% }  else { %>
	<a href="dashboard">Dashboard</a> | 
	<a href="cart">Cart</a> | 
	<a href="logout">Logout</a>
	<br>
	<a href="editprofile">Edit Profile</a> | 
	<a href="memberpurchases">Your Orders</a> 

<% }  %>


 
<br>
<hr>