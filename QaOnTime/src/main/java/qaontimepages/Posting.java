package qaontimepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import brain.Random;

public class Posting {
	
	public void create(WebDriver driver){
		
		Random ran = new Random();
		
		 String xp1 = "//*[@id=\"body\"]/table/tbody/tr/td[1]/div/table/tbody/tr[6]/td/a[1]";
		 driver.findElement(By.xpath(xp1)).click();
		 driver.findElement(By.linkText("Bugs")).click();
		 driver.findElement(By.linkText("Add Issue")).click();
		 driver.findElement(By.id("field-issues-issueName")).sendKeys(ran.rString(15, true));
		 driver.findElement(By.id("field-issues-value5")).sendKeys(ran.rIntString(1, 200));
		 driver.findElement(By.id("field-issues-descriptionText")).sendKeys(ran.rString(100, true));
		 driver.findElement(By.id("field-issues-okSubmit")).click();
	}

}
