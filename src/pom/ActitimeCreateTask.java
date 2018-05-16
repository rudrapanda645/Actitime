package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateTask {

	@FindBy(xpath="//div[.='TASKS']")
	private WebElement task;
	
	@FindBy(xpath="//div[.='Add New Task']")
	private WebElement addtask;
	
	@FindBy(xpath="//div[.='Create new tasks']")
	private WebElement createtask;
	
	@FindBy(xpath="(//td[@class='x-btn-center'])[1]")
	private WebElement first;
	
	@FindBy(xpath="//li[@id='ext-gen684']")
	private WebElement element;
	
	@FindBy(xpath="(//td[@class='x-btn-center'])[2]")
	private WebElement second;
	
	@FindBy(xpath="//li[@id='ext-gen722']")
	private WebElement element2;
	
	@FindBy(xpath="//input[@id='createTasksPopup_newProject']")
	private WebElement projectname;
	
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder'])[1]/..")
	private WebElement taskname;
	
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	public ActitimeCreateTask(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void m() throws InterruptedException
	{
		
		task.click();
		Thread.sleep(2000);
		addtask.click();
		Thread.sleep(2000);
		createtask.click();
		Thread.sleep(2000);
		first.click();
		Thread.sleep(2000);
		element.click();
		Thread.sleep(2000);
		second.click();
		element2.click();
		Thread.sleep(2000);
		projectname.sendKeys("abcd");
		Thread.sleep(2000);
		taskname.sendKeys("do anything");
		Thread.sleep(2000);
		logout.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
