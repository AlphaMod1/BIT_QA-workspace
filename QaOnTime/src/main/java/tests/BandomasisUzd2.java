package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BandomasisUzd2 {
	
	public WebDriver driver;
	
	
	@Test(priority=1)
	public void openAboutUs() {
		String title = driver.findElement(By.cssSelector("#page-top > div.page_heading_container > div > div.row > div > div > h1")).getText();
		Assert.assertEquals(title, "About Us");
	}
	
	@Test(priority=2)
	public void forceFailSearchInput() {
		driver.findElement(By.id("s")).sendKeys("Laba diena");
		driver.findElement(By.id("s")).sendKeys(Keys.RETURN);
		String message = driver.findElement(By.cssSelector("#page-top > div.page-container > div > div.row > div > div.col-md-9 > div > div > p")).getText();
		Assert.assertEquals(message, "Sorry no post matched your criteria!");
	}
	
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://qaontime.com/about-us/");
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
