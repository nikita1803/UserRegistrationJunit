package userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegisterTest 
{
	/**
	 * Test case to validate the first name and last name.
	 * @return boolean value
	 */
	public static boolean usernameValidation(String name) 
	{
		String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
		Pattern p = Pattern.compile(regex);
		if (name == null) 
		{
			return false;
		}
		 Matcher m = p.matcher(name);
		 return m.matches();	 
	}
	
}
