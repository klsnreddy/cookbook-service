/**
 * 
 */
package com.cookbook.dao;

import java.util.List;

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
		// authorDao.save(author);

		recipe.addAuthorToRecipe(author);
		//
		// recipeDao.save(recipe);
		Assert.assertEquals(1, recipeDao.getAll().size());

	}

	@Test
	public void testCreateRecipe() {
		// Recipe recipe = new Recipe(1000, "My Recipe", "This is cntsnts",
		// "vijay akkineni");

		Recipe recipe = recipeDao.get(1000L);
		List<Recipe> results = recipeDao.getAll();
		Assert.assertEquals(1, results.size());
	}

}