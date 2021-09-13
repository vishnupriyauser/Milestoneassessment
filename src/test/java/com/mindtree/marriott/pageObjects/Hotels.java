package com.mindtree.marriott.pageObjects;

import org.openqa.selenium.WebDriver;

import com.mindtree.marriott.reusablecomponents.Methods;
import com.mindtree.marriott.uistore.HotelsUI;

public class Hotels {

	public void destination(WebDriver driver,String name) throws InterruptedException
	{
		Methods.clickbrands(HotelsUI.destination,driver);
	}
	public void findhotel(WebDriver driver) throws InterruptedException
	{
		Methods.clickbrands(HotelsUI.find,driver);
	}
	public void checkcity(WebDriver driver) throws InterruptedException
	{
		Methods.clickbrands(HotelsUI.address,driver);
	}
}
