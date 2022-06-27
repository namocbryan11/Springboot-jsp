package com.example.demo.jspController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jspModel.Recipes;
import com.example.demo.jspRepository.RecipesCustom;

@RestController
@RequestMapping("/recipes/api/")
public class RecipesRestController {
	
	@Autowired
	private RecipesCustom recipeRepository ;
	
	@GetMapping("/all")
	public List<Recipes> getAllRecipes(){
		return recipeRepository.getAllRecipes();
	}
	
	@PostMapping("/delete")
	public void deleteRecipe(Long id){
		recipeRepository.deleteRecipe(id);
	}
	
	@PostMapping("/add")
	public void addRecipe(Recipes recipe) {
		recipeRepository.addRecipe(recipe);
	}
	
	@PostMapping("/edit")
	public void editRecipe(Recipes recipe, Long id) {
		recipeRepository.editRecipe(recipe, id);
	}
	
	@GetMapping("/getRecipe/{id}")
	public Recipes getRecipeById(@PathVariable Long id) {
		return recipeRepository.getRecipeById(id);
	}
}
