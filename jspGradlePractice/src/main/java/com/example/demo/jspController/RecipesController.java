package com.example.demo.jspController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.jspModel.Recipes;


@Controller
@RequestMapping("/recipes/")
public class RecipesController {

	@Autowired
	private RecipesRestController recipeService;
	
	@GetMapping("/delete/{id}")
	public void deleteRecipe(@PathVariable Long id, HttpServletResponse response) throws IOException {
		recipeService.deleteRecipe(id);
		response.sendRedirect("/recipe");
	}
	@PostMapping("/add")
	public void addRecipe(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Recipes recipe = new Recipes();
		recipe.setRecipeName(request.getParameter("recipeName"));
		recipe.setRecipeDescription(request.getParameter("recipeDescription"));
		recipeService.addRecipe(recipe);
		response.sendRedirect("/recipe");
	}

	@PostMapping("/edit/{id}")
	public void editRecipe(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) throws IOException {
		Recipes recipe = new Recipes();
		recipe.setRecipeName(request.getParameter("recipeName"));
		recipe.setRecipeDescription(request.getParameter("recipeDescription"));
		recipeService.editRecipe(recipe, id);
		response.sendRedirect("/recipe");
	}
}
