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
	 * Returns the boolean value
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
	/**
	 * mobileNumValidation is a function to check the valid mobile number
	 * @param mobileNum
	 * @return the boolean value either true or false
	 * checking the country code  and 10 digit number must be there
	 */
	public static boolean mobileNumValidation(String mobileNum) 
	{
		String mobileNumber = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(mobileNumber);
		if ( mobileNumber == null )
		{
			return false;
		}
		Matcher m = p.matcher(mobileNum);
		return m.matches();
	}
	/**
	 * passwordValidation is a function to check password validation
	 * @param password
	 * @return boolean value 
	 * password validation part 1 is enter minimum 8 characters
	 * password validation part 2 is  having minimum 1 upper case character.
	 * password validation part 3 is having minimum 1 numeric value.
	 * password validation part 4 is having exactly 1 special character.
	 */
	public static boolean passwordValidation(String password) 
	{
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
		Pattern p = Pattern.compile(regex);
		if ( password == null )
		{
			return false;
		}
		Matcher m = p.matcher(password);
		return m.matches();
	}
	/**
	 * Email validation is function to check the sample emails which is predefine
	 */
	public static boolean emailValidate(String email)
	{
		
		String regex = "^[0-9A-Za-z]+(([._+-]{0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
		Pattern p = Pattern.compile(regex);
		if (email == null) 
		{
			return false;
		}
		 Matcher m = p.matcher(email);
		return m.matches();
	}
}
