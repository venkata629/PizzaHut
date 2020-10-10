package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizza.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(xpath="//*[@id='email-id']")
    WebElement Email_ID;
    
    @FindBy(xpath="//*[@id='pwrd']")
    WebElement Passwordval;
    
    @FindBy(xpath="//*[contains(text(),'Login') and @type='submit']")
    WebElement LoginButton;
    
   
    
  
  

	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

  public PlaceOrderSummaryPage LoginPageDetails() {  
  
        Email_ID.sendKeys("chvssnmurty@gmail.com");	  
        Passwordval.sendKeys("Sairam@143");
        LoginButton.click();	  		
		
	  return new PlaceOrderSummaryPage();		  
  
  }
  

}
