package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook1 {

	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(id="loginbutton")
	private WebElement login;
	
	
	public Facebook1(WebDriver driver) {
PageFactory.initElements(driver, this);
	}
	
	public void m(String em,String pwd)
	{
		email.sendKeys(em);
		pass.sendKeys(pwd);
		login.click();
		
		
		
	}
	
}
