package sposterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import pagesTest.ActionsLogin;


public class Calendar {
	
	public WebDriver driver;
	
	
	
	@Test(enabled = false)
	public void should_AddSomethingToCalendar() {
		ActionsLogin action = new ActionsLogin(driver);
		
		action.login("matthewalcjcffgbbgi", "TestNG@2019" , true, true);
		
		
	}
	
	@BeforeClass
	public void beforeClass() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\liuta\\Documents\\sposter\\SposterTests\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void AfterClass() {
		driver.close();
	}
}
