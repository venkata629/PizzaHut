package com.pizza.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.pizza.qa.testbase.TestBase;

public class Thanks_you_for_PlacingPage extends TestBase {
	
	
	//@FindBy(xpath = "//*[contains (text( ), 'Your order is placed with order id')]")
	//@CacheLookup
	//WebElement OrderIDNo;
	
	// Initializing the Page Objects:
		public Thanks_you_for_PlacingPage() {
			PageFactory.initElements(driver, this);			
			//System.out.println(OrderIDNo);
		}
		
		public String verifyThanks_you_for_PlacingPageTitle(){
			return driver.getTitle();
		}	
		
	

}
