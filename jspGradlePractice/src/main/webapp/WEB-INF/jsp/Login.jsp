<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<style><%@include file="/WEB-INF/css/Login.css"%></style>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
	<form action="/user/login" method="post" class="login-form">
		<div class="form-header">
			<h2>LOGIN PAGE</h2>
		</div>
		<div class="form-body">
			<label for="email"> Email: </label>
			<input id="email" name="email" type="email" required/><br>
			<label for="password"> Password: </label>
			<input id="password" name="password" type="password" required/>
		</div>
		<div class="form-footer">
			<button class="login-button"> login </button><br>
			<span>Don't have account yet? </span><a href="/registration">Register</a>
		</div>
	</form>
</body>
</html>