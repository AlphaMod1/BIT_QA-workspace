package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.beust.testng.TestNG;

import helper.Login;
import helper.MonethaAuth;
import helper.MonethaDeals;
import helper.MonethaProfile;
import helper.Quick;
import helper.TestAutomationFramework;
import helper.TestAutomationFramework.Browser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;

public class MonethaProfileTest
{
	protected TestAutomationFramework TAF = new TestAutomationFramework();
	protected MonethaProfile profile;
	@Test
	public void shouldBeAbleToUpdateProfile() throws InterruptedException
	{
		//MonethaProfile profile = ProfileFactory.getInstance().getProfile();
		profile.navigate();
		profile.getSettingsLink().click();
		profile.getHomeAddressInput().clear();
		String homeAddress = RandomStringUtils.random(10, true, false)+ " " + RandomStringUtils.random(5, false, true);
		profile.getHomeAddressInput().sendKeys(homeAddress);
		profile.getEmailInput().clear();
		profile.getEmailInput().sendKeys(RandomStringUtils.random(8, true, false)+ "@" + RandomStringUtils.random(5, true, true)+"."+RandomStringUtils.random(3, true, false));
		profile.getSubmitButton().click();
		
		Assert.assertEquals(profile.getSettingsNotificationBar().getText(), "Settings saved successfully!");
		Assert.assertEquals(profile.getHomeAddressInput().getAttribute("value"), homeAddress);
	}
	@Test
	public void shouldNotBeAbleToUpdateProfileWhenEmailInvalid() throws InterruptedException
	{
		//MonethaProfile profile = ProfileFactory.getInstance().getProfile();
		profile.navigate();
		profile.getSettingsLink().click();
		profile.getHomeAddressInput().clear();
		String homeAddress = RandomStringUtils.random(10, true, false)+ " " + RandomStringUtils.random(5, false, true);
		profile.getHomeAddressInput().sendKeys(homeAddress);
		//Thread.sleep(4000);
		profile.getEmailInput().clear();
		profile.getEmailInput().sendKeys(RandomStringUtils.random(8, true, false)+ "@@" + RandomStringUtils.random(5, true, true)+"."+RandomStringUtils.random(3, true, false));
		profile.getSubmitButton().click();
		
		
		//Assert.assertFalse(profile.getSettingsNotificationBar().getText().contains("Settings saved successfully!"));
		Assert.assertTrue(profile.getSettingsNotificationBar().getText().contains("Invalid email address entered"));
	}
	
	@BeforeMethod
	public void setup(){
	   //profile = ProfileFactory.getInstance().getProfile();
		//MonethaProfile profile = ProfileFactory.getInstance().getProfile();
		//try {
		//profile.navigate();
		//}catch(Exception e) {}
	}
	
	  @BeforeClass
	  public void beforeClass() throws Exception 
	  {
		 
		TAF.setUp(Browser.CHROME, "C:\\geckodriver.exe");
		TAF.authenticate("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTA5MjczMTUsImlhdCI6MTU0ODI0ODkxNSwibmJmIjoxNTQ4MjQ4OTE1LCJpZCI6NDkwM30.ACx2CqG8H5CGWtQa77sGhJ-zb7MRBz5Nu4raTxHM0HY");
		Assert.assertEquals(TAF.getWebDriver().getTitle(), "Monetha");
		profile= new MonethaProfile(TAF.getWebDriver());
		TAF.getWebDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	   
		  
	  }
	 
	  @AfterClass
	  public void afterClass() {
		  //if(TAF.getWebDriver()!=null) TAF.getWebDriver().quit();
		  
	  }
}
