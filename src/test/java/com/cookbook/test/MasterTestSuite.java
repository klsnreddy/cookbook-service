package com.cookbook.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.cookbook.dao.RecipeDaoImpl;

@RunWith(value = Suite.class)
@SuiteClasses(value = RecipeDaoImpl.class)
public class MasterTestSuite {

}
