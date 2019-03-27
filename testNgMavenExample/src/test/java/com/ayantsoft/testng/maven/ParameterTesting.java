package com.ayantsoft.testng.maven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesting {
	
		@Test
	   @Parameters("para1")
	   public void parameterTest(String parameter) {
	      System.out.println("Parameterized value is : " + parameter);
	   }
}
