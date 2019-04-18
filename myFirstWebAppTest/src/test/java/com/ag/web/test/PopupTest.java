package com.ag.web.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8085/myFirstWebAppTest/";
        driver.get(baseUrl);
	   //	driver.get("");
		//click me shows pop up
        WebElement clickme = driver.findElement(By.id("myPopup"));
        
       clickme.click();
        
     //   driver.quit();

}		
}
