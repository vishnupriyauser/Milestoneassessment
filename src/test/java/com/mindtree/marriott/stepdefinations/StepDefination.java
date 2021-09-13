package com.mindtree.marriott.stepdefinations;

import org.openqa.selenium.WebDriver;

import com.mindtree.marriott.pageObjects.Hotels;
import com.mindtree.marriott.pageObjects.Memberbenifits;
import com.mindtree.marriott.pageObjects.OurbrandsClick;
import com.mindtree.marriott.reusablecomponents.Drivers;
import com.mindtree.marriott.utilities.PropertyFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	Drivers d=new Drivers();
	WebDriver driver;
	
	
	OurbrandsClick brands=new OurbrandsClick();
	Memberbenifits member=new Memberbenifits();
	Hotels h=new Hotels();
	
	@Given("^Initialize the Browser$")
	public void initialize_the_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=d.initializedriver();
		driver.get(PropertyFileReader.loadFile().getProperty("url"));
	}

	@When("^click on our brands$")
	public void click_on_our_brands() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    brands.brands(driver);
	   
	}

	@Then("^verify if the JWMarriott is listed or not$")
	public void verify_if_the_JWMarriott_is_listed_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		 brands.images(driver);
	}

	@When("^enter \"([^\"]*)\" destination$")
	public void enter_destination(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   h.destination(driver,arg1);
	}

	@When("^click on the find hotels$")
	public void click_on_the_find_hotels() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    h.findhotel(driver);
	}

	@Then("^verify destination entered is correct or not along with the address of hotel$")
	public void verify_destination_entered_is_correct_or_not_along_with_the_address_of_hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  h.checkcity(driver);
	}

	
	
	@When("^Click on Member Benifits under Marriot Bonvoy module\\.$")
	public void click_on_Member_Benifits_under_Marriot_Bonvoy_module() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   member.clicklink(driver);
	   member.clickbenifits(driver);
	}

	@Then("^verify if the Mobile Check-In and Mobile Ke is present in benifit page or not$")
	public void verify_if_the_Mobile_Check_In_and_Mobile_Ke_is_present_in_benifit_page_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   member.verify(driver);
	}
	
}
