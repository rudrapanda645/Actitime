package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEquals {

	@Test
	public void m()
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http:/demo.actitime.com/");
		String actual=driver.getTitle();
		Reporter.log(actual,true);
		String expect="actiTIME - Login";
	  
		Assert.assertEquals(actual, expect);
		
		Reporter.log("rudra", true);
		
		Reporter.log("satya",true);
		
		
		
		
	}
	
	
	
	
	
	
	
}
