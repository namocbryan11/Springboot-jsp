package com.example.demo.jspController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.jspModel.Recipes;

@Controller
@RequestMapping("/")
public class JspPagesController {
	
	@Autowired
	private RecipesRestController recipesController;
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
		return new ModelAndView("Login");
	}
	@GetMapping("/registration")
	public ModelAndView registrationPage() {
		return new ModelAndView("Registration");
	}
	@GetMapping("/new_recipe")
	public ModelAndView addRecipePage() {
		return new ModelAndView("AddRecipe");
	}
	@GetMapping("/recipe")
	public ModelAndView recipePage(HttpServletRequest request, HttpServletResponse response) {
		List<Recipes> recipes = recipesController.getAllRecipes();
		request.setAttribute("recipes", recipes);
		return new ModelAndView("Recipes");
	}
	@GetMapping("/recipe/edit/{id}")
	public ModelAndView editRecipePage(HttpServletRequest request, @PathVariable Long id) {
		Recipes recipe = recipesController.getRecipeById(id);
		request.setAttribute("recipe", recipe);
		return new ModelAndView("EditRecipe");
	}

}
