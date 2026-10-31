package testng_ng;

import static org.testng.Assert.assertTrue;

//import static org.testng.Assert.assertTrue;

//import org.testng.Assert;

import org.testng.annotations.Test;

public class EnabledOrgTest {
		
	@Test (priority=-1)
	public void createOrgTest() {
		System.out.println("Created qSpiders");
	}
	
	@Test (enabled=false)
	public void modifyOrgTest() {
		assertTrue(true);
//		assertTrue(false);
		System.out.println("Modify qSpiders");
	}
	
	@Test (enabled=false, dependsOnMethods="modifyOrgTest", priority=1)
	public void deleteOrgTest() {
		System.out.println("Delete qSpiders");
		
	}

}
