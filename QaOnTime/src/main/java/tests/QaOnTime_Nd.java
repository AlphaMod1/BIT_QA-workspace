package tests;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import brain.Random;
import qaontimepages.Login;
import qaontimepages.Posting;

public class QaOnTime_Nd {
	
	public WebDriver driver;
	public Random ran = new Random();
	public Login login = new Login();
	public Posting post = new Posting();

	  @Test
	  public void failToLogin() {
 		  
		  login.logIn(ran.rString(8,true)+"@"+ran.rString(5,false)+".com", ran.rString(8,true), driver);
		  
		  String ErrorMsg = driver.findElement(By.xpath("//*[@id=\"form-login\"]/div/div[2]/p")).getText();
		  
		  assertEquals(ErrorMsg, "Incorrect value: Invalid login or password.");
		  
		
	  }
	  
	  @Test(groups = {"smoke"})
	  public void login() {
		  
	  }
	  

	  @Test
	  public void createIssue() {
		  
		  post.create(driver);
		  
	  }
	  
	  @Test
	  public void deleteIssue() throws InterruptedException {
		  
		  post.create(driver);
		  driver.findElement(By.linkText("Delete Issue")).click();
		  driver.findElement(By.id("field-issues-okSubmit")).click();
		  
	  }
	  
	  @Test
	  public void logout() {
		  
		  login.logOut(driver);
		  assertEquals("http://qaontime.com/register/index.php",driver.getCurrentUrl());

	  }
	  	  
	  @BeforeMethod(groups = {"smoke"})
	  public void beforeMethod(Method method) {
		  System.out.println(method.getName());
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\liuta\\Documents\\Pamokos\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  if (!method.getName().equals("FailToLogin")) {
			  login.logIn("liutauras.vijeikis@gmail.com", "BalticTalents2018", driver);
		  }
	  }
	  
	  @AfterMethod(groups = {"smoke"})
	  public void afterMethod() {
		  driver.quit();
	  }
	
}
