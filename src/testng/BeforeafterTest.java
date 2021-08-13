package testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeafterTest {	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}

}
