package com.ayantsoft.Selenium.webpage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class HandlingPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//handling alert boxes
		
WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://localhost:8081/crudWithSpring";	
		driver.get(baseUrl);
        
		//Alert box releated opreations
        // Switching to Alert  
		WebElement btn1 = driver.findElement(By.id("btn1"));	
        btn1.click();
	    Alert alert = driver.switchTo().alert();		
        
       // Setting alert message. 
         driver.switchTo().alert();		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        // Displaying alert message		
        System.out.println(alertMessage);	
      
        
		//mouse releated opreations
		
        WebElement st1 = driver.findElement(By.id("st1"));	
        
        /*Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(st1)
                .build();
        String bgColor = st1.getCssValue("background-color");
        
         bgColor = st1.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);        
        mouseOverHome.perform();        
        bgColor = st1.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);

        String hex = Color.fromString(bgColor).asHex();
        System.out.println(hex);*/
        
        
        //performing key and mouse events
       /* Actions builder = new Actions(driver);
        Action seriesOfActions = builder
        	.moveToElement(st1)
        	.click()
        	.keyDown(st1, Keys.SHIFT)
        	.sendKeys(st1, "hello")
        	.keyUp(st1, Keys.SHIFT)
        	.doubleClick(st1)
        	.contextClick()
        	.build();
        	
        seriesOfActions.perform() ;*/
		
	}

}
