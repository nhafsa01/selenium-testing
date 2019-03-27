package com.ayantsoft.testng.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupExample {
		
	@Test(groups = { "grp1", "grp2" })
	   public void testCase1() {
	      System.out.println("Inside testCase1");
	      Assert.assertEquals("somnath","somnath");
	   }

	   @Test(groups = { "grp2" })
	   public void testCase2() {
	      System.out.println("Inside testCase2");
	      Assert.assertEquals("somnath1","somnath1");
	   }

	   @Test(groups = { "grp1" })
	   public void testCase3() {
	      System.out.println("Inside testCase3");
	      Assert.assertEquals("somnath3","somnath3");
	   }  
	
}
