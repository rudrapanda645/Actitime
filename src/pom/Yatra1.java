package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yatra1 {

	
	@FindBy(xpath="//a[.='My Account']")
	private WebElement account;
	@FindBy(xpath="//a[@id='signInBtn']")
	private WebElement sigin;
	@FindBy(xpath="//input[@id='login-input']")
	private WebElement email;
	@FindBy(xpath="//button[@id='login-continue-btn']")
	private WebElement login;
 
	
	public Yatra1(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	
	public void m() throws InterruptedException
	{
		
		account.click();
		sigin.click();
		Thread.sleep(5000);
		email.sendKeys("rudrapanda645@gmail.com");
		login.click();
		
		
	}
	
}
