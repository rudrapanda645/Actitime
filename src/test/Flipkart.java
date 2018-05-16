package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Flipkart {

	@Test
	public void g() throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		pom.Flipkart f= new pom.Flipkart(driver);
		
		f.m(driver);
		
		
	}
}
