package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yatra {

	@FindBy(xpath="//input[@id='BE_flight_origin_city']")
	private WebElement from;
	
	@FindBy(id="BE_flight_arrival_city")
private WebElement t0;
	
	
	@FindBy(id="BE_flight_origin_date")
	private WebElement date;
	
	@FindBy(xpath="//td[@id='31/05/2018']")
	private WebElement flightdate;
	
	@FindBy(id="BE_flight_arrival_date")
	private WebElement returndate;
	
	@FindBy(xpath="//td[@id='05/06/2018']")
	private WebElement returndate1;
	
	@FindBy(xpath="//span[@class='txt-ellipses flight_passengerBox']")
	private WebElement traveller;
	
	@FindBy(xpath="(//span[contains(@class,'ddSpinnerPlus')])[1]")
	private WebElement adult;
	
	@FindBy(id="BE_flight_flsearch_btn")
	private WebElement search;
	
	public Yatra(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	
	}
	
	
	
  public void flight() throws InterruptedException, AWTException
  {
	  
	  from.sendKeys("BBI");
	  
	  Thread.sleep(2000);
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	 
	  
	  t0.sendKeys("BLR");
	  
	  Thread.sleep(2000);
	
	  r.keyPress(KeyEvent.VK_ENTER);
	  
	  date.click();
	  
	  flightdate.click();
	  
	  Thread.sleep(2000);
	  
	  
	  returndate.click();
	  
	  
	  returndate1.click();
	  
	  Thread.sleep(2000);
	  
	  traveller.click();
	  
	  
	  adult.click();
	  
	  Thread.sleep(2000);
	  search.click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
