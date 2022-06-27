package com.example.demo.jspRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.jspModel.Recipes;

@Repository
public interface RecipesCustom {
	public List<Recipes> getAllRecipes();
	public void deleteRecipe(Long Id);
	public void addRecipe(Recipes recipe);
	public void editRecipe(Recipes recipe, Long id);
	public Recipes getRecipeById(Long Id);
}
