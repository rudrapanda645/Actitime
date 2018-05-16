package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ActitimeLogin {

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
	
	
	public void login(String un,String pass) throws InterruptedException
	{
		username.sendKeys(un);
		Thread.sleep(2000);
		
		password.sendKeys(pass);
		
		login.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
