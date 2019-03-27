package com.ayantsoft.test.dao.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*  
    @BeforeClass – Run once before any of the test methods in the class, public static void
	@AfterClass – Run once after all the tests in the class have been run, public static void
	@Before – Run before @Test, public void
	@After – Run after @Test, public void
	@Test – This is the test method to run, public void
	
*/

public class AnnotationTest {
	
	@BeforeClass
	//run one time in the start
	public static void beforeClass() {
		System.out.println("this is before class method");
	}
	
	//run one time after all the test method has been tested
	@AfterClass
	public static void afterClass(){
		System.out.println("this is after class method");
	}
	
	//before test method 
	@Before
	public  void before(){
		System.out.println(" ****before method****");
	}
	
	//after test method
	@After
	public  void after(){
		System.out.println(" ****after method****");
	}
	
	@Test
	public  void test1(){
		System.out.println(" test1 method");
	}
	
	@Test
	public  void test2(){
		System.out.println(" test2 method");
	}
	
	@Test
	public  void test3(){
		System.out.println(" test3 method");
	}
	

}
