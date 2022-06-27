<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
	<%@include file="/WEB-INF/css/Recipes.css"%>
	<%@include file="/WEB-INF/css/Common.css"%>
</style>
<head>
<meta charset="ISO-8859-1">
<title>RECIPES</title>
</head>
<body>
	<div class="div-header">
		<h2>RECIPES</h2>
	</div>
	<div class="div-body">
		<div class="div-tabs-right">
			<button class="btn btn-info" onclick="window.location.href='/new_recipe'">New Recipe</button>
		</div>
		<div class="div-cards">
			<div class="div-flex-container">
				<c:forEach items="${recipes}" var="recipe">
					<div class="div-card">
						<div class="card-header">
							<h4>${recipe.id} - ${recipe.recipeName}</h4>
						</div>
						<div class="card-body">
							<p>${recipe.recipeDescription}</p>
						</div>
						<div class="card-footer">
							<button type="submit" class="btn btn-danger" value="${recipe.id}" onclick="window.location.href='/recipes/delete/' + ${recipe.id}">Delete</button>
							<button class="btn btn-success" value="${recipe.id}" onclick="window.location.href='/recipe/edit/${recipe.id}'"> Edit </button>
						</div>
					</div>
				</c:forEach>
			</div>
			<ul>
			</ul>
		</div>
	</div>
	<div class="div-footer">
	</div>
</body>
</html>