/**
 * 
 */
package com.cookbook.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
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
	private SchemaGen schGen;

	@Autowired
	private AuthorDao authorDao;

	@BeforeClass
	public static void initialize() {

	}

	@Test
	@Transactional
	// @Rollback(false)
	public void testSaveRecipe() {
		// schGen.generateSchema();
		Recipe recipe = new Recipe();
		recipe.setContents("This is my contents");
		recipe.setTitle("Hello Recipe");

		recipeDao.save(recipe);

		Author author = new Author();
		author.setName("Vijay Akkineni");

		recipe.addAuthorToRecipe(author);

		// recipeDao.save(recipe);
		Assert.assertEquals(1, recipeDao.getAll().size());
		Assert.assertEquals(1, authorDao.getAll().size());

		logger.debug(recipe);

	}

	@Test
	public void testGetRecipes() {
		List<Recipe> results = recipeDao.getAll();
		Assert.assertEquals(1, results.size());

		Recipe recipe = recipeDao.get(1L);
		Assert.assertEquals(1, recipe.getId());
	}

}