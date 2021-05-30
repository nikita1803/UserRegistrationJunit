package userregistrationjunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validate 
{
	boolean validation(String input);
	static void  printResult(String input,String function, Validate fobj) 
	{
		System.out.println("Result of "+function+" is "+fobj.validation(input));
	}
}
public class UserRegistrationLambda 
{
	public static void main(String[] args) 
	{
		//First name validation
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter your first Name : ");
		String firstName = sc.nextLine();	
			
		Validate firstname = f -> 
		{
			Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z A-Z]{2,}$");
			Matcher matcher = pattern.matcher(f);
			return matcher.find();
		};
		Validate.printResult(firstName,"First Name validation", firstname);
		
		//Last name validation
		System.out.println("Enter your Last Name : ");
		String lastName = sc.nextLine();	
			
		Validate lastname = l -> 
		{
			Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z A-Z]{2,}$");
			Matcher matcher = pattern.matcher(l);
			return matcher.find();
		};
		Validate.printResult(lastName,"Last Name validation", lastname);
		
		//Email validation
		System.out.println("Enter your email : ");
		String email = sc.nextLine();	
					
		Validate Email = e -> 
		{
			Pattern pattern = Pattern.compile("^[0-9A-Za-z]+(([._+-]{0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$");
			Matcher matcher = pattern.matcher(e);
			return matcher.find();
		};
		Validate.printResult(email,"email Name validation", Email );
		
		//Mobile number validation
		System.out.println("Enter your mobile number : ");
		String mobileNumber = sc.nextLine();	
							
		Validate Number = n -> 
		{
			Pattern pattern = Pattern.compile("^[9][1]\\s[6-9]{1}[0-9]{9}$");
			Matcher matcher = pattern.matcher(n);
			return matcher.find();
		};
		Validate.printResult(mobileNumber,"mobile number validation", Number );
		
		//password validation
		System.out.println("Enter your password : ");
		String password = sc.nextLine();	
									
		Validate Password = p -> 
		{
			Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$");
			Matcher matcher = pattern.matcher(p);
			return matcher.find();
		};
		Validate.printResult(password,"password validation", Password );
				
	}
}
