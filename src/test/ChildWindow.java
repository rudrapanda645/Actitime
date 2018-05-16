package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChildWindow {

	@Test
	public void n()
	{
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http:/www.naukri.com/");
		pom.ChildWindow c= new pom.ChildWindow(driver);
		c.m(driver);
	}
}
