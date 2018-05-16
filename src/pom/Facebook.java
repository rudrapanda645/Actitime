package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	@FindBy(id="u_0_j")
	private WebElement firstname;

	@FindBy(id="u_0_l")
	private WebElement surname;

	@FindBy(id="u_0_o")
	private WebElement mobileno;

	@FindBy(id="u_0_v")
	private WebElement password;

	@FindBy(xpath="//select[@id='day']")
	private WebElement day;

	@FindBy(xpath="//select[@id='month']")
	private WebElement month;

	@FindBy(xpath="//select[@id='year']")
	private WebElement year;

	@FindBy(xpath="//input[@id='u_0_9']")
	private WebElement checkbox;

	@FindBy(id="u_0_11")
	private WebElement search;

	
	
	public Facebook(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	public void m() throws InterruptedException
	{
		
		firstname.sendKeys("rudra");
		surname.sendKeys("panda");
		mobileno.sendKeys("7377220516");
		
		password.sendKeys("75210456");
		Thread.sleep(2000);
		Select s= new Select(day);
		s.selectByIndex(5);
		
		Select d= new Select(month);
		d.selectByIndex(9);
		Select y=new Select(year);
		y.selectByIndex(6);
		
		checkbox.click();
		
		
		search.click();
		
		
	}
	
	
	
}
