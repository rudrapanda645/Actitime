package test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




public class Facebook1
{

	@Test
	public void f() throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http:/www.facebook.com/");
		
		
		pom.Facebook1 z= new pom.Facebook1(driver);
		z.m();
	}
	
	
	
	
	
	
}
