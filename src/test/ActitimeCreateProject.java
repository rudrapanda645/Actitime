package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import Generics.Basetest;
import pom.ActitimeLogin;

public class ActitimeCreateProject extends Basetest{

	
	@Test
	public void c() throws InterruptedException
	{

		
		ActitimeLogin a= new ActitimeLogin(driver);
		a.login();
		
		pom.ActitimeCreateProject z= new pom.ActitimeCreateProject(driver);
		z.m();
	}
}
