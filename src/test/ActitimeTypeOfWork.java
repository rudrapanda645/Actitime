package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import BfMethod.Actitime;

import Excel.Excel;
import pom.ActitimeLogin;

public class ActitimeTypeOfWork extends Actitime {

	
	@Test
	public void c() throws InterruptedException
	{

		String un=Excel.getCellValue("E:/excel.xlsx", "Sheet1", 1, 0);
		String pass=Excel.getCellValue("E:/excel.xlsx", "Sheet1", 2, 0);
		
		ActitimeLogin a= new ActitimeLogin(driver);
		a.login(un,pass);
		
		
		pom.ActitimeTypeOfWork z= new pom.ActitimeTypeOfWork(driver);
		z.m();
	}
}
