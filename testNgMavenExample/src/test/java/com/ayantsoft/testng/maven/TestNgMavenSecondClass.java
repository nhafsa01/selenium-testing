package com.ayantsoft.testng.maven;

import org.testng.annotations.Test;

public class TestNgMavenSecondClass {

	@Test(enabled = false)
	public void testCase1() {
		System.out.println("This is a Test Case 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is Test Case 2");
	}
	
}
