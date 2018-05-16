package test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.GmailLogin;

public class Gmail {
@Test
public void G() throws InterruptedException, AWTException
{
	
	WebDriver driver =new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http:/www.gmail.com/");
	
	
	
	GmailLogin g= new GmailLogin(driver);
	g.login();
	pom.Gmail c= new pom.Gmail(driver);
	c.compose();
	
	
	
	
	
	
	
}
	
	
	
	
	
	
}
