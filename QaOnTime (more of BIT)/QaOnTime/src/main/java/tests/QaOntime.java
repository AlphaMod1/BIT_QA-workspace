package tests;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.swing.text.Document;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.beust.testng.TestNG;

import helper.Login;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;

public class QaOntime {
	public WebDriver driver;
	Login login = new Login();
	@Test
	  public void loginWithBadPass() {
		
		  login.logIn(driver, "mberlickas@aol.com", "pass2");
		  String str = driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[2]/p")).getText();
		  //assertFalse(str, "Incorrect value: Invalid login or password.");
		  assertTrue(str.contains("Incorrect value: Invalid login or password"));
		  
	  }
	
//	protected String actual, expected;
//	@Test
//	public void assertEqualsTest(){Assert.assertEquals("hey", "ho");}
//	@Test
//	public void assertNotEqualsTest(){Assert.assertNotEquals(actual, expected);}
//	@Test
//	public void assertTrueTest(){Assert.assertTrue(1==1);}
//	@Test
//	public void assertFalseTest(){Assert.assertFalse(1==1);}
//	public void assertNullTest(){Assert.assertNull(null);}
//	@Test
//	public void assertNotNullTest(){Assert.assertNotNull(actual);}
	
	@Test
	public void deleteIssue() 
	{
		login.logIn(driver, "mberlickas@aol.com", "BalticTalents2018");
		//////////////////////////////html/body/div[2]/table/tbody/tr[1]/td[1]/div/table/tbody/tr[6]/td/a[2]/i
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/table/tbody/tr[6]/td/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/table/tbody/tr[7]/td[1]/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/a[2]")).click();
		driver.findElement(By.linkText("Delete Issue")).click();
		driver.findElement(By.name("okSubmit")).click();
		
	}
	@Test public void logIn()
	{
		login.logIn(driver, "mberlickas@aol.com", "BalticTalents2018");
	}
	@Test
	public void createIssue()
	{
		login.logIn(driver, "mberlickas@aol.com", "BalticTalents2018");
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/table/tbody/tr[6]/td/a[1]/img")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/table/tbody/tr[7]/td[1]/a[2]")).click();
		driver.findElement(By.linkText("Add Issue")).click();
		
		
		//Now Cursor by default sits in the "Name"tbx
		driver.switchTo().activeElement().sendKeys(RandomStringUtils.random(10, true, false));
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		//Select dropDownBox = new Select(driver.switchTo().activeElement());
		//dropDownBox.selectByVisibleText("As Designed");
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.findElement(By.id("field-issues-descriptionText")).sendKeys(RandomStringUtils.random(10, true, true));
		driver.findElement(By.id("field-issues-okSubmit")).click();
	}
	  
	@Test
	public void logOut()
	{
		login.logIn(driver, "mberlickas@aol.com", "BalticTalents2018");
		driver.findElement(By.linkText("Log Out")).click();
	}
	  @BeforeClass
	  public void beforeClass() {
	   
	   System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	   driver = new FirefoxDriver();
	   
	   
	   //String str = driver.findElement(By.id("infobar-right")).getText();
	   //assertTrue(str.contains("Logged in as:"));
	  }
	 
	  @AfterClass
	  public void afterClass() {
		 // driver.findElement(By.linkText("Log Out")).click();
		  //driver.close();
	  }
}
