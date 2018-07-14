package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.Autoconstant;
import Generics.Excel;

public class Facebook1 implements Autoconstant
{

	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(id="loginbutton")
	private WebElement login;
	
	
	public Facebook1(WebDriver driver) {
PageFactory.initElements(driver, this);
	}
	
	public void m()
	{
		email.sendKeys(Excel.getCellValue(path, "Sheet3", 2, 0));
		pass.sendKeys(Excel.getCellValue(path, "Sheet3", 3, 0));
		login.click();
		
		
		
	}
	
}
