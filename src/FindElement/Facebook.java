package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import Excel.Excel;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http:/demo.actitime.com/");
		
		String un=Excel.getCellValue("E:/excel.xlsx", "Sheet1", 0, 0);
	    String pwd=Excel.getCellValue("E:/excel.xlsx", "Sheet1", 1, 0);
		
		
       driver.findElement(By.id("username")).sendKeys(un);
       driver.findElement(By.name("pwd")).sendKeys(pwd);
       driver.findElement(By.id("loginButton")).click();
}
}
