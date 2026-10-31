package typesOfExecution;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution_CrossBrowser {

	@Parameters({"bro","url","un","pwd"})
	@Test
	public void commonData(String browser, String url, String username, String password){
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	
}
