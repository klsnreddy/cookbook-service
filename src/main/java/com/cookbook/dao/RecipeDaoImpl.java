/**
 * 
 */
package com.cookbook.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cookbook.domain.Recipe;
import com.cookbook.exception.EntityNotfoundException;

/**
 * Implementation of the RecipeDao interface
 * 
 * @author lokesh
 */
@Repository("recipeDao")
public class RecipeDaoImpl extends GenericDaoImpl<Recipe> implements RecipeDao {

	public RecipeDaoImpl() {
		super(Recipe.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cookbook.dao.RecipeDao#getRecipesByAuthor(java.lang.String)
	 */
	@Override
	public List<Recipe> getRecipesByAuthor(String author)
			throws DataAccessException, EntityNotfoundException {
		List<Recipe> result = null;
		Query query = entityManager
				.createQuery("from Recipe as p where p.author = :author");
		result = query.getResultList();
		return result;
	}

}
