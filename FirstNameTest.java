package userregistrationjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNameTest {

	@Test
	public void test() {
		UserRegisterTest FirstName = new UserRegisterTest();
		boolean result = FirstName.usernameValidation("Nikita");
		assertEquals(true,result);
	}

}
