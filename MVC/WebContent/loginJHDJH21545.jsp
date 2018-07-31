<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Please Login
	<br />
	<form action="process" method="post" %>
		<input type="text" name="username" value="Mani"/> <input type="password"
			name="password" value="pass123"/> <input type="submit" value="Login" />
	</form>
	<c:if test="${param.flag}">
		<div style="color : red">Invalid Username/Password</div>
	</c:if>
	
</body>
</html>