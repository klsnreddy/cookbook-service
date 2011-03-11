/**
 * 
 */
package com.cookbook.dao;

import java.util.List;

import com.cookbook.domain.Recipe;

/**
 * @author lokesh
 * 
 */
public interface RecipeDao {
	/**
	 * Method to create recipe
	 * 
	 * @param recipe
	 */
	void createRecipe(Recipe recipe);

	/**
	 * Method to retrieve all recipes
	 */
	List<Recipe> getAllRecipes();

	/**
	 * Method to retrieve recipes by author
	 */
	List<Recipe> getRecipesByAuthor(String author);

	/**
	 * Method to retrieve recipe by id
	 */
	Recipe getRecipeById(Long id);
}
