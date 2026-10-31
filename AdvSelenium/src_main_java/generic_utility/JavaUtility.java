package generic_utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaUtility {

	public static int generateRandomNumber() {
		
	int random = (int)(Math.random() * 1000);
	return random;
		
	}
	
	public static long getTodaysDateTime() {
//	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//	    return LocalDateTime.now().format(formatter);
		return System.currentTimeMillis()/1000;
	}
	
	
}