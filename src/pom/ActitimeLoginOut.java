package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginOut {

	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	
public ActitimeLoginOut(WebDriver driver) {
	
PageFactory.initElements(driver, this);
	}

public void m(String un,String pass) throws InterruptedException
{
	username.sendKeys(un);
	Thread.sleep(2000);
	
	password.sendKeys(pass);
	
	login.click();
	Thread.sleep(5000);
	logout.click();
	
	
}


}
