package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ActitimeTypeOfWork {

	
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[1]")
	private WebElement setting;
	
	@FindBy(xpath="//li[@id='popup_menu_item_2']")
	private WebElement typeofwork;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement creatework;
	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement select;
	
	@FindBy(xpath="//input[@id='billingType_setBillable']")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement create;
	
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public ActitimeTypeOfWork(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void m() throws InterruptedException
	{
		
		setting.click();
		Thread.sleep(2000);
		typeofwork.click();
		Thread.sleep(2000);
		creatework.click();
		Thread.sleep(2000);
		name.sendKeys("rudra");
		Thread.sleep(2000);
		Select s= new Select(select);
		s.selectByIndex(1);
		Thread.sleep(2000);
		checkbox.click();
		create.click();
		logout.click();
		
		
	}
}
