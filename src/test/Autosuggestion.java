package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Autosuggestion {

	@Test
	public void m() throws InterruptedException
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http:/www.google.com/");
		
		pom.Autosuggestion a= new pom.Autosuggestion(driver);
		a.auto();
		
		
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		
		
		 
	}
	
	
	
	
}
