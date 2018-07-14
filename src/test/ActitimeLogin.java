package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




import Generics.Basetest;



public class ActitimeLogin extends Basetest
{

	@Test
	public void login() throws InterruptedException 
	{

		
		pom.ActitimeLogin a= new pom.ActitimeLogin(driver);
		a.login();
	}
		
		
}	
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
