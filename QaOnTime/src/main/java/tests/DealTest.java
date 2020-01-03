package tests;



import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;


import brain.Random;
import monethaPages.MonethaDeals;
import monethaPages.MonethaDealsCreate;
import monethaPages.ReportGenerator;

public class DealTest {
	
	public WebDriver driver;
	ReportGenerator report = new ReportGenerator();
	Random ran = new Random();
	public String title = ran.rString(10, true);
	public String description = ran.rString(20, false);
	public String price = ran.rIntString(100, 200)+"."+ran.rIntString(1, 9);
	String tests[] = new String[10];
	boolean pass[] = new boolean[10];
	int kiek = 0;
	MonethaDealsCreate mCreate = new MonethaDealsCreate();
	

	
	@Test(enabled = false)
	public void should_ToCreateADealOrElseThisWebsiteDoesNotWorkAlsoImTryingToMakeThisMethodNameAsLongAsPossibleButAnywayItsCalledMainFlow() throws InterruptedException {

		MonethaDeals deal = new MonethaDeals(driver);
		Random ran = new Random();
		
		mCreate.createAdeal(driver, deal, ran.rString(10, true), ran.rString(20, false), ran.rIntString(100, 200)+"."+ran.rIntString(10, 99), "", "37064034810");
		Assert.assertEquals(driver.findElement(By.className(deal.getForAssertionAfterACreatedDeal())).getText(), "Buyer has 24 hours to review and accept.");
		
	}
	
	
	
	@Test(enabled = true)
	public void shouldCreateDealWithAnImg() throws InterruptedException {
		MonethaDeals deal = new MonethaDeals(driver);
		
		mCreate.createAdeal(driver, deal, title, description, price, "C:\\a.png", "37061193589");
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.className(deal.getForAssertionAfterACreatedDeal())).getText(), "Buyer has 24 hours to review and accept.");
		Assert.assertEquals(driver.findElements(By.className("mh-price")).get(0).getText(), "EUR "+price);
	}
	
	
	
	
	@Test(enabled = true, dependsOnMethods = {"shouldCreateDealWithAnImg"})
	public void ShouldBeAbleToDealAccept() throws InterruptedException, IOException {
		MonethaDeals deal = new MonethaDeals(driver);
		deal.logInTo("mangirdas");
		deal.navigate();
		Thread.sleep(1000);
		
		try {
		Assert.assertFalse(driver.findElements(By.className("mh-notification-bar-text")).get(0).isDisplayed());
		}
		catch(IndexOutOfBoundsException exeption) {
			Assert.assertTrue(true);
		}
		
		for(int i = 0; i < 5; i++) {
			if(driver.findElements(By.className("mh-deal-action")).get(i).getText().contains("Seller is waiting for you to confirm")) {
				Assert.assertEquals(driver.findElements(By.className("mh-price")).get(i).getText(), "EUR "+price);
				deal.getDealListClass().get(i).click();
				break;
			}
		}
		
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElements(By.className("mh-deal-title")).get(0).getText(), title);
		Assert.assertEquals(driver.findElements(By.className("Linkify")).get(0).getText(), description);
		deal.getSignBtnClass().get(0).click();
		Assert.assertEquals(driver.findElements(By.className("mh-deal-title")).get(0).getText(), title);
		Assert.assertEquals(driver.findElements(By.className("Linkify")).get(0).getText(), description);
		Thread.sleep(1000);
		deal.getBlueBtnClass().get(0).click();
		Assert.assertEquals(driver.findElements(By.className("mh-deal-title")).get(0).getText(), title);
		Assert.assertEquals(driver.findElements(By.className("Linkify")).get(0).getText(), description);
		Thread.sleep(1000);
		
		

	}
	
	
	@Test(enabled = true, dependsOnMethods = {"ShouldBeAbleToDealAccept"})
	public void shouldBeAlbeToPayForADeal() {
		MonethaDeals deal = new MonethaDeals(driver);
		deal.getGreenBtnClass().get(0).click();
		Assert.assertEquals(driver.findElements(By.className("mh-deal-title")).get(0).getText(), title);
		Assert.assertEquals(driver.findElements(By.className("Linkify")).get(0).getText(), description);
		deal.getBlueBtnClass().get(0).click();
		Assert.assertEquals(driver.findElements(By.className("mh-deal-title")).get(0).getText(), title);
		Assert.assertEquals(driver.findElements(By.className("Linkify")).get(0).getText(), description);
	}
	
	
	@Test(enabled = true, dependsOnMethods = {"shouldBeAlbeToPayForADeal"})
	public void shouldConfirmTheDeal() throws InterruptedException, IOException {
		MonethaDeals deal = new MonethaDeals(driver);
		deal.logInTo("me");
		deal.navigate();
		Thread.sleep(1000);
		try {
		Assert.assertFalse(driver.findElements(By.className("mh-notification-bar-text")).get(0).isDisplayed());
		}
		catch(IndexOutOfBoundsException exeption) {
			Assert.assertTrue(true);
		}
		
		for(int i = 0; i < 5; i++) {
			if(driver.findElements(By.className("mh-deal-action")).get(i).getText().contains("Confirm payment")) {
				Assert.assertEquals(driver.findElements(By.className("mh-price")).get(i).getText(), "EUR "+price);
				deal.getDealListClass().get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElements(By.className("mh-deal-title")).get(0).getText(), title);
		Assert.assertEquals(driver.findElements(By.className("Linkify")).get(0).getText(), description);
		deal.getGreenBtnClass().get(0).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElements(By.className("mh-deal-title")).get(0).getText(), title);
		Assert.assertEquals(driver.findElements(By.className("Linkify")).get(0).getText(), description);
		deal.getBlueBtnClass().get(0).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.className("mh-deal-receipt-contents")).isDisplayed());
		
	}
	
	

	
	@Test(enabled = true, dependsOnMethods = {"shouldConfirmTheDeal"})
	public void shouldLogOut() throws InterruptedException {
		MonethaDeals deal = new MonethaDeals(driver);
		driver.get("https://www.monetha.io/user/home");
		Thread.sleep(1000);
		driver.findElements(By.tagName("span")).get(0).click();
		deal.getBlueBtnClass().get(1).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.className("mh-small-title")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.className("mh-agreement-text")).isDisplayed());
	}
	
	
	@Test(enabled = true, groups = {"smoke"})
	public void dealCouldNotBeCreatedBecouseItWasMissingAPrice() throws InterruptedException {
		MonethaDeals deal = new MonethaDeals(driver);
		mCreate.createAdeal(driver, deal, title, description, "", "", "37064034810");
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.className(deal.getforAssertionAfterPriceWasMissing())).getText(), "This field is required");
	}

	  @BeforeClass(enabled = true, groups = {"smoke"})
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\liuta\\Documents\\Pamokos\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.monetha.io");
		  JavascriptExecutor js = (JavascriptExecutor) driver;  
		  js.executeScript("localStorage.setItem(\"@mth:auth_token\",\"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTA0MTM5NjEsImlhdCI6MTU0NzczNTU2MSwibmJmIjoxNTQ3NzM1NTYxLCJpZCI6NDkwMn0.5i2K-YtUJptHMMP4V0ICcwJxsxi_pFEnGUiCqX1G7Ks\");");
		  driver.manage().window().maximize();
		  
	  }
	  
	  @AfterMethod(groups = {"smoke"})
	  public void afterMethod(Method method, ITestResult result) {
		tests[kiek] = method.getName(); 		
		if (result.getStatus() == ITestResult.FAILURE) {
			 pass[kiek] = false;
		}
		else {
			pass[kiek] = true;
		}
		kiek++;
	  }
	  
	  @AfterClass(groups = {"smoke"})
	  public void afterClass() throws IOException {
		  report.start(tests, kiek, pass);
		  driver.close();
	  }
	
	
}
