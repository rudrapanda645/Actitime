package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void f()
	{
		Reporter.log("rudra",true);
	}
	
	
	@Test(dependsOnMethods="f")
	public void b()
	{
		Reporter.log("satya",true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("ashish",true);
	}
	
	
	@Test(dependsOnMethods="c")
     public void v()
     {
		Reporter.log("bnm",true);
     }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



