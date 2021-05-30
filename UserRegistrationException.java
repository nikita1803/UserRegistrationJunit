package userregistrationjunit;

public class UserRegistrationException extends Exception 
{
	public enum ExceptionType
	{
		First_name_invalid,
		Last_name_invalid,
		Email_Invalid,
		Mobile_number_Invalid,
		Password_Invalid,
		No_error
	}
	ExceptionType type;
	public UserRegistrationException(ExceptionType type, String message) 
	{
	    super();
	    this.type = type;
	}
}
