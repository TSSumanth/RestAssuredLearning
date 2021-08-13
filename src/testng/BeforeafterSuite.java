package testng;
import java.util.HashMap;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeafterSuite {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite");
		Object data[][] = new Object[7][1];
		HashMap map = new HashMap();
		map.put("Name1", "value1");
		map.put("Name2", "value2");
		map.put("Name3", "value3");
		map.put("Name4", "value4");
		
		data[1][1] = map;
		data[2][1] = map;
		data[3][1] = map;
		data[4][1] = map;
		data[5][1] = map;
		data[6][1] = map;
		data[7][1] = map;
	}
	
	
	

}
