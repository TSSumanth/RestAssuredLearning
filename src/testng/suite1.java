package testng;

import static org.junit.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class suite1 
{
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
