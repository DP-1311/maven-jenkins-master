package testng_ng;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

//import static org.testng.Assert.assertTrue;

//import org.testng.Assert;

import org.testng.annotations.Test;

public class AlwaysRunTest {

	@Test 
	public void createOrgTest() {
		System.out.println("Created qSpiders");
	}

	@Test (dependsOnMethods= "createOrgTest")
	public void modifyOrgTest() {
//		assertTrue(true);
//	assertTrue(false);
	Assert.assertTrue(false);
		System.out.println("Modify qSpiders");
	}

	@Test (dependsOnMethods = "modifyOrgTest", alwaysRun=true) 
	// Without alwaysRun=true this test case will going to be skipped
	public void deleteOrgTest() {
		System.out.println("Delete qSpiders");

	}

}
