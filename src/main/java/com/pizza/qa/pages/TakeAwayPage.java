package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pizza.qa.testbase.TestBase;

public class TakeAwayPage extends TestBase{
	
	@FindBy(xpath="//*[contains(text(),'Select')]")
	WebElement Select_Nearest_store_button;
	
	
	
	//Initializing the Page Objects:
	public TakeAwayPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	  public YourcartPage TakeAwayPage_Select_store() { 
	  
	  
		  Select_Nearest_store_button.click(); 
	 // JavascriptExecutor js = (JavascriptExecutor)driver; 
	  //js.executeScript("arguments[0].click();",	StartMyOrderBtn);
	  
	  return new YourcartPage();
	  
	  }
	 

	  
	  
	  
	  

}
