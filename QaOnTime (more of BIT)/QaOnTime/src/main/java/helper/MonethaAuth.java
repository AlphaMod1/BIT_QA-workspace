package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MonethaAuth {
	
	protected WebDriver driver;
	
	public MonethaAuth(WebDriver driver) {
		this.driver = driver;
	}

	public void navigate() throws InterruptedException {
		 driver.get("https://www.monetha.io/user/home");
		 Thread.sleep(2000);
	}

	public WebElement getLogOffLink() {
		
		return driver.findElement(By.cssSelector("div.mh-navbar-item.mh-logout-item"));
	}
	
	public WebElement getLogOutOkButton(){
		return driver.findElement(By.xpath("//button[contains(text(), 'OK')]"));
	}
	
	
}
