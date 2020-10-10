package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizza.qa.testbase.TestBase;

public class AddtoDealPizzainSelectedpizzaDetailsPage extends TestBase{

	@FindBy(xpath = "//input[@class='btn btn-green w-100']")
	@CacheLookup
	WebElement AddtoDealPizzaSelectedBtn;
	
		
	// Initializing the Page Objects:
	public AddtoDealPizzainSelectedpizzaDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyAddtoDealPizzainSelectedpizzaDetailsPageTitle(){
		return driver.getTitle();
	}
	
		
	  public YourcartsummaryDetailsPage clickOnAddtoDealPizzaSelectedBtn(){
	  AddtoDealPizzaSelectedBtn.click(); 
	  return new YourcartsummaryDetailsPage(); 
	  
	  }
	 

	
}
