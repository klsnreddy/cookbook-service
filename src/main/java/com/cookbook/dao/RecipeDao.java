/**
 * 
 */
package com.cookbook.dao;

import java.util.List;

import com.cookbook.domain.Recipe;
import com.cookbook.exception.EntityNotfoundException;

/**
 * @author lokesh
 * 
 */
public interface RecipeDao extends GenericDao<Recipe> {

	/**
	 * Method to retrieve recipes by author
	 */
	List<Recipe> getRecipesByAuthor(String author)
			throws EntityNotfoundException;

}
