package ddt_extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
	
	// Creating JRO of the Physical File
	FileInputStream fis = new FileInputStream("./src/test/resources/Properties.properties");
	
	// Loading all the keys by using load method which comes from Properties class of Java
	Properties pObj= new Properties();
	pObj.load(fis);
	
	// Getting the Value by Loading all the keys by using getProperty Method which is also comes from Properties class of Java
	String URL=pObj.getProperty("url");
	System.out.println(URL);
	String UN=pObj.getProperty("username");
	System.out.println(UN);
	String PWD=pObj.getProperty("password");
	System.out.println(PWD);
	String url_sauceDemo=pObj.getProperty("urlSauceDemo");
	System.out.println(url_sauceDemo);
	}
}