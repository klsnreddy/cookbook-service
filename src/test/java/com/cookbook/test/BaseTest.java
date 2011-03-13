/**
 * 
 */
package com.cookbook.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lokesh
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:applicationContext-test-service.xml",
		"classpath:applicationContext-service.xml" })
public class BaseTest {

}
