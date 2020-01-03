package sposterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesTest.ActionsLogin;
import pagesTest.MainActions;

public class Login {
	
	public WebDriver driver;
	
	@Test
	public void shouldLogin_WithACeckMark() throws InterruptedException {
		ActionsLogin action = new ActionsLogin(driver);
		MainActions mainA = new MainActions(driver);
		driver.get("https://test.sposter.co");
		action.login("matthewalcjcffgbbgi", "TestNG@2019" , true, true);
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.cssSelector("#sp-logo > div > div > div > div > div.banner > p > strong")).getText(),"MATTHEW ALCJCFFGBBGIG ALISONSKY");
		mainA.logout();
	}

	@Test
	public void NF_ShouldFailLogin_BadUsername_WithACeckMark() {
		
		ActionsLogin action = new ActionsLogin(driver);

		
		driver.get("https://test.sposter.co");
		action.login("BadUsername12345678910", "TestNG@2019" , true, true);
		
		Assert.assertEquals(driver.findElement(By.cssSelector("#system-message > div > div > p")).getText(), "Username and password do not match or you do not have an account yet.");
	}
	
	@Test
	public void NF_ShouldFailLogin_BadPassword_WithACeckMark() {
		
		ActionsLogin action = new ActionsLogin(driver);
		
		driver.get("https://test.sposter.co");
		action.login("matthewalcjcffgbbgi", "BadPassword" , true, true);
		
		Assert.assertEquals(driver.findElement(By.cssSelector("#system-message > div > div > p")).getText(), "Username and password do not match or you do not have an account yet.");
		
	}
	
	@Test
	public void shouldLogin_WithOutACeckMark() throws InterruptedException {
		ActionsLogin action = new ActionsLogin(driver);
		MainActions mainA = new MainActions(driver);
		driver.get("https://test.sposter.co");
		action.login("matthewalcjcffgbbgi", "TestNG@2019" , false, true);
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.cssSelector("#sp-logo > div > div > div > div > div.banner > p > strong")).getText(),"MATTHEW ALCJCFFGBBGIG ALISONSKY");
		mainA.logout();
	}

	@Test
	public void NF_ShouldFailLogin_BadUsername_WithOutACeckMark() {
		
		ActionsLogin action = new ActionsLogin(driver);

		
		driver.get("https://test.sposter.co");
		action.login("BadUsername12345678910", "TestNG@2019" , false, true);
		
		Assert.assertEquals(driver.findElement(By.cssSelector("#system-message > div > div > p")).getText(), "Username and password do not match or you do not have an account yet.");
	}
	
	@Test
	public void NF_ShouldFailLogin_BadPassword_WithOutACeckMark() {
		
		ActionsLogin action = new ActionsLogin(driver);
		
		driver.get("https://test.sposter.co");
		action.login("matthewalcjcffgbbgi", "BadPassword" , false, true);
		
		Assert.assertEquals(driver.findElement(By.cssSelector("#system-message > div > div > p")).getText(), "Username and password do not match or you do not have an account yet.");
		
	}
	
	@Test
	public void NF_ShouldFailLogin_EmptyUserFields_WithOutACeckMark() {
		
		ActionsLogin action = new ActionsLogin(driver);
		
		driver.get("https://test.sposter.co");
		action.login("", "" , false, true);
		
		Assert.assertEquals(driver.findElement(By.className("agreement")).getText(), "By clicking Log in or Sign in, you agree to Sposter Terms and Conditions and Privacy Policy.");
		
	}
	
	@Test
	public void NF_ShouldFailLogin_EmptyUserFields_WithACheckMark() {
		
		ActionsLogin action = new ActionsLogin(driver);
		
		driver.get("https://test.sposter.co");
		action.login("", "" , true, true);
		
		Assert.assertEquals(driver.findElement(By.className("agreement")).getText(), "By clicking Log in or Sign in, you agree to Sposter Terms and Conditions and Privacy Policy.");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
}
