package testng;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = { "checkin-test" })
@Listeners(utilites.TestNgListner.class)
public class suite1 
{
	@Ignore
	@Parameters({"a","b"})  
	@Test(groups={"functest","checkintest"},priority=2,enabled=false
			,dependsOnMethods={"testTwo","testThree"},dependsOnGroups= {"test-group"},
			alwaysRun=true,expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = ".* Message .*"
			,timeOut = 500,dataProvider = "data-provider" )
	public void mytest(HashMap hm){
	}


	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	
	@Test
	public void test1() {
		assertEquals("sum calculation",2+3, 5);
		System.out.println("Test");
	}
	
	
	


}
