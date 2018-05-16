package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert {

	
	@Test
	public void m()
	
	{
		org.testng.asserts.SoftAssert s= new org.testng.asserts.SoftAssert();
		WebDriver driver= new FirefoxDriver();
	driver.get("https:/demo.actitime.com/");
	
	String actual=driver.getTitle();
		
		String expected="ni ku ku ";
		s.assertEquals(actual, expected);
		
		Reporter.log("rudra",true);
		Reporter.log("datag",true);
		s.assertAll();
		
		
	}
	
	
	
	
}
