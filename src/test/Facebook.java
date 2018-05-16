package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Facebook {

	
	
	
	@Test
	public void b() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.facebook.com/");
		
		pom.Facebook z=new pom.Facebook(driver);
		
		z.m();
		
		
	}
}
