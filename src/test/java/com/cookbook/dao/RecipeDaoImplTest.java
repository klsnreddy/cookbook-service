/**
 * 
 */
package com.cookbook.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cookbook.domain.Recipe;

/**
 * @author lokesh
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-service.xml",
		"classpath:applicationContext-test-service.xml" })
public class RecipeDaoImplTest {

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