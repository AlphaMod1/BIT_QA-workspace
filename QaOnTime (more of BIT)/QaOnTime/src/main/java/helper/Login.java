package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public static void logIn (WebDriver dr, 
			String usr, String pass)
	{
		dr.get("http://www.qaontime.com/register");
		  dr.findElement(By.id("field-login-login")).sendKeys(usr);
		  dr.findElement(By.id("field-login-password")).sendKeys(pass);
		  dr.findElement(By.id("field-login-loginSubmit")).click();
	}
}
