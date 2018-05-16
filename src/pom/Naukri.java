package pom;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Naukri {

	
	
	
	@FindBy(id="uploadBtnCont")
	private WebElement upload;
	
	
	public Naukri(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void m(WebDriver driver) throws InterruptedException
	{
		
		
		
		upload.click();
		Thread.sleep(5000);
	Set<String> w=	driver.getWindowHandles();
	
	
	               Iterator<String> u=    w.iterator();
	    u.next();
	    
	    driver.switchTo().window(u.next());
	    
	    System.out.println(driver.getTitle());
	    
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
