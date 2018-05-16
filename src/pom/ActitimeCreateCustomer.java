package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateCustomer {

	@FindBy(xpath="//div[.='TASKS']")
	private WebElement task;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement name;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement description;
	
	
	
	
	@FindBy(xpath="//span[.='Create Customer']")
	private WebElement createcustomer;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
public ActitimeCreateCustomer(WebDriver driver) {
 PageFactory.initElements(driver, this);
}

public void m(WebDriver driver) throws InterruptedException
{
	task.click();Thread.sleep(2000);
	
	addnew.click();Thread.sleep(2000);
	newcustomer.click();Thread.sleep(2000);
	name.sendKeys("ashuish");
	Thread.sleep(2000);
	description.sendKeys("honest");
	Thread.sleep(2000);
	
	
	

	
	
	
	createcustomer.click();
	
	logout.click();
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
