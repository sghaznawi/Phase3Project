<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>     
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<body>
<table><tr><td><h1 style="color:red;">Sporty</h1></td>
<td><h1 style="color:blue;">Shoes</h1></td><td></td><td>
<h3>${pageTitle}</h3></td></tr></table>
${error}<br>

<form name=frmLogin action="adminloginaction" method="post">
 <table border=1 cellspacing=2 cellpadding=4>
 	<tr>
 		<td width=25%>Admin id*</td>
 		<td><input name=admin_id maxlength=20></td>
 	</tr>
 	<tr>
 		<td width=25%>Admin Password*</td>
 		<td><input name=admin_pwd maxlength=10 type="password"></td>
 	</tr>
 	<tr>
 		<td colspan=2>
 			<button>Login</button>
 		</td>
 	</tr>
 </table>
</form>

<jsp:include page="/WEB-INF/view/components/admin-footer.jsp"></jsp:include>
</body>
</html>