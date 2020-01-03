package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import helper.Login;
import helper.MonethaAuth;
import helper.MonethaDeals;
import helper.MonethaProfile;
import helper.Quick;
import helper.TestAutomationFramework;
import helper.TestAutomationFramework.Browser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;


import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProfileFactory
{

   private ProfileFactory()
   {
      
   }
   private static ProfileFactory instance = new ProfileFactory();

   public static ProfileFactory getInstance()
   {
      return instance;
   }

   ThreadLocal<MonethaProfile> profile = new ThreadLocal<MonethaProfile>() // thread local driver object for webdriver
   {
      @Override
      protected MonethaProfile initialValue()
      {
    	 TestAutomationFramework TAF  = new TestAutomationFramework();
    	 try {
			TAF.setUp(Browser.CHROME, "C:\\geckodriver.exe");
			TAF.getWebDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		 TAF.authenticate("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTA5MjczMTUsImlhdCI6MTU0ODI0ODkxNSwibmJmIjoxNTQ4MjQ4OTE1LCJpZCI6NDkwM30.ACx2CqG8H5CGWtQa77sGhJ-zb7MRBz5Nu4raTxHM0HY");
         
 		 
 		 return new MonethaProfile(TAF.getWebDriver()); // can be replaced with other browser drivers
      }
   };

   public MonethaProfile getProfile() // call this method to get the driver object and launch the browser
   {
      return profile.get();
   }

   public void removeDriver() // Quits the driver and closes the browser
   {
      profile.get().getWebDriver().quit();
      profile.remove();
   }
}