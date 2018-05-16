package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail {

	
	@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
	private WebElement compose;
	
	@FindBy(xpath="//textarea[@name='to']")
	private WebElement to;
	
	@FindBy(xpath="//div[@id=':pk']")
	private WebElement attachfile;
	
	
	
	public Gmail(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void compose() throws InterruptedException, AWTException 
	{
		
		
		
		Thread.sleep(2000);
		
		
		compose.click();
		
		Thread.sleep(2000);
		to.sendKeys("rudrapanda645@gmail.com");
		Thread.sleep(2000);
		
		attachfile.click();
		
		StringSelection s= new StringSelection("Downloads\\Amar jyoti\\");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
	  Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}
		
}	
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

