package com.example.demo.jspModel;

import javax.persistence.*;

@Entity
@Table(name="JSP_RECIPES")
public class Recipes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="RECIPE_NAME")
	private String recipeName;
	
	@Column(name="RECIPE_DESCRIPTION")
	private String recipeDescription;
	
	@Column(name="RECIPE_VOTES")
	private int votes;
	
	@Column(name="RECIPE_PICTURE")
	private String imagePath;
	
	public Recipes(Long id, String recipeName, String recipeDescription, int votes, String imagePath) {
		super();
		Id = id;
		this.recipeName = recipeName;
		this.recipeDescription = recipeDescription;
		this.votes = votes;
		this.imagePath = imagePath;
	}

	public Recipes() {
		super();
	}
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipeDescription() {
		return recipeDescription;
	}

	public void setRecipeDescription(String recipeDescription) {
		this.recipeDescription = recipeDescription;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
}
