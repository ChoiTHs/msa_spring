<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>login page</h2>
	<form action="login.test" method="post">
		id : <input type="text" name="id"><br /> 
		password : <input type="password" name="password"> 
		<input type="submit" value="login">
		<input type="button" value="join" onclick="location.href='join.test'">
	</form>
</body>
</html>