package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;

import com.opencsv.bean.CsvToBeanBuilder;

import brain.PropertiesReader;
import brain.Random;
import brain.TestProfiles;
import brain.XmlReader;
import monethaPages.MonethaProfile;



public class ProfileTest2 {

	
	public WebDriver driver;
	Random ran = new Random();
	PropertiesReader prop = new PropertiesReader();
	
	 public static final String USERNAME = "mrme3";
	 public static final String AUTOMATE_KEY = "U9KWxMPvKxs4fmKyynyW";
	 public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	
	
	@Test
	public void shouldUpdateProfile() throws IllegalStateException, FileNotFoundException {
		MonethaProfile profile = new MonethaProfile(driver);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<TestProfiles> beans = new CsvToBeanBuilder(new FileReader("src\\main\\resources\\profile.csv")).withSeparator('\t').withType(TestProfiles.class).build().parse();
		profile.scrollBy(100);
		for(int i = 0; i < beans.size(); i++) {
			System.out.println(i+1+". Address: \""+ beans.get(i).getAddress()+"\", Email: \"" + beans.get(i).getEmail() + "\"");
			profile.setHomeAddressTextField(beans.get(i).getAddress());
			profile.setEmailnotVerified2EmailField(beans.get(i).getEmail());
			profile.clickUpdateSettingsButton();
			Assert.assertEquals(driver.findElement(By.className("mh-notification-bar-text")).getText(), "Settings saved successfully!");
		}
		
		
	}
	@Test(groups = {"smoke"}, enabled = true)
	public void should_NOT_UpdateProfile_BecauseBadEmailFormat() throws IllegalStateException, FileNotFoundException {
		MonethaProfile profile = new MonethaProfile(driver);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<TestProfiles> beans = new CsvToBeanBuilder(new FileReader("src\\main\\resources\\profileBadEmailList.csv")).withSeparator(';').withType(TestProfiles.class).build().parse();
		profile.scrollBy(100);
		for(int i = 0; i < beans.size(); i++) {
		System.out.println(i+1+". Address: \""+ beans.get(i).getAddress()+"\", Email: \"" + beans.get(i).getEmail() + "\"");
		profile.setHomeAddressTextField(beans.get(i).getAddress());
		profile.setEmailnotVerified2EmailField(beans.get(i).getEmail());
		
		try {
			profile.clickUpdateSettingsButton();
			Assert.fail();
		} catch (WebDriverException e) {
			Assert.assertTrue(true);
		}
		
		Assert.assertEquals(driver.findElement(By.className("mh-notification-bar-text")).getText(), "Invalid email address entered.");
		}
	}
	
	
	@Test
	public void shouldUpdateProfile_FromXml() throws IllegalStateException, FileNotFoundException {
		MonethaProfile profile = new MonethaProfile(driver);
		XmlReader xml = new XmlReader();
		List<String> xmlas = xml.read();

		profile.scrollBy(100);
		for(int i = 0; i < xmlas.size(); i++) {
			List<String> temp = Arrays.asList(xmlas.get(i).split(",ThisIsASplitThing,"));
			System.out.println(i+1+". Address: \""+ temp.get(0)+"\", Email: \"" + temp.get(1) + "\"");
			profile.setHomeAddressTextField(temp.get(0));
			profile.setEmailnotVerified2EmailField(temp.get(1));
			profile.clickUpdateSettingsButton();
			Assert.assertEquals(driver.findElement(By.className("mh-notification-bar-text")).getText(), "Settings saved successfully!");
		}
	}
	
	
	  @BeforeClass(groups = {"smoke"})
	  public void beforeClass() throws IOException {
		 
		  DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "62.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1920x1080");
		    
		    driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get(prop.getProp("urlas"));
		    
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;  
		  js.executeScript(prop.getProp("userToken1"));
		  driver.manage().window().maximize();
		  
	  }
	  
	  @BeforeMethod(groups = {"smoke"})
	  public void beforeMethod() throws IOException {
		  driver.get(prop.getProp("urlas"));
			driver.findElement(By.linkText("Liutauras Vijeikis")).click();
			driver.findElement(By.linkText("Settings")).click();
			Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe", null, new File("C:\\Windows\\System32\\"));

	  }
	  
	  @AfterClass(groups = {"smoke"})
	  public void afterClass() throws IOException {

		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		  String token = "localStorage.setItem(\"@mth:auth_token\",\"";
		  token += js.executeScript("return localStorage.getItem(\"@mth:auth_token\");").toString();
		  token += "\");";
		  prop.setProp("userToken1", token);
		  //driver.close();
		  driver.quit();
	  }
	

}
