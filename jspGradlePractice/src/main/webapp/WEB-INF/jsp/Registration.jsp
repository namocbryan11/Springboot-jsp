<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<style><%@include file="/WEB-INF/css/Login.css"%></style>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION</title>
</head>
<body>
	<form action="/user/register" method="post" class="login-form">
		<div class="form-header">
			<h2>REGISTRATION PAGE</h2>
		</div>
		<div class="form-body">
			<label for="email"> Email: </label>
			<input id="email" name="email" type="email" required/><br>
			<label for="password"> Password: </label>
			<input id="password" name="password" type="password" required/>
		</div>
		<div class="form-footer">
			<button class="login-button"> register </button><br>
			<span>Already have account? </span><a href="/login">Login</a>
		</div>
	</form>
</body>
</html>