package com.ayantsoft.testng.maven;

import org.testng.annotations.Test;

import com.ayantsoft.testNGMavenExample.controller.EmpLogic;

public class ExceptionTesting {
	
	EmpLogic empLogic=new EmpLogic();
	
	//@Test(expectedExceptions = ArithmeticException.class)
	@Test(expectedExceptions = NullPointerException.class)
	public void testException() {	
	      System.out.println("Inside Exception Testing Block");   
	      empLogic.methodExceptionThrowing();
	          
	   }
}
