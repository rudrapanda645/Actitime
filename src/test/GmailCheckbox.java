package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.GmailLogin;

public class GmailCheckbox {

	
	
	@Test
	public void g() throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http:/www.gmail.com/");
		
		GmailLogin g= new GmailLogin(driver);
		g.login();
		
		
		pom.GmailCheckbox d= new pom.GmailCheckbox(driver);
		d.m();
		
	}
}
