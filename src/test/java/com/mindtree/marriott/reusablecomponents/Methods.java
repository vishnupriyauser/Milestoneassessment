package com.mindtree.marriott.reusablecomponents;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mindtree.marriott.utilities.PropertyFileReader;

public class Methods {

	private static Logger log=LogManager.getLogger( Drivers.class.getName()); 
	public static void loadURL(WebDriver driver) throws IOException {
		driver.get(PropertyFileReader.loadFile().getProperty("url"));
		timelapse(driver);

     
	}

	public static void timelapse(WebDriver driver) throws NumberFormatException, IOException {
		int wait = Integer.parseInt(PropertyFileReader.loadFile().getProperty("implicitWait"));
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
		
	}	
	
	public static void clickbrands(By selector,WebDriver driver)
    {
		try
		{
    	    driver.findElement(selector).click();
		}
		catch(Exception e)
		{
			log.error("cannot able to clickbrands");
		}		
    }
	
	public static void clickimages(By selector,WebDriver driver)
    {
		try
		{
    	    driver.findElement(selector).click();
    	    log.info("JW Marriott is presented in the list");
		}
		catch(Exception e)
		{
			log.error("JW Marriott is not presented in the list");
		}		
    }
	
	public static void destination(By selector,WebDriver driver,String name)
    {
		try
		{
    	    driver.findElement(selector).click();
    	    driver.findElement(selector).sendKeys(name);
    	  
		}
		catch(Exception e)
		{
			log.error("cannot able to enter destination");
		}		
    }
	
	public static void findhotel(By selector,WebDriver driver)
    {
		try
		{
    	    driver.findElement(selector).click();
		}
		catch(Exception e)
		{
			log.error("cannot able to findhotel");
		}		
    }
	
	public static void checkcity(By selector,WebDriver driver)
    {
		try
		{
    	    driver.findElement(selector).click();
		}
		catch(Exception e)
		{
			log.error("city mismatch");
		}		
    }
	
	public static void clicklink(By selector,WebDriver driver)
    {
		try
		{
    	    driver.findElement(selector).click();
		}
		catch(Exception e)
		{
			log.error("cannot able to find Marriot Bonvoy");
		}		
    }
	public static void clickbenifits(By selector,WebDriver driver)
    {
		try
		{
    	    driver.findElement(selector).click();
		}
		catch(Exception e)
		{
			log.error("cannot able to find member benfits");
		}		
    }
	public static void verifytext(By selector,WebDriver driver)
    {
		try
		{
    	    String name=driver.findElement(selector).getText();
    	    if(name.contains("Mobile Check-In and Mobile Key"))
    	    {
    	    	log.info(name+" is present int the page");
    	    }
    	    else
    	    {
    	    	log.error("text does not apper");
    	    }
		}
		catch(Exception e)
		{
			log.error("cannot able to view");
		}		
    }
	
	
}
