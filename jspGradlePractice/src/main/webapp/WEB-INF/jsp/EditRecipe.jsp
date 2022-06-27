<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
	<%@include file="/WEB-INF/css/Common.css"%>
	<%@include file="/WEB-INF/css/Recipes.css"%>
</style>
<head>
<meta charset="ISO-8859-1">
<title>EDIT RECIPE</title>
</head>
<body>
	<div class="div-header">
		<h2>EDIT RECIPE</h2>
	</div>
	<div class="div-body">
		<form action="/recipes/edit/${recipe.id}" method="post">
			<div class="form-header">
				<h3 class="form-title">FORM TITLE</h3>
			</div>
			<div class="form-body">
				<label for="recipeName">Name: </label>
				<input id="recipeName" name="recipeName" class="form-inputs margin-bottom-sm" required value="${recipe.recipeName}"/><br>
				<label for="recipeDescription">Description: </label>
				<textarea id="recipeDescription" name="recipeDescription" class="form-textarea margin-bottom-sm" required>${recipe.recipeDescription}</textarea>
			</div>
			<div class="form-footer">
				<button class="btn btn-success" >Save</button>
				<button class="btn btn-gray" onclick="window.location.href='/recipe'">Back</button>
			</div>
		</form>
	</div>
	<div class="div-footer"></div>
</body>
</html>