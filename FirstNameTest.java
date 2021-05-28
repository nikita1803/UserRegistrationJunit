package userregistrationjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNameTest 
{
	@Test
	public void firstNameTest() {
		UserRegisterTest FirstName = new UserRegisterTest();
		boolean result = FirstName.usernameValidation("Nikki");
		assertEquals(true,result);
	}
	@Test
	public void lastNameTest() {
		UserRegisterTest LastName = new UserRegisterTest();
		boolean result = LastName.usernameValidation("Rai");
		assertEquals(true,result);
	}
	@Test
	public void emailTest() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.email("abc.xyz@bridgelabz.co.in");
		assertEquals(true,result);
	}
}
