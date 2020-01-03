package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class Dependency {
	
	
	public String username = "";
	public String password = "";
	public Boolean isLogedIn = false;
	public Boolean clickOnProfile = false;
	
	public void login() {
		
		if(username == "user" && password == "1234") {
			isLogedIn = true;
		}
		else {
			isLogedIn = false;
		}
		
	}
	
	@Test(dependsOnMethods = { "loginWithBadAcc" })
	public void loginWithGoodAcc() {
		username = "user";
		password = "1234";
		login();
		Assert.assertTrue(isLogedIn);
	}
	
	@Test
	public void loginWithBadAcc() {
		username = "asdf";
		password = "1234";
		login();
		Assert.assertFalse(isLogedIn);
	}
	
	@Test(dependsOnMethods = { "loginWithGoodAcc" })
	public void ClickToNavigateToProfile() {
		if(isLogedIn) {
			clickOnProfile = true;
		}
		Assert.assertTrue(clickOnProfile);
	}
	
	
	


}
