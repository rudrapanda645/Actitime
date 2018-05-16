package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailCheckbox {

	
	
	@FindBy(xpath="//div[@class='T-Jo-auh']")
	private List<WebElement> checkbox;
	
	public GmailCheckbox(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
	}
	
	public void m() throws InterruptedException
	{
		
		
		Thread.sleep(5000);
		
		System.out.println(checkbox.size());
		int j= checkbox.size();
		for(int i=1;i<j;i++)
		{
			checkbox.get(i).click();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
