package userregistrationjunit;

import java.util.Arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;


import userregistrationjunit.UserRegistrationException.ExceptionType;

public class UserRegisterTest 
{
	/**
	 * Test case to validate the first name and last name.
	 * @return boolean value
	 */
	public static boolean usernameValidation(String name) throws UserRegistrationException
	{
		String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		try 
		{
			if (name != null) 
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.First_name_invalid,"enter valid first name");
			}
			return m.matches();
		}
		catch (UserRegistrationException e)
		{
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.First_name_invalid,"enter valid first name");
		}
	}
	/**
	 * email is a function checks the email validity
	 * there are 3 mandatory  field abc , bridglabz , co
	 * two optional field   
	 * Returns the boolean value
	 */
	public static boolean email(String email) throws UserRegistrationException
	{
		String regex = "^[abc](.+)[A-Za-z+_.-]+@[bridgelabz](.+)[co](.+)[A-Za-z]$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		try 
		{
			if (email == null) 
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.Email_Invalid,"enter valid email address");
			}
			return m.matches();
		}
		catch (UserRegistrationException e)
		{
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.Email_Invalid,"enter valid email address");
		}
	}
	/**
	 * mobileNumValidation is a function to check the valid mobile number
	 * @param mobileNum
	 * @return the boolean value either true or false
	 * checking the country code  and 10 digit number must be there
	 */
	public static boolean mobileNumValidation(String mobileNum) throws UserRegistrationException
	{
		String mobileNumber = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(mobileNumber);
		Matcher m = p.matcher(mobileNum);
		try
		{
			if ( mobileNumber == null )
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.Mobile_number_Invalid,"enter valid mobile number");
			}
			return m.matches();
		}
		catch(UserRegistrationException e)
		{
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.Mobile_number_Invalid,"enter valid mobile number");
		}
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
	public static boolean passwordValidation(String password) throws UserRegistrationException
	{
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		try
		{
			if ( password == null )
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.Password_Invalid,"enter valid password");
			}
			return m.matches();
		}
		catch(UserRegistrationException e)
		{
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.Password_Invalid,"enter valid password");
		}
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
