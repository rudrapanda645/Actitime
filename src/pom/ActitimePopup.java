package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimePopup {

	@FindBy(xpath="//div[.='TASKS']")
	private WebElement task;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath="//input[@id='customerLightBox_nameField']")
	private WebElement customername;
	
	@FindBy(xpath="//div[.='Cancel']")
	private WebElement cancel;
	
	
	
	public ActitimePopup(WebDriver driver) {
	
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	

	public void cancel(WebDriver driver) throws InterruptedException
	{
		
		task.click();
		Thread.sleep(2000);
		
		addnew.click();
		newcustomer.click();
		
		
		customername.sendKeys("rudra");
		
		Thread.sleep(2000);
		
		cancel.click();
		
		
		Alert a=driver.switchTo().alert();
		
		a.dismiss();
		
		
		
	
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
