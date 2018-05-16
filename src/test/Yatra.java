package test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Yatra {

	
	@Test
	public void m() throws InterruptedException, AWTException
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		
		pom.Yatra y=new pom.Yatra(driver);
		y.flight();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
