/**
 * 
 */
package com.cookbook.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cookbook.domain.Recipe;
import com.cookbook.test.BaseTest;

/**
 * @author lokesh
 * 
 */
public class RecipeDaoImplTest extends BaseTest {

	@Autowired
	private RecipeDao recipeDao;

	@Test
	public void testCreateRecipe() {
		// Recipe recipe = new Recipe(1000, "My Recipe", "This is cntsnts",
		// "vijay akkineni");

		Recipe recipe = recipeDao.get(1000L);
		List<Recipe> results = recipeDao.getAll();
		Assert.assertEquals(2, results.size());
	}
}