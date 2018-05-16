package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ChildWindow {

	public ChildWindow(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void m(WebDriver driver)
	{
		Set<String> s=driver.getWindowHandles();
	Iterator<String> u=	s.iterator();
	u.next();
		driver.switchTo().window(u.next());
		
		Reporter.log(driver.getTitle(),true);
		
	}
	


	}

