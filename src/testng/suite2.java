package testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class suite2 
{

	@Test
	public void test2() {
		System.out.println("Test 2");
		assertEquals(2,3);
	}
}
