package utilites;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListner extends FrameworkLib implements ITestListener
{
	
	 public void onTestStart(ITestResult result) {
		   System.out.println("Listener On Test Start: "+ result.getName());		  
	}

}
