/**
 * 
 */
package com.cookbook.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cookbook.dao.RecipeDao;

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
		Assert.assertEquals(1010, 1010);
	}
}
