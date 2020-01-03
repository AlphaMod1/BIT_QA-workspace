package helper;
 import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 public class MonethaDeals { 
	 //a[contains(text(), 'About Google')]
 WebDriver driver;
 
 public String iAmSellingButtonCss = "button[data-direction=\"sell\"][data-type=\"goods\"].btn";
 public String createButtonCss = "button[type=\"button\"].btn.btn-green";
 public String titleInputCss = "input[name='title']";
 public String descriptionTextareaCss = "textarea[name='description']";
 public String conditionUsedButtonCss = "button[name='condition'][data-value='used']";
 public String notDefectedButtonCss = "button[name='isDefected'][data-value='false']";
 public String continueButtonCss = "button[type='submit']";
 public String privatelyShareButtonCss = "button[type='button'][data-value='false']";
 public String sendButtonCss = "button[type='button'].btn.btn-green";
 public String phoneNumberInputCss = "input[type='tel'][placeholder='Enter phone number']";
 public String priceInputCss = "input[name='price']";
 public String fileInputCss = "input[type='file'][accept='image/*']";
 
 public MonethaDeals(WebDriver driver) {
 this.driver = driver;
 }
  public void navigate() throws InterruptedException {
 driver.get("https://www.monetha.io/user/home");

 driver.findElement(By.linkText("Deals")).click();

 }
  public WebElement getIamSellingButton() {
 return driver.findElement(By.cssSelector(iAmSellingButtonCss));
 }
  public WebElement getCreateButton() {
 return driver.findElement(By.cssSelector(createButtonCss));
 }
   public WebElement getTitleInput() {
 return driver.findElement(By.cssSelector(titleInputCss));
 }
  public WebElement getDescriptionTextarea() {
 return driver.findElement(By.cssSelector(descriptionTextareaCss));
 }
   public WebElement getConditionUsedButton() {
 return driver.findElement(By.cssSelector(conditionUsedButtonCss));
 }
  public WebElement getNotDefectedButton() {
 return driver.findElement(By.cssSelector(notDefectedButtonCss));
 }
  public WebElement getContinueButton() {
 JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("window.scrollBy(0,300)");
 return driver.findElement(By.cssSelector(continueButtonCss));
 }
  public WebElement getPrivatelyShareButton() {
 return driver.findElement(By.cssSelector(privatelyShareButtonCss));
 }
   public WebElement getSendButton() {
 return driver.findElement(By.cssSelector(sendButtonCss));
 }
  public WebElement getPhoneNumberInput() {
 JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("window.scrollBy(0,400)");
  driver.findElement(By.cssSelector(phoneNumberInputCss)).click();
 driver.findElement(By.cssSelector(phoneNumberInputCss)).sendKeys(Keys.DELETE);
 driver.findElement(By.cssSelector(phoneNumberInputCss)).sendKeys(Keys.BACK_SPACE);
 driver.findElement(By.cssSelector(phoneNumberInputCss)).sendKeys(Keys.BACK_SPACE);
 driver.findElement(By.cssSelector(phoneNumberInputCss)).sendKeys(Keys.BACK_SPACE);
  return driver.findElement(By.cssSelector(phoneNumberInputCss));
 }
  
 public WebElement getFirstDeal(String title) {
	 return driver.findElement(By.xpath("//div[contains(text(), '"+title+"')]"));
 }
 
 public WebElement getPriceInput() {
 driver.findElement(By.cssSelector(priceInputCss)).click();
 return driver.findElement(By.cssSelector(priceInputCss));
 }
 
 public WebElement getAddPhotos() throws InterruptedException {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,300)");
	 
	 WebElement uploadElement = driver.findElement(By.cssSelector(this.fileInputCss));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.display='block';", uploadElement);
	 //Thread.sleep(2000);
	 
	 return uploadElement;
 }
 
public WebElement getConfirmDetailsButton() {
		
	return driver.findElement(By.xpath("//button[contains(text(), 'Confirm details')]"));
}
public WebElement getYesTheDetailsAreCorrectButton() {
	return driver.findElement(By.xpath("//button[contains(text(), 'Yes, details are correct')]"));
  
  
}
public WebElement getPayWithCashButton() {
	
	return driver.findElement(By.xpath("//button[contains(text(), 'Pay with cash')]"));
}
public WebElement getPayForDealButton()
{
	return driver.findElement(By.xpath("//button[contains(text(), 'Pay for deal')]"));
}
public WebElement getConfirmButton() {
	return driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]"));
}
public WebElement getConfirmPaymentButton() {
	return driver.findElement(By.xpath("//button[contains(text(), 'Confirm payment')]"));
}
public WebElement getYesIHaveReceivedPaymentButton() {
	return driver.findElement(By.xpath("//button[contains(text(), 'Yes, I have received the payment')]"));
}
}
