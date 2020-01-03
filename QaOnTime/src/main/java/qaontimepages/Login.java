package qaontimepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public void logIn(String username, String password, WebDriver driver){
		  driver.get("http://qaontime.com/register/");
		  driver.findElement(By.id("field-login-login")).clear();
		  driver.findElement(By.id("field-login-password")).clear();
		  driver.findElement(By.id("field-login-login")).sendKeys(username);
		  driver.findElement(By.id("field-login-password")).sendKeys(password);
		  driver.findElement(By.id("field-login-loginSubmit")).click();
	}
	
	public void logOut(WebDriver driver) {
		driver.findElement(By.linkText("Log Out")).click();
	}

}
