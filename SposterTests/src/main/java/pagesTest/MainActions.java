package pagesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainActions {
	
	public WebDriver driver;

	public MainActions(WebDriver driver) {
		this.driver = driver;
	}

	public void scrollBy(int scroll) {
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,"+scroll+")");
	   }
	
	
	public void logout() {
		driver.findElement(By.cssSelector("#sp-menu > div > div.sp-megamenu-wrapper > ul > li:nth-child(12) > a")).click();
	}
	
}
