package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class QaOnTime {
	
	public WebDriver driver;
	
//  @Test
//  public void openQaOnTimeRegister() {
//	driver.get("http://qaontime.com/register/");
//  }
  
//  @Test
//  public void loginToQaOnTime() {
//	driver.get("http://qaontime.com/register/");
//	driver.findElement(By.id("field-login-login")).sendKeys("liutauras.vijeikis@gmail.com");
//	driver.findElement(By.id("field-login-password")).sendKeys("BalticTalents2018");
//	driver.findElement(By.id("field-login-loginSubmit")).click();
//  }
//  
//  @Test
//  public void clickOnBalticTalents() {
//
//	driver.findElement(By.linkText("baltictalents")).click();
//	
//  }
  
//  @Test
//  public void createIssue() {
//
//	  String xp1 = "//*[@id='body']/table/tbody/tr/td[1]/div/table/tbody/tr[6]/td/a[1]/img";
//	  String xp2 = "//*[@id=\'body\']/table/tbody/tr/td[1]/div/table/tbody/tr[7]/td[1]/a[2]";
//	  String xp3 = "//*[@id=\'body\']/table/tbody/tr/td[2]/div/div[1]/a[2]";
//	  
//	  driver.findElement(By.xpath(xp1)).click();
//	  driver.findElement(By.xpath(xp2)).click();
//	  driver.findElement(By.xpath(xp3)).click();
//	  driver.findElement(By.id("field-issues-issueName")).sendKeys("Hello");
//	  driver.findElement(By.id("field-issues-value5")).sendKeys("5");
//	  driver.findElement(By.id("field-issues-descriptionText")).sendKeys("Test Test Test Test Test Test Test Test Test Test Test Test ");
//	  driver.findElement(By.id("field-issues-okSubmit")).click();
//	    
//  }
  
  @Test
  public void createIssueAndDelete() {

	  String xp1 = "//*[@id='body']/table/tbody/tr/td[1]/div/table/tbody/tr[6]/td/a[1]/img";
	  String xp2 = "//*[@id=\'body\']/table/tbody/tr/td[1]/div/table/tbody/tr[7]/td[1]/a[2]";
	  String xp3 = "//*[@id=\'body\']/table/tbody/tr/td[2]/div/div[1]/a[2]";
	  
	  driver.findElement(By.xpath(xp1)).click();
	  driver.findElement(By.xpath(xp2)).click();
	  driver.findElement(By.xpath(xp3)).click();
	  driver.findElement(By.id("field-issues-issueName")).sendKeys("Hello");
	  driver.findElement(By.id("field-issues-value5")).sendKeys("5");
	  driver.findElement(By.id("field-issues-descriptionText")).sendKeys("Test Test Test Test Test Test Test Test Test Test Test Test ");
	  driver.findElement(By.id("field-issues-okSubmit")).click();
	  
	  driver.findElement(By.linkText("Delete Issue")).click();
	  driver.findElement(By.id("field-issues-okSubmit")).click();
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\liuta\\Documents\\Pamokos\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("http://qaontime.com/register/");
		driver.findElement(By.id("field-login-login")).sendKeys("liutauras.vijeikis@gmail.com");
		driver.findElement(By.id("field-login-password")).sendKeys("BalticTalents2018");
		driver.findElement(By.id("field-login-loginSubmit")).click();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}