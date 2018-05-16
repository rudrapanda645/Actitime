package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Autosuggestion {

	
	@FindBy(id="lst-ib")
	private WebElement google;
	
	@FindBy(xpath="//li[@class='sbsb_c gsfs']")
	private List<WebElement> rudra;
	
	
	public Autosuggestion(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void auto() throws InterruptedException
	{
		
		google.sendKeys("rudra");
		
		
		Thread.sleep(5000);
		System.out.println(rudra.size());
		
		rudra.get(2).click();
		
	}
	
	
	
	
	
	
}
