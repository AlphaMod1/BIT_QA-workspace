package sposterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import math.Random;
import pagesTest.ActionsLogin;
import pagesTest.MainActions;

public class Post {
	
	public WebDriver driver;
	Random ran = new Random();
	String textInPost = "Testing with TestNG " + ran.rString(20, true);
	
	@Test(groups = "mainflow")
	public void shouldBeAbleToLoginToFacebook() {
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("kizbnolqeh_1542224219@tfbnw.net");
		driver.findElement(By.id("pass")).sendKeys("Spooster123");
		driver.findElement(By.className("uiButtonConfirm")).click();;
	}
	
	@Test(dependsOnMethods = "shouldBeAbleToLoginToFacebook", groups = "mainflow")
	public void shouldBeAbleToPostToFacebook() throws InterruptedException {
		
		ActionsLogin action = new ActionsLogin(driver);
		
		driver.get("https://test.sposter.co");
		action.login("matthewalcjcffgbbgi", "TestNG@2019" , true, true);
		driver.findElement(By.className("btn-facebook")).click();
		driver.findElement(By.linkText("NEW POST")).click();
		driver.findElement(By.linkText("Not selected")).click();
		driver.findElement(By.linkText("dsadsa")).click();
		driver.findElement(By.className("emojionearea-editor")).sendKeys(textInPost);
		driver.findElement(By.className("post-title")).click();
		Thread.sleep(500);
		Assert.assertEquals(driver.findElement(By.className("preview-text-facebook")).getText(), textInPost, "Does not display facebook text preview");
		driver.findElement(By.id("postbutton")).click();
		for(int i = 0; i < 20; i++) {
			if(driver.findElement(By.cssSelector("#viewTable_list > tbody > tr.postType > td:nth-child(6)")).getText().contains("posted")) {
				break;
			}
			else {
				if(i == 19 || driver.findElement(By.cssSelector("#viewTable_list > tbody > tr.postType > td:nth-child(6)")).getText().contains("failed")) {
					Assert.fail();
				}
				Thread.sleep(5000);
				driver.navigate().refresh();
			}
		}
	}
	
	@Test(dependsOnMethods = "shouldBeAbleToPostToFacebook", groups = "mainflow")
	public void checkOnFacebookIfThePostPosted() throws InterruptedException {
		MainActions mainA = new MainActions(driver);
		

		driver.get("https://www.facebook.com/UAB-Patestuok-2202735659988013/?modal=admin_todo_tour");
		Thread.sleep(1000);
		mainA.scrollBy(500);
		Thread.sleep(2000);
		mainA.scrollBy(1000);
		Assert.assertEquals(driver.findElements(By.className("userContent")).get(0).getText(), textInPost);
		
	}
	
	@Test(dependsOnMethods = "checkOnFacebookIfThePostPosted", groups = "mainflow")
	public void shouldBeAbleToDeleteTheSamePost() {
		MainActions mainA = new MainActions(driver);
		driver.get("https://test.sposter.co/index.php/post-list");
		driver.findElements(By.className("fa-trash-alt")).get(0).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.accept();
		mainA.logout();
	}
	
	
	@Test(dependsOnMethods = "shouldBeAbleToDeleteTheSamePost")
	public void NF_shouldNotBeAbleToCreatePost_WithOutCampaign() {
		
		ActionsLogin action = new ActionsLogin(driver);
		
		driver.get("https://test.sposter.co");
		action.login("matthewalcjcffgbbgi", "TestNG@2019" , true, true);
		driver.findElement(By.className("btn-facebook")).click();
		driver.findElement(By.linkText("NEW POST")).click();
		driver.findElement(By.className("emojionearea-editor")).sendKeys(textInPost);
		Assert.assertFalse(driver.findElement(By.id("postbutton")).isEnabled());
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
		//driver.close();
	}

}
