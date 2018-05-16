package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import BfMethod.Actitime;

import Excel.Excel;



public class ActitimeLogin extends Actitime
{

	@Test
	public void login() throws InterruptedException 
	{

		String un=Excel.getCellValue("E:/excel.xlsx", "Sheet1", 1, 0);
		String pass=Excel.getCellValue("E:/excel.xlsx", "Sheet1", 2, 0);
 
pom.ActitimeLogin a= new pom.ActitimeLogin(driver);
a.login(un, pass);
	}
		
		
}	
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
