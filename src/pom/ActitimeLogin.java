package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.Autoconstant;
import Generics.Basepage;
import Generics.Excel;



public class ActitimeLogin extends Basepage implements Autoconstant

{

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	
	public ActitimeLogin(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	}
	
	
	public void login() throws InterruptedException
	{
		username.sendKeys(Excel.getCellValue(path, "Sheet3", 4, 0));
		Thread.sleep(2000);
		
		password.sendKeys(Excel.getCellValue(path, "Sheet3", 5, 0));
		
		login.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
