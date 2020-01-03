package monethaPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import brain.PropertiesReader;
import brain.Random;

public class MonethaDeals {
   WebDriver driver;
   //public WebElement createDealButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/div[1]/div/button"));
   public Random ran = new Random();
   PropertiesReader prop = new PropertiesReader();
   
   public String iAmSellingButtonClass = "btn-deal-sell";
   public String inputClass = "mh-input";
   public String conditionUsedButtonName = "condition";
   public String notDefectedButtonName = "isDefected";
   public String phoneNumberInputClass = "react-phone-number-input__input";
   public String notificationClass = "mh-notification-bar-text";
   public String uploadImgClass = "mh-btn-add-photos";
   public String blueBtnClass = "btn-blue";
   public String greenBtnClass = "btn-green";
   public String signBtnClass ="btn-deal-sign";
   public String dealListClass = "mh-deal-user-name";
   
   public List <WebElement> getGreenBtnClass() {
	   return driver.findElements(By.className(greenBtnClass));
}

   public List <WebElement> getSignBtnClass() {
	   return driver.findElements(By.className(signBtnClass));
   }

   public List <WebElement> getDealListClass() {
	   return driver.findElements(By.className(dealListClass));
   }

   public List <WebElement> getBlueBtnClass() {
	   return driver.findElements(By.className(blueBtnClass));
   }
   
public MonethaDeals(WebDriver driver) {
       this.driver = driver;
   }
   
   public void navigate() throws InterruptedException {
   driver.get("https://www.monetha.io/user/home");
       Thread.sleep(1500);
   driver.findElement(By.linkText("Deals")).click();
       Thread.sleep(1500);
   }
   
   public void logInTo(String who) throws IOException {
	   JavascriptExecutor js = (JavascriptExecutor) driver;  
	   
	   
	   if(who=="" || who == "me") {
		   js.executeScript(prop.getProp("authToken1"));

	   }
	   else {
		   js.executeScript(prop.getProp("authToken2"));
	   }
   }
   
   public void scrollBy(int scroll) {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,"+scroll+")");
   }
   
   
   
   public WebElement getIamSellingButton() {
       return driver.findElements(By.className(iAmSellingButtonClass)).get(0);
   }
   
   public WebElement getCreateButton() {
       return driver.findElements(By.className(greenBtnClass)).get(0);
   }
   
   
   public WebElement getTitleInput() {
	   return driver.findElements(By.className(inputClass)).get(0);
   }

   
   public WebElement getDescriptionTextarea() {
	   return driver.findElements(By.className(inputClass)).get(1);
   }
   
   
   public WebElement getConditionUsedButton() {
	   return driver.findElements(By.name(conditionUsedButtonName)).get(ran.rInt(0, 1));
   }
   
   public WebElement getNotDefectedButton() {
	   return driver.findElements(By.name(notDefectedButtonName)).get(ran.rInt(0, 1));
   }
   
   public WebElement getUploadImgClassName() {
	   return driver.findElement(By.className(uploadImgClass));
   }
   
   public WebElement getContinueButton() {
       JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,300)");
       return driver.findElements(By.className(greenBtnClass)).get(0);
   }
   
   public WebElement getPrivatelyShareButton() {
       return driver.findElements(By.tagName("button")).get(1);
   }
   
   public String getForAssertionAfterACreatedDeal() {
       return notificationClass;
   }
   
   public String getforAssertionAfterPriceWasMissing() {
       return notificationClass;
   }
   
   public WebElement getSendButton() {
	   return driver.findElements(By.className(greenBtnClass)).get(0);
   }
   
   public WebElement getPhoneNumberInput() {
       JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,400)");
       
   driver.findElement(By.className(phoneNumberInputClass)).click();
   driver.findElement(By.className(phoneNumberInputClass)).sendKeys(Keys.DELETE);
   driver.findElement(By.className(phoneNumberInputClass)).sendKeys(Keys.BACK_SPACE);
   driver.findElement(By.className(phoneNumberInputClass)).sendKeys(Keys.BACK_SPACE);
   driver.findElement(By.className(phoneNumberInputClass)).sendKeys(Keys.BACK_SPACE);
       
       return driver.findElement(By.className(phoneNumberInputClass));
   }
   
   public WebElement getPriceInput() {
   driver.findElement(By.className(inputClass)).click();
   return driver.findElements(By.className(inputClass)).get(2);
   }
}
