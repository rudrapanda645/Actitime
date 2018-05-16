package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownload {

	@FindBy(id="close")
	private WebElement close;
	
	
	@FindBy(xpath="//td[.='Java']/..//a[.='Download']")
	private WebElement download;
	public FileDownload(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void n(WebDriver driver)
	{
		
		close.click();
		download.click();
		
		
		
		
	}
	
	
}
