package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizza.qa.testbase.TestBase;

public class AvailablePanPizzaDetailsPage extends TestBase {
	
	@FindBy(xpath = "//*[contains(text(),'Add To Deal') and @class ='ml-2']")
	@CacheLookup
	WebElement AddtoDealPizzaBtn;
	
		
	// Initializing the Page Objects:
	public AvailablePanPizzaDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyAvailablePanPizzaDetailsPageTitle(){
		return driver.getTitle();
	}
	
	
	
	  public AddtoDealPizzainSelectedpizzaDetailsPage clickOnAvailablePanpizzaAddtoDealBtn(){
		  AddtoDealPizzaBtn.click(); 
		 return new AddtoDealPizzainSelectedpizzaDetailsPage(); 
		 }


}
