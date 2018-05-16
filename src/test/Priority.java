package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority=1)
public void m()
{
	Reporter.log("Rudra",true);
	
	
}

@Test(priority=3)
public void a()
{
	Reporter.log("amar",true);
}




@Test(priority=2)
public void v()
{
	Reporter.log("Ashisj",true);
}

	
}
