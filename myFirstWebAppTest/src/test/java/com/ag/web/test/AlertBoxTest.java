package com.ag.web.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxTest {
	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			String baseUrl = "http://localhost:8085/myFirstWebAppTest/";
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get(baseUrl);
	      
		   //	driver.get("");
			//click button shows alert box
	        WebElement alertShow = driver.findElement(By.id("altBtn"));
	        alertShow.click();
	        
	        
	     //   driver.quit();

	}		
}
