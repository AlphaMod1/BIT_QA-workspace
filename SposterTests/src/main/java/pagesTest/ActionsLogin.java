package pagesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsLogin {

	WebDriver driver;
	private String usernameInputID = "username";
	private String passwordInputID = "password";
	private String rememberMeCheckboxXpath = "//*[@id=\"sp-component\"]/div/div[2]/div/div/form/div[3]/label";
	private String loginBtnClass = "btn-primary";
	
	
	public ActionsLogin(WebDriver driver) {
		this.driver = driver;
	}



	public WebElement getUsernameInputID() {
		return driver.findElement(By.id(usernameInputID));
	}



	public WebElement getPasswordInputID() {
		return driver.findElement(By.id(passwordInputID));
	}



	public WebElement getRememberMeCheckboxXpath() {
		return driver.findElement(By.xpath(rememberMeCheckboxXpath));
	}



	public WebElement getLoginBtnClass() {
		return driver.findElement(By.className(loginBtnClass));
	}



	public void login(String user, String pass, boolean checkbox, boolean finishLogin) {
		getUsernameInputID().sendKeys(user);
		getPasswordInputID().sendKeys(pass);
		if(checkbox) {getRememberMeCheckboxXpath().click();}
		if(finishLogin) {getLoginBtnClass().click();}
	}
	
}
