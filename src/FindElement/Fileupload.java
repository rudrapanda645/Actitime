package FindElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Fileupload 
{

	public static void main(String[] args) throws AWTException, InterruptedException  {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/upload/");
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).click();
		
		StringSelection s= new StringSelection("C:\\Users\\Pavilion\\Desktop\\resume\\9.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		
		Robot r= new Robot();
		Thread.sleep(2000);
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
