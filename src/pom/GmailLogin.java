package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin {
	@FindBy(id="identifierId")
	private WebElement email;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement next;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//span[.='Next']")
	 private WebElement next1;
	
	
	
	
	public GmailLogin(WebDriver driver) {
  PageFactory.initElements(driver, this);

	}
	
	
	
	public void login() throws InterruptedException
	{
		
		
		email.sendKeys("satyapanda645@gmail.com");
		next.click();
		
		Thread.sleep(2000);
		
		
		password.sendKeys("satyapandanarayan");
		next1.click();
	}
	
	
	
}
