package com.ag.web.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class formTestNG {
	
	@Test
	public void doTest1() {
		//small program using selenium web driver
		System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8085/myFirstWebAppTest/");
		
		
		//popup on click
		/*
		 * WebElement clickbtn = driver.findElement(By.id("myPopup")); clickbtn.click();
		 */
		
		//anchor link 
		WebElement anchr1=driver.findElement(By.linkText("Anchor Link 1"));//anchor links				
        System.out.println(driver.getTitle());
        System.out.println(anchr1.getText());
        
        //form
        WebElement empName = driver.findElement(By.id("Name"));
        WebElement empEMail = driver.findElement(By.id("EMail"));					 
        WebElement empZip = driver.findElement(By.id("Zip"));
        
		//send value into fields to test 
        empName.sendKeys("harry");
        empEMail.sendKeys("selenium@gmail.com");
        empZip.sendKeys("98023");
		
        
        Select st = new Select(driver.findElement(By.id("Country")));//drop down
		st.selectByVisibleText("INDIA");
		//st.selectByIndex(3);
		
		 WebElement rdId = driver.findElement(By.id("a"));	//radio button				 
	     rdId.click();
	       
	     
	     WebElement chk1 = driver.findElement(By.id("2"));	//check box				 
	     chk1.click();
		
   
		
        WebElement EmpSubmit = driver.findElement(By.id("Submit"));//submit btn
        EmpSubmit.click();
        
        //click button shows alert box
        WebElement showAlert = driver.findElement(By.id("altBtn"));
        showAlert.click();
        
      //driver.quit();
}
}
