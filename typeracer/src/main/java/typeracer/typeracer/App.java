package typeracer.typeracer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class App {
	public WebDriver driver;

	@Test
	public void typeracer() throws InterruptedException {

		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).keyDown(Keys.ALT).sendKeys("o").keyUp(Keys.CONTROL).keyUp(Keys.ALT).perform();

		String part1 = "#gwt-uid-15 > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(1) > td > div > div > span:nth-child(1)";
		String part2 = "#gwt-uid-15 > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(1) > td > div > div > span:nth-child(2)";
		String part3 = "#gwt-uid-15 > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(1) > td > div > div > span:nth-child(3)";
		String txtF = "#gwt-uid-15 > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(2) > td > input";
		String score = "#gwt-uid-15 > table > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td > table > tbody > tr > td:nth-child(2) > div > div:nth-child(2)";

		String text = driver.findElement(By.cssSelector(part1)).getText()
				+ driver.findElement(By.cssSelector(part2)).getText();

		if (!text.contains(",")) {
			text += " ";
		}

		try {
			text += driver.findElement(By.cssSelector(part3)).getText();
		} catch (Exception e) {

		}

		boolean done = false;
		while (!done) {
			try {
				driver.findElement(By.cssSelector(txtF)).sendKeys(text);
				done = true;
			} catch (Exception e) {
				Thread.sleep(300);
			}
		}
		driver.findElement(By.cssSelector(txtF)).sendKeys(".");

		System.out.println(driver.findElement(By.cssSelector(score)).getText());
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://play.typeracer.com/");

		String cookieBtn = "#qcCmpButtons > button:nth-child(2)";
		driver.findElement(By.cssSelector(cookieBtn)).click();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
