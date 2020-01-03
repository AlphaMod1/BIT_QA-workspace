package monethaPages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class MonethaDealsCreate {
	
	
	
	public void createAdeal(WebDriver driver, MonethaDeals deal, String title, String description, String price, String img, String pNumber) throws InterruptedException {
		
		deal.navigate();
		Thread.sleep(1000);
		deal.getCreateButton().click();
		Thread.sleep(1000);
		deal.getIamSellingButton().click();
		deal.getTitleInput().sendKeys(title);
		deal.getDescriptionTextarea().sendKeys(description);
		deal.getPriceInput().sendKeys(price);
		deal.scrollBy(500);
		deal.getConditionUsedButton().click();
		deal.getNotDefectedButton().click();
		if(img != "") {
			
			deal.getUploadImgClassName().click();
			try {
				Thread.sleep(3000);
				Runtime.getRuntime().exec("c:\\sendfile.exe", null, new File("c:\\"));
				Thread.sleep(3000);
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}
		if(title != "" && description != "" && price != "") {
			deal.getContinueButton().click();
			deal.getPrivatelyShareButton().click();
			deal.getPhoneNumberInput().sendKeys(pNumber);
			deal.getSendButton().click();
		}
		Thread.sleep(2000);
		
	}

}
