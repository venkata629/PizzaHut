package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizza.qa.testbase.TestBase;

public class CheckoutLoginPage extends TestBase {
	
	
	@FindBy(xpath = "//a[@class='col-12 text-center clr-two hover']")
	@CacheLookup
	WebElement Continue_as_GuestuserLink;
	
	@FindBy(xpath = "//*[contains(text(),'Create Account')]")
	@CacheLookup
	WebElement CreateAccountUserLink;
	

	
	
		
	// Initializing the Page Objects:
	public CheckoutLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCheckoutLoginPageTitle(){
		return driver.getTitle();
	}	
	
	  public PlaceOrderSummaryPage clickOnContinue_as_GustuserLink(){
		  Continue_as_GuestuserLink.click(); 	  
		  return new PlaceOrderSummaryPage();	  
	  }

	  
	  public PlaceOrderSummaryPage clickOnCreateAccountUserLink(){
		  CreateAccountUserLink.click(); 	  
		  return new PlaceOrderSummaryPage();	  
	  }

}


