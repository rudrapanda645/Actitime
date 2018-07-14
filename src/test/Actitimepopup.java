package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




import Generics.Basetest;
import pom.ActitimeLogin;
import pom.ActitimePopup;

public class Actitimepopup extends Basetest

{

	@Test
	public void create() throws InterruptedException
	{

		
		ActitimeLogin a=new ActitimeLogin(driver);
		a.login();
		
	ActitimePopup p=new ActitimePopup(driver);
	p.cancel(driver);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
