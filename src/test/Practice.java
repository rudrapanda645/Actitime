package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice
{
	@Test(dependsOnMethods="a")
public void m()
{
WebDriver driver= new FirefoxDriver();
driver.get("https:/demo.actitime.com/");
String actual=driver.getTitle();
String expected="huaglalk";
Assert.assertEquals(actual, expected);



}

	
}
