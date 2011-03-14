/**
 * 
 */
package com.cookbook.dao;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cookbook.test.BaseTest;
import com.cookbook.util.SchemaGen;

/**
 * @author lokesh
 * 
 */
public class SchemaGenTest extends BaseTest {

	public SchemaGenTest() {
		super();
	}

	@Autowired
	private SchemaGen schGen;

	@Test
	public void schemaGenTest() {
		boolean result = schGen.generateSchema();
		Assert.assertEquals(true, result);
	}

}
