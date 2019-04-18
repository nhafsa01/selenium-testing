package com.ag.web.test;

import org.testng.annotations.Test;


import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.jni.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeScreenshotTest {

	@Test
	public void TestHome() {
		//initiate firefox driver
		System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
		// Open Firefox
		 WebDriver driver=new FirefoxDriver();
		// Maximize the window
		 driver.manage().window().maximize();
		// Pass the url
		// driver.get("");
		/*
		 * // Take screenshot and store as a file format File src =
		 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); try { // now copy
		 * the screenshot to desired location using copyFile //method
		 * FileUtils.copyFile(src, new
		 * File("C:\\Users\\hafsa\\OneDrive\\Desktop\\web\\h1.png")); } catch(IOException e)
		 * { System.out.println(e.getMessage()); }
		 */
	}
}
