package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;





public class Naukri {

	
	@Test
	public void s() throws InterruptedException
	{
		
		
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		
		
		pom.Naukri n= new pom.Naukri(driver);
		n.m(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
