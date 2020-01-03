package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pre_scripts.RandomString;

import org.testng.Assert;

public class QaOnTime {

	public WebDriver driver;
	
	@Test(priority=1)
	public void loadQaOnTimeCom() {
		
		String titleCssSelector = "#slides_full > div > ul > li > div.container.container_caption > h1 > a";
		
		driver.get("http://www.qaontime.com");
		Assert.assertEquals(driver.findElement(By.cssSelector(titleCssSelector)).getText(), "Why QA on time?");
	
	}
	
	@Test(priority = 2)
	public void checkContactUs() {
		
		RandomString rand = new RandomString();
		
		String randomSearch = rand.randomString(10);
		String contactUsBtnCssSelector="#bs-example-navbar-collapse-1 > ul > li.page_item.page-item-29 > a";
		String resultTitleCssSelector ="#page-top > div.page_heading_container > div > div.row > div > div > h1";
		String resultTitle="Search Results for: " + randomSearch;
		
		driver.findElement(By.cssSelector(contactUsBtnCssSelector)).click();
		driver.findElement(By.id("s")).sendKeys(randomSearch);
		driver.findElement(By.id("s")).sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.findElement(By.cssSelector(resultTitleCssSelector)).getText(), resultTitle);
	}
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
