package test;

import org.testng.annotations.Test;

import BfMethod.Faceb;

import Excel.Excel;

public class Facebook1 extends Faceb
{

	@Test
	public void f() throws InterruptedException
	{
		
		String em=Excel.getCellValue("E:/excel.xlsx", "Sheet1", 3, 0);
		String pwd=Excel.getCellValue("E:/excel.xlsx", "Sheet1", 1, 1);
		pom.Facebook1 z= new pom.Facebook1(driver);
		z.m(em,pwd);
	}
	
	
	
	
	
	
}
