/**
 * 
 */
package com.cookbook.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cookbook.domain.Recipe;

/**
 * Implementation of the RecipeDao interface
 * 
 * @author lokesh
 */
@Repository("recipeDao")
public class RecipeDaoImpl implements RecipeDao {

	/**
	 * Constructor for RecipeDao
	 */
	public RecipeDaoImpl() {
		super();
	}

	/**
	 * Entity Manager to be injected by Spring ORM
	 */
	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cookbook.dao.RecipeDao#createRecipe(com.cookbook.domain.Recipe)
	 */
	@Override
	public void createRecipe(Recipe recipe) {
		entityManager.persist(recipe);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cookbook.dao.RecipeDao#getAllRecipes()
	 */
	@Override
	public List<Recipe> getAllRecipes() {
		return entityManager.createQuery("Select * from Recipe s").getResultList();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cookbook.dao.RecipeDao#getRecipesByAuthor(java.lang.String)
	 */
	@Override
	public List<Recipe> getRecipesByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cookbook.dao.RecipeDao#getRecipeById(java.lang.Long)
	 */
	@Override
	public Recipe getRecipeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param entityManager
	 *            the entityManager to set
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
