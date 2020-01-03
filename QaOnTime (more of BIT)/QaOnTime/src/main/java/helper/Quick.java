package helper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Quick {
	public static void Assert (Object obj, String smth) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		WebElement webElement = null;
		Method mth = obj.getClass().getMethod(smth);
		try 
		{
	        webElement = (WebElement) mth.invoke(obj);
		}
		catch(NoSuchElementException e)
		{
			Assert.assertTrue(false, "Unable to locate element TYPE: "+webElement.toString());
		}
	}
}
