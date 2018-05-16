package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateProject {

	@FindBy(xpath="//div[.='TASKS']")
	private WebElement task;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath="//div[.='+ New Project']")
	private WebElement project;
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement name;
	
	@FindBy(xpath="//button[@class='x-btn-text']")
	private WebElement cuname;
	
	
	@FindBy(xpath="//a[@id='ext-gen108']")
	private WebElement selectnm;
	
	
	@FindBy(xpath="//div[@id='projectPopup_commitBtn']")
	private WebElement createproject;
	
	@FindBy(xpath="logoutLink")
	private WebElement logout;
	
	
	public ActitimeCreateProject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void m() throws InterruptedException
	{
		
		task.click();
		Thread.sleep(2000);
		addnew.click();
		Thread.sleep(2000);
		project.click();
		Thread.sleep(2000);                  
		name.sendKeys("dipu");
		
		cuname.click();
	
		selectnm.click();
		
		
		
		Thread.sleep(2000);
		createproject.click();
		
		Thread.sleep(2000);
		
		logout.click();
		
		
		
		
		
		
		
		
		
		
	}
}
