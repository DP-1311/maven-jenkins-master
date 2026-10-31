package ddt_extra;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetDataFromJSONFile {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		// JRO of the Physical File
		FileReader fr = new FileReader("./src/test/resources/JSON.json");

		// Using Parse Method, obtain the Java Object
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(fr);

		// Downcast so that we can obtain JSON Object from the Java Object
		// Java Object don't have the method like get method thats why Performing Downcasting

		JSONObject jObj = (JSONObject) obj;

		// Passing the keys and get the values
		String URL = jObj.get("url").toString();
		System.out.println(URL);
		String UN = jObj.get("username").toString();
		System.out.println(UN);
		String PWD = jObj.get("password").toString();
		System.out.println(PWD);
	}

}
