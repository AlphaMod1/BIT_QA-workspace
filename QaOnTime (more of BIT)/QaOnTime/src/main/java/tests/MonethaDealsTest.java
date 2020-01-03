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
import helper.Quick;
import helper.TestAutomationFramework;
import helper.TestAutomationFramework.Browser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;

public class MonethaDealsTest 
{
	protected MonethaDeals secondUsersDeal;
	protected TestAutomationFramework TAF = new TestAutomationFramework();
	protected TestAutomationFramework TAF2 = new TestAutomationFramework();
	protected String title;
	
	@Test(groups= {"smoke"})
	public void shouldBeAbleToCreateDeal() throws InterruptedException
	{
		MonethaDeals deal = new MonethaDeals(TAF.getWebDriver());
		TAF.getWebDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		deal.navigate(); 
		
		try {WebElement w = deal.getCreateButton();}
			catch(NoSuchElementException e){Assert.assertTrue(false, "Unable to locate CreateButton element");}
		
		
		deal.getCreateButton().click(); 
		Assert.assertEquals(TAF.getWebDriver().findElement(By.tagName("h2")).getText(), "Make a deal");
		deal.getIamSellingButton().click(); 
		Assert.assertEquals(TAF.getWebDriver().findElement(By.tagName("h2")).getText(), "Add details");
		title = RandomStringUtils.random(10, true, false);
		deal.getTitleInput().sendKeys(title);
		deal.getDescriptionTextarea().sendKeys(RandomStringUtils.random(10, true, true));
		deal.getPriceInput().sendKeys(RandomStringUtils.random(3, false, true));
		deal.getConditionUsedButton().click();
		deal.getNotDefectedButton().click();
		
		deal.getAddPhotos().sendKeys("C:\\acacia.png");
		deal.getContinueButton().click();
		Assert.assertEquals(TAF.getWebDriver().findElement(By.tagName("h2")).getText(), "Share your deal");
		deal.getPrivatelyShareButton().click();
		
		deal.getPhoneNumberInput().sendKeys("+37062055073");
		
		//new WebDriverWait(TAF.getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(deal.getSendButton()));
		deal.getSendButton().click();
		
		
		//TAF.getWebDriver().manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		///driver.manage().timeouts().pageLoad
		
		String finalMessage = TAF.getWebDriver().findElement(By.cssSelector("div.mh-notification-bar.mh-notification-bar-type-success.mh-text-center")).getText();
		Assert.assertTrue(finalMessage.toLowerCase().contains("buyer has 24 hours to review and accept"), "SUCCESS");
		
		/*
		String listMessage = TAF.getWebDriver().findElements(By.cssSelector("div.mh-deal-title")).get(0).getText();
		System.out.println(listMessage);
		System.out.println(title);
		Assert.assertTrue(listMessage.contains(title));
		*/
		Thread.sleep(4000);
		
		TAF.getWebDriver().findElement(By.cssSelector("div.mh-tabs-container.container"));//Force impl. wait
		
		String titleTextByXpath =
				TAF.getWebDriver().findElement(By.xpath("//div[contains(text(),'"+title+"')]")).getText();
		Assert.assertTrue(titleTextByXpath.contains(title));
		
	}
	
	@Test(dependsOnMethods="shouldBeAbleToCreateDeal")
	public void shouldBeAbleToConfirmDealDetails() throws Exception
	{
		
		TAF2.setUp(Browser.CHROME, "C:\\geckodriver.exe");
		TAF2.authenticate("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTA0MTM5NjEsImlhdCI6MTU0NzczNTU2MSwibmJmIjoxNTQ3NzM1NTYxLCJpZCI6NDkwMn0.5i2K-YtUJptHMMP4V0ICcwJxsxi_pFEnGUiCqX1G7Ks");
		TAF2.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(TAF.getWebDriver().getTitle(), "Monetha");
		secondUsersDeal = new MonethaDeals(TAF2.getWebDriver());
		secondUsersDeal.navigate();
		
		Quick.Assert(secondUsersDeal, "getCreateButton");
		
		secondUsersDeal.getFirstDeal(title).click();
		
		
		Quick.Assert(secondUsersDeal, "getConfirmDetailsButton");
		secondUsersDeal.getConfirmDetailsButton().click();
		
		Quick.Assert(secondUsersDeal, "getYesTheDetailsAreCorrectButton");
		secondUsersDeal.getYesTheDetailsAreCorrectButton().click();
		
		;
		
		
		
		
	}
	@Test(dependsOnMethods="shouldBeAbleToConfirmDealDetails")
	private void shouldBeAbleToPayForDealWithCash() throws InterruptedException
	{
		secondUsersDeal.getPayForDealButton().click();
		
		secondUsersDeal.getPayWithCashButton().click();
		
		Assert.assertTrue(TAF2.getWebDriver()
				.findElement(By.xpath("//div[contains(text(),'wait for seller to confirm')]"))
				.getText().contains("wait for seller to confirm"));
	}
	
	@Test(dependsOnMethods="shouldBeAbleToPayForDealWithCash")
	private void shouldBeAbleToConfirmPayment() throws InterruptedException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		MonethaDeals deal = new MonethaDeals(TAF.getWebDriver());
		deal.navigate();
		
		deal.getFirstDeal(title).click();
		
		Quick.Assert(deal, "getConfirmPaymentButton");
		deal.getConfirmPaymentButton().click();
		
		Quick.Assert(deal, "getYesIHaveReceivedPaymentButton");
		deal.getYesIHaveReceivedPaymentButton().click();
		
		String contents = TAF.getWebDriver().findElement(By.xpath("//div[contains(text(), 'Deal closed')]")).getText();
		Assert.assertTrue(contents.toLowerCase().contains("deal closed"));
		
	}
	
	
	@Test
	public void shouldNotBeAbleToCreateADealWhenPriceIsNotNumber() throws InterruptedException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		MonethaDeals deal = new MonethaDeals(TAF.getWebDriver());
		
		
		
		deal.navigate();
		Quick.Assert(deal, "getCreateButton");
		deal.getCreateButton().click();
		Quick.Assert(deal, "getIamSellingButton");
		deal.getIamSellingButton().click();
		String title = RandomStringUtils.random(10, true, false);
		Quick.Assert(deal, "getTitleInput");
		deal.getTitleInput().sendKeys(title);
		deal.getDescriptionTextarea().sendKeys(RandomStringUtils.random(10, true, true));
		deal.getPriceInput().sendKeys(RandomStringUtils.random(3, true, false));
		deal.getConditionUsedButton().click();
		deal.getNotDefectedButton().click();
		deal.getContinueButton().click();
		
		
	
		
		String finalMessage = TAF.getWebDriver().findElements(By.cssSelector("div.mh-notification-bar.mh-notification-bar-type-error")).get(0).getText();
		Assert.assertTrue(finalMessage.toLowerCase().contains("field is required"), "SUCCESS");
		
	}	

	@Test
	public void shouldBeAbleToLogout() throws Exception
	{
		//Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTEzNjA3NTMsImlhdCI6MTU0ODY4MjM1MywibmJmIjoxNTQ4NjgyMzUzLCJpZCI6NDkwM30.ctguxWB_mvMSmcbud5e6pBeDTMXXN5MPGla0IT6Kqxo
		TestAutomationFramework TAF = new TestAutomationFramework();
		TAF.setUp(Browser.CHROME, "C:\\geckodriver.exe");
		TAF.authenticate("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTEzNTYxMDQsImlhdCI6MTU0ODY3NzcwNCwibmJmIjoxNTQ4Njc3NzA0LCJpZCI6NDkwM30.ojlmDcTrkIhqMBI2dag2FtmYAGrH-kZFjKOqqFqR1fw");
		MonethaAuth auth = new MonethaAuth(TAF.getWebDriver());
		TAF.getWebDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		auth.navigate();
		Assert.assertTrue(TAF.getWebDriver().findElement(By.cssSelector("div.mh-name")).getText().length()>0);
		auth.getLogOffLink().click();
		
		Assert.assertEquals(TAF.getWebDriver().findElement(By.cssSelector("div.mh-modal-title")).getText(), "Log out");
		
		auth.getLogOutOkButton().click();
		
		//Asserts logout
		String assertStr = TAF.getWebDriver().findElement(By.cssSelector("div.mh-description-small.mh-text-center.mh-section-lg")).getText();
		Assert.assertTrue(assertStr.toLowerCase().contains("enter your phone number to get started"));
	
		//Asserts broken authentication
		TAF.authenticate("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTEzNTYxMDQsImlhdCI6MTU0ODY3NzcwNCwibmJmIjoxNTQ4Njc3NzA0LCJpZCI6NDkwM30.ojlmDcTrkIhqMBI2dag2FtmYAGrH-kZFjKOqqFqR1fw");
		auth.navigate();
		
		String contents="";
//		try {
//		contents = auth.getLogOffLink().getText();
//		}
//		catch(NoSuchElementException nsee) {
//			Assert.assertTrue(true);
//		}
//		finally
//		{
//			TAF.getWebDriver().quit();
//			if(contents!=null)
//				Assert.assertFalse(contents.contains("Log out"), "FAILURE: Broken Auth");
//		}
			
	}
	  
	
	  @BeforeClass(alwaysRun=true)
	  public void beforeClass() throws Exception 
	  {
		 
		TAF.setUp(Browser.CHROME, "C:\\geckodriver.exe");
		TAF.authenticate("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTA5MjczMTUsImlhdCI6MTU0ODI0ODkxNSwibmJmIjoxNTQ4MjQ4OTE1LCJpZCI6NDkwM30.ACx2CqG8H5CGWtQa77sGhJ-zb7MRBz5Nu4raTxHM0HY");
		Assert.assertEquals(TAF.getWebDriver().getTitle(), "Monetha");
		
		String imgHero = TAF.getWebDriver().findElement(By.cssSelector("div.mh-hero-section"))
		.findElement(By.cssSelector(".mh-hero-image"))
		.getAttribute("src");
		Assert.assertTrue(imgHero.length()>1);
		
		TAF.disablePopUp();
		TAF.getWebDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//862055073
	  }
	 
	  @AfterClass
	  public void afterClass() {
		  if(TAF.getWebDriver()!=null) TAF.getWebDriver().quit();
		  if(TAF2.getWebDriver()!=null) TAF2.getWebDriver().quit();
	  }
}
