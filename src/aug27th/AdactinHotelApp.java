package aug27th;

import org.testng.annotations.Test;

import graphql.Assert;

public class AdactinHotelApp {
	
	
	@Test(priority=2)
	public void loginTest()
	{
		System.out.println("Browser started..");
		System.out.println("App launched..");
		Assert.assertTrue(false);
		System.out.println("Login Successful...");
		System.out.println("Browser closed");
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		System.out.println("Browser started..");
		System.out.println("App launched..");
		System.out.println("Registration Successful...");
		System.out.println("Browser closed");
		
	}
	
	@Test(priority=3)
	public void forgotPasswordTest()
	{
		System.out.println("Browser started..");
		System.out.println("App launched..");
		System.out.println("ForgotPassword Successful...");
		System.out.println("Browser closed");
		
	}
	
	@Test(priority=4,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		System.out.println("Browser started..");
		System.out.println("App launched..");
		System.out.println("ChangePassword Successful...");
		System.out.println("Browser closed");
		
	}

}
