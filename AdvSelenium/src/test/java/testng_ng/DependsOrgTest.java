package testng_ng;

import static org.testng.Assert.assertTrue;

//import static org.testng.Assert.assertTrue;

//import org.testng.Assert;

import org.testng.annotations.Test;

public class DependsOrgTest {

	@Test 
	public void createOrgTest() {
		System.out.println("Created qSpiders");
	}

	@Test (dependsOnMethods= "createOrgTest")
	public void modifyOrgTest() {
//		assertTrue(true);
	assertTrue(false);
		System.out.println("Modify qSpiders");
	}

	@Test (dependsOnMethods = "modifyOrgTest")
	public void deleteOrgTest() {
		System.out.println("Delete qSpiders");

	}

}
