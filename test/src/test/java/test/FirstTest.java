package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {
	
	//annotation for j unit testing
	@Test
	//methods
	/*public void doTest() {
		//if test run it pass else its fails.Test pass
		System.out.println("this is first test class");
	}*/
	/*
	public void doTest1() {
		//generate exception - test fail
		System.out.println(10/0);
	}
*/
	
	public void doTest1() {
		//small program using selenium web driver
		System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("selenium");
		textbox.submit();
		//driver.quit();
	
}

}
