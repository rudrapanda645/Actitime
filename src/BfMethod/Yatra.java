package BfMethod;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Yatra {
	
	public static WebDriver driver;
	
@BeforeMethod
public void m()
{
	driver=new FirefoxDriver();
	driver.get("http:/www.yatra.com/");
			
}
@AfterMethod
public void n()
{
	driver.close();
}
}
