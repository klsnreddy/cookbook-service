package com.cookbook.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.cookbook.dao.DomainClassesTestSuite;

@RunWith(value = Suite.class)
@SuiteClasses(value = DomainClassesTestSuite.class)
public class MasterTestSuite {

}
