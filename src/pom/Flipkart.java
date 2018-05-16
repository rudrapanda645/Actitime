package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {

	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement x;
	
	@FindBy(xpath="//span[.='Men']")
	private WebElement men;
	
	@FindBy(xpath="//span[.='Grooming Kits']")
	private WebElement grooming;
	
	@FindBy(xpath="(//img[@class='_1Nyybr _30XEf0'])[2]")
	private WebElement groom;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1wk2G8 _2HNZdt _7UHT_c']")
	private WebElement addcart;
	
	public Flipkart(WebDriver driver) {

PageFactory.initElements(driver, this);
	}
	
	
	public void m(WebDriver driver) throws InterruptedException
	{
		x.click();
		
		men.click();
		
		Actions a= new Actions(driver);
		a.moveToElement(grooming).click().perform();
		
	Thread.sleep(2000);
	
		groom.click();
		
	
		
		
		Thread.sleep(5000);
	
		
		
	}
	
	
	
}
