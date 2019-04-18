package com.ayantsoft.Selenium.webpage;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumTestWeb {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://localhost:8081/crudWithSpring";	
		
		
        driver.get(baseUrl);
        
        WebElement addEmp = driver.findElement(By.id("addEmp"));	
        
        
        addEmp.click();
        
        
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement empName = driver.findElement(By.id("name"));					 
        WebElement empPass = driver.findElement(By.id("pass"));					 
        WebElement empEmail = driver.findElement(By.id("email"));					 
        WebElement empCity = driver.findElement(By.id("city"));					 
        WebElement saveEmp = driver.findElement(By.id("submitEmp"));					 
         
         
        empEmail.sendKeys("selenium@gmail.com");
        
        
        empName.sendKeys("abc");
        empPass.sendKeys("selenium@123");
        empCity.sendKeys("selenium City");
        
        saveEmp.click();
        
        WebElement chk1 = driver.findElement(By.id("chkId"));	//check box				 
        chk1.click();
        
        WebElement rdId = driver.findElement(By.id("rdId"));	//radio button				 
        
        rdId.click();
       
        
        
        Select st = new Select(driver.findElement(By.id("state")));//drop down
		st.selectByVisibleText("Alabama");
		//st.selectByIndex(2);
        
		
        WebElement anchr1=driver.findElement(By.linkText("click here1"));//anchor links				
        System.out.println(driver.getTitle());
        System.out.println(anchr1.getText());
        
        WebElement anchr2=driver.findElement(By.partialLinkText("click here"));//same anchor but 				
        System.out.println(driver.getTitle());                                     //with partial text
        System.out.println(anchr2.getText());
        
        
        
        //broken link test
        
       /* HttpURLConnection huc = null;
        String url = "";
        int respCode = 200;
        
        
List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
                
            }
        
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
*/        
        
       // driver.close();
	}

}
