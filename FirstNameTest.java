package userregistrationjunit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class FirstNameTest extends UserRegisterTest
{
	@Test
	public void firstNameTest()
	{
		UserRegisterTest FirstName = new UserRegisterTest();
		boolean result;
		try 
		{
			result = FirstName.usernameValidation("Nikita");
		} 
		catch (UserRegistrationException e) 
		{
			e.printStackTrace();
		}
	}
	@Test
	public void lastNameTest() throws UserRegistrationException
	{
		UserRegisterTest LastName = new UserRegisterTest();
		boolean result;
		try 
		{
			result = LastName.usernameValidation("Rai");
		}
		catch(UserRegistrationException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void emailTest() throws UserRegistrationException
	{
		UserRegisterTest email = new UserRegisterTest();
		boolean result;
		try
		{
		 result = email.email("abc.xyz@bridgelabzs.co.in");
		}
		catch(UserRegistrationException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void mobileNumValidation() 
	{
		UserRegisterTest mobileNum = new UserRegisterTest();
		boolean result;
		try
		{
			result = mobileNum.mobileNumValidation("91 9523546770");
		}
		catch(UserRegistrationException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void passwordValidation() 
	{
		UserRegisterTest password = new UserRegisterTest();
		boolean result;
		try
		{
			result = password.passwordValidation("Nikita@8");
		}
		catch(UserRegistrationException e)
		{
			e.printStackTrace();
		}
	}
	 private String emailId;
     private String expectedResult;
     public FirstNameTest(String emailId,String expectedResult)
     {
    	 super();
    	 this.emailId=emailId;
    	 this.expectedResult=expectedResult;
     }
     @Parameterized.Parameters
     public static Collection input ()
     {
         return Arrays.asList( new Object[][] { { "abc@xyz.com", "abc"} });
     }
}
