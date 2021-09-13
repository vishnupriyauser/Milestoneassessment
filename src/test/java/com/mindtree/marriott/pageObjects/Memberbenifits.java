package com.mindtree.marriott.pageObjects;

import org.openqa.selenium.WebDriver;

import com.mindtree.marriott.reusablecomponents.Methods;
import com.mindtree.marriott.uistore.MemberbenifitsUI;

public class Memberbenifits {

	
	public void clicklink(WebDriver driver) throws InterruptedException
	{
		Methods.clicklink(MemberbenifitsUI.link,driver);
	}
	public void clickbenifits(WebDriver driver) throws InterruptedException
	{
		Methods.clickbenifits(MemberbenifitsUI.clickbenifit,driver);
	}
	public void verify(WebDriver driver) throws InterruptedException
	{
		Methods.verifytext(MemberbenifitsUI.check,driver);
	}
}
