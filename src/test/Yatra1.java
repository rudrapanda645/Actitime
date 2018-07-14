package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Yatra1

{

	@Test
	public void g() throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		pom.Yatra1 c=new pom.Yatra1(driver);
		c.m();
	}
}
