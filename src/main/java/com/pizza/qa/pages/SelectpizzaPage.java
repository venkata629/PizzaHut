package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pizza.qa.testbase.TestBase;

public class SelectpizzaPage extends TestBase {
	
		
	@FindBy(xpath = "//*[contains(text(),'Select Pizza')]")
	@CacheLookup
	WebElement SelectPizzaBtn;
	
	
	
	// Initializing the Page Objects:
	
	public SelectpizzaPage() {
		PageFactory.initElements(driver, this);		
	}
	
	public String verifySelectpizzaPageTitle(){
		return driver.getTitle();		
		
	}
	
      	
	  public MyBoxSelectedPizzaPage clickOnSelectPizzaBtn(){	 
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.elementToBeClickable(SelectPizzaBtn));
		  SelectPizzaBtn.click(); 		
		 return new MyBoxSelectedPizzaPage(); 
		 }

			
			  public MyBoxSelectedPizzaPage clickOnMyBoxSelectStartersBtn_1() {
				 
				  MyBoxSelectedPizzaPage.SelectStartersAddBtn_1.click();
				  return new MyBoxSelectedPizzaPage();
				  
			  }
			  
			 
			 

		  	 


}
