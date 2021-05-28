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
		boolean result = password.passwordValidation("Nikita@8");
		assertEquals(true,result);
	}
	@Test
	public void emailValid1() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc@yahoo.com");
		assertEquals(true,result);
	}
	@Test
	public void emailValid2() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc-100@yahoo.com");
		assertEquals(true,result);
	}
	@Test
	public void emailValid3() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc.100@yahoo.com");
		assertEquals(true,result);
	}
	@Test
	public void emailValid4() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc111@abc.com");
		assertEquals(true,result);
	}
	@Test
	public void emailValid5() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc-100@abc.net");
		assertEquals(true,result);
	}
	@Test
	public void emailValid6() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc.100@abc.com.au");
		assertEquals(true,result);
	}
	@Test
	public void emailValid7() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc@1.com");
		assertEquals(true,result);
	}
	@Test
	public void emailValid8() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc@gmail.com");
		assertEquals(true,result);
	}
	@Test
	public void emailValid9() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc@yahoo.com");
		assertEquals(true,result);
	}
	@Test
	public void emailValid10() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc+100@gmail.com");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid1() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid2() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc@.com.my");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid3() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc123@gmail.a");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid4() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc123@.com");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid5() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc123@.com.com");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid6() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate(".abc@abc.com");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid7() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc()*@gmail.com");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid8() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc@%*.com");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid9() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc..2002@gmail.com");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid10() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc.@gmail.com");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid11() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc@abc@gmail.com");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid12() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc@gmail.com.1a");
		assertEquals(true,result);
	}
	@Test
	public void emailInValid13() {
		UserRegisterTest email = new UserRegisterTest();
		boolean result = email.emailValidate("abc@gmail.com.aa.au");
		assertEquals(true,result);
	}
}
