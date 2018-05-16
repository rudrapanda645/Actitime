package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileDownload {

	
	
	@Test
	public void m()
	{
		FirefoxProfile f= new FirefoxProfile();
		f.setPreference("browser.download.folderList", 2);
		f.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		f.setPreference("browser.download.dir", "E:\\Software");
		WebDriver driver=new FirefoxDriver(f);
		driver.get("https://www.seleniumhq.org/download/");
		
	
		pom.FileDownload a= new pom.FileDownload(driver);
		a.n(driver);
		
		
	}
	
	
	
	
	
}
