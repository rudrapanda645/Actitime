package BfMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Faceb {
public static WebDriver driver;
	

	@BeforeMethod 
	public void m()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http:/www.facebook.com/");
		
	}

	@AfterMethod
	public void n()
	{
	driver.close();
	}
}
