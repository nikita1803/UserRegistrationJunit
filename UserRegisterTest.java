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
	/**
	 * email is a function checks the email validity
	 * there are 3 mandatory  field abc , bridglabz , co
	 * two optional field   
	 */
	public static boolean email(String email)
	{
		
		String regex = "^[abc](.+)[A-Za-z+_.-]+@[bridgelabz](.+)[co](.+)[A-Za-z]$";
		Pattern p = Pattern.compile(regex);
		if (email == null) 
		{
			return false;
		}
		 Matcher m = p.matcher(email);
		return m.matches();
	}
	
}
