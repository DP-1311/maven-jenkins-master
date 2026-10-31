package testng_ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsPracticeTest {

	@Test()
	public void case1() {
		
		boolean a = true;
		boolean b = false;
		
		String c = "abc";
		String d = "xyz";
		String e = "pqr";
		String f = "xyz";
		
		Object g = null;
		Object h = new Object();
	
// ------------------------------- Hard Assert -------------------------------------------------		

//		Assert.assertTrue(a);
//		Assert.assertFalse(b);
//		
//		Assert.assertEquals(d, f);
//		Assert.assertNotEquals(d, e);
//		
//		Assert.assertNull(g);
//		Assert.assertNotNull(h);
	
// ------------------------------- Soft Assert -------------------------------------------------		
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertTrue(a);
		sa.assertFalse(a);
		
		sa.assertEquals(d, f);
		sa.assertNotEquals(d, e);
		
		sa.assertNull(g);
		sa.assertNotNull(h);

		Reporter.log("Test Script Run Successfully", true);
		sa.assertAll();
		
	}
}