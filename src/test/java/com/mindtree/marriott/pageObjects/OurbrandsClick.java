package com.mindtree.marriott.pageObjects;

import org.openqa.selenium.WebDriver;

import com.mindtree.marriott.reusablecomponents.Methods;
import com.mindtree.marriott.uistore.OurbrandsClickUI;


public class OurbrandsClick extends OurbrandsClickUI{

	public void brands(WebDriver driver) throws InterruptedException
	{
		Methods.clickbrands(OurbrandsClickUI.clickonbrands,driver);
	}
	
	public void images(WebDriver driver) throws InterruptedException
	{
		Methods.clickimages(OurbrandsClickUI.clickonimage,driver);
	}
	
}
