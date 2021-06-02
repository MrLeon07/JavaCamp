package JavaCampHomework5.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
		public static boolean matchEmail(String email) {
			String regex = "^[a-zA-z0-9_!-+%-._]+@[a-zA-Z0-9-]+.[a-z]+$";
			   Pattern pattern = Pattern.compile(regex);
			   Matcher matcher = pattern.matcher(email);
			
			   return matcher.matches();
			   
			
		}
}
