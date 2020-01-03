package helper;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.testng.Assert;

public class TestAutomationFramework 
{
	public enum Browser {CHROME}
	
	protected WebDriver driver;
	protected JavascriptExecutor javascriptExecutor;
	
	public TestAutomationFramework()
	{
		
	}
	
	public WebDriver getWebDriver() 
	{
		return this.driver;
	}
	
	public void authenticate (String bearer)
	{
		driver.get("https://www.monetha.io");
		javascriptExecutor.executeScript("localStorage.setItem(\"@mth:auth_token\",\""+bearer+"\");");
		
	}
	
	public void disablePopUp()
	{
		javascriptExecutor.executeScript("localStorage.setItem(\"cookiePolicyAgreed\",\"1\");");
	}

	public void setUp(Browser browser, String pathToDriver) throws Exception
	{
		switch (browser)
		{
		    case CHROME:
		    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\liuta\\Documents\\Pamokos\\chromedriver.exe");
		    	driver = new FirefoxDriver();
		    	javascriptExecutor =(JavascriptExecutor) driver;
		    	break;
		    
		    default: throw new Exception("ERROR: Cannot initialize "+ browser.toString() + " WebDriver.");
		}
		
	}

	public void enter(String URL) 
	{
		driver.get(URL);
	}

	public void getToCreateDealSellGoodsPage() 
	{
		driver.findElement(By.linkText("Deals")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[1]/div/div/div/div/div[2]/div[1]/div/button[1]"))
						.click();
	}

	public void CDSGP_fillForm(String title, String description, String price) throws InterruptedException 
	{
		driver.findElement(By.name("title")).sendKeys(title);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(description);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(price);
		
		WebElement element = driver.findElement(
		By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[1]/div/div/div/form/div[1]/div[5]/div/div/button[1]"));
		
		WebElement element2 = driver.findElement(
			By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[1]/div/div/div/form/div[1]/div[6]/div/div/button[1]"));
		
		((Locatable) element).getCoordinates().inViewPort();
		
		Thread.sleep(2000);
		
		try {
		    element.click();
		    element2.click();
		} catch (Exception e) {
		    new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		    element.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[1]/div/div/div/form/div[2]/button[2]")).click();
	}
		
}
