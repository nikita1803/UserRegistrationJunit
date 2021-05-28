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
	@Test
	public void mobileNumValidation() {
		UserRegisterTest mobileNum = new UserRegisterTest();
		boolean result = mobileNum.mobileNumValidation("91 9523546770");
		assertEquals(true,result);
	}
	@Test
	public void passwordValidation() {
		UserRegisterTest password = new UserRegisterTest();
		boolean result = password.passwordValidation("12345678");
		assertEquals(true,result);
	}
}
