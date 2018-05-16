package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(priority=1 , invocationCount=2)
	public void m()
	{
		Reporter.log("Rudra",true);
		
		
	}

	@Test(priority=3,invocationCount=3)
	public void a()
	{
		Reporter.log("amar",true);
	}




	@Test(priority=2,invocationCount=4)
	public void v()
	{
		Reporter.log("Ashisj",true);
	}

		
}
