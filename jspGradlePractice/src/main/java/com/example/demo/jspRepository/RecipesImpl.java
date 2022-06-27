package com.example.demo.jspRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.jspModel.Recipes;

@Repository
public class RecipesImpl implements RecipesCustom {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Recipes> getAllRecipes() {
		String sql = "SELECT * FROM JSP_RECIPES";
		try {
			return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Recipes.class));
		}catch(Exception ex) {
			System.out.print(ex.getMessage().toString());
			return null;
		}
	}

	@Override
	public void deleteRecipe(Long Id) {
		String sql ="DELETE FROM JSP_RECIPES WHERE ID = ?";
		try {
			jdbcTemplate.update(sql,Id);
			System.out.print("Successfully Deleted!");
		}catch(Exception ex) {
			System.out.println(ex.getMessage().toString());
		}
	}

	@Override
	public void addRecipe(Recipes recipe) {
		String name = recipe.getRecipeName();
		String description = recipe.getRecipeDescription();
		String sql = "INSERT INTO JSP_RECIPES(RECIPE_NAME,RECIPE_DESCRIPTION) VALUES(?,?)";
		try {
			jdbcTemplate.update(sql,name,description);
			System.out.println("Successfully saved!");
		}catch(Exception ex) {
			System.out.println(ex.getMessage().toString());
		}
	}

	@Override
	public void editRecipe(Recipes recipe, Long id) {
		String name = recipe.getRecipeName();
		String description = recipe.getRecipeDescription();
		String sql = "UPDATE JSP_RECIPES SET RECIPE_NAME = ?, RECIPE_DESCRIPTION =? WHERE ID = ?";
		try {
			jdbcTemplate.update(sql,name,description,id);
			System.out.println("Updated Successfully!");
		}catch(Exception ex) {
			System.out.println(ex.getMessage().toString());
		}
				
		}

	@Override
	public Recipes getRecipeById(Long Id) {
		String sql ="SELECT * FROM JSP_RECIPES WHERE ID = ?";
		try {
			return jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Recipes.class), Id);
		}catch(Exception ex) {
			System.out.print(ex.getMessage().toString());
			return null;
		}
	}
	
	
}
