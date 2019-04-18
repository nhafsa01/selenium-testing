package com.ag.web.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeTestNGDriver {

	public static void main(String[] args) {
		// initiate firefox driver
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe"); 
		// Open Firefox WebDriver
		WebDriver driver = new FirefoxDriver();																					
		String baseUrl = "http://localhost:8085/myFirstWebAppTest/";
		driver.get(baseUrl);
        //popup on click me
		WebElement clickme = driver.findElement(By.id("myPopup"));
	    clickme.click();
        //wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		//anchor link
		 WebElement anchr1=driver.findElement(By.linkText("Anchor Link 1"));//anchor links				
	        System.out.println(driver.getTitle());
	        System.out.println(anchr1.getText());
	        
	     WebElement anchr2=driver.findElement(By.linkText("Anchor Link 2"));//anchor links				
	        System.out.println(driver.getTitle());
	        System.out.println(anchr2.getText());
	        
	     WebElement anchr3=driver.findElement(By.partialLinkText("Anchor Link 3"));//partial anchor links				
	        System.out.println(driver.getTitle());
	        System.out.println(anchr3.getText());

	}


}
