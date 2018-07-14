package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class Practice
{
	 @Test(priority=2,invocationCount=2)
	 public void f()
	 {
		WebDriver driver= new FirefoxDriver();
		driver.get("http:/www.google.com/");
	 }
	 
	 
	 @Test(priority=1)
	 public void a()
	 {
		 Reporter.log("rudra",true);
	 }
	 
	 
	
	
	
	}