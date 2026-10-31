package testng_ng;

import static org.testng.Assert.assertTrue;

//import static org.testng.Assert.assertTrue;

//import org.testng.Assert;

import org.testng.annotations.Test;

public class Org_Test {

	@Test ()
	public void createOrgTest() {
		System.out.println("Created qSpiders");
	}

	@Test ()
	public void modifyOrgTest() {
		assertTrue(true);
//		assertTrue(false);
		System.out.println("Modify qSpiders");
	}

	@Test ()
	public void deleteOrgTest() {
		System.out.println("Delete qSpiders");

	}

}
