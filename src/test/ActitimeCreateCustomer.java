package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generics.Autoconstant;
import Generics.Basetest;
import Generics.Excel;
import pom.ActitimeLogin;

public class ActitimeCreateCustomer extends
Basetest implements Autoconstant
{

	
	@Test
	public void c() throws InterruptedException
	{

		String un=Excel.getCellValue(path, "Sheet1", 0, 1);
		String pass=Excel.getCellValue("E:/excel.xlsx", "Sheet1", 2, 0);
		ActitimeLogin a= new ActitimeLogin(driver);
		a.login();
		
		pom.ActitimeCreateCustomer z= new pom.ActitimeCreateCustomer(driver);
		z.m(driver);
	}
}
