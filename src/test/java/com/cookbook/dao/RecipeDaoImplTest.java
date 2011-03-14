/**
 * 
 */
package com.cookbook.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.cookbook.domain.Author;
import com.cookbook.domain.Recipe;
import com.cookbook.test.BaseTest;
import com.cookbook.util.SchemaGen;

/**
 * @author lokesh
 * 
 */
public class RecipeDaoImplTest extends BaseTest {

	private static final Logger logger = Logger
			.getLogger(RecipeDaoImplTest.class.getName());

	@Autowired
	private RecipeDao recipeDao;

	@Autowired
	private AuthorDao authorDao;

	@Before
	public void createRecipe() {
		Recipe recipe = new Recipe();
		recipe.setContents("This is my contents");
		recipe.setTitle("Hello Recipe");

		recipeDao.save(recipe);

		Author author = new Author();
		author.setName("Vijay Akkineni");

		recipe.addAuthorToRecipe(author);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testSaveRecipe() {

		Assert.assertEquals(1, recipeDao.getAll().size());
		Assert.assertEquals(1, authorDao.getAll().size());

	}

	@Test
	@Rollback(true)
	@Transactional
	public void testDeleteRecipe() {

		Recipe recipe = recipeDao.get(2L);
		recipeDao.delete(recipe);

		Recipe recipe2 = recipeDao.get(2L);
		Assert.assertEquals(null, recipe2);
	}

	@Test
	@Rollback(true)
	@Transactional
	public void testGetRecipes() {

		List<Recipe> results = recipeDao.getAll();
		Assert.assertEquals(1, results.size());

		Recipe recipe = recipeDao.get(3L);
		Assert.assertEquals(3, recipe.getId());

		// Testing for null
		Recipe recipe2 = recipeDao.get(null);
		Assert.assertEquals(null, recipe2);
	}

}