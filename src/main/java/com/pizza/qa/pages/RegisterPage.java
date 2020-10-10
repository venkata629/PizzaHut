package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pizza.qa.testbase.TestBase;

public class RegisterPage extends TestBase {


    @FindBy(xpath="//*[@id='Fname']")
    WebElement FirstName;
    
    @FindBy(xpath="//*[@id='mobileNumber']")
    WebElement MobileNumber;
    
    @FindBy(xpath="//*[@id='email-id']")
    WebElement EmailAddress;
    
    @FindBy(xpath="//*[@id='pwrd']")
    WebElement Password;
    
    @FindBy(xpath="//*[@id='kp-lgin']")
    WebElement SelectCheckbox;
    
    @FindBy(xpath="//*[contains(text(),'Sign Up ')]")
    WebElement Sign_Up_Button;  
    
    @FindBy(xpath="//button[contains(text(),'Ok')]")
    WebElement Ok_Button;  
    
  
  

	//Initializing the Page Objects:
	public RegisterPage(){
		PageFactory.initElements(driver, this);
	}

  public PlaceOrderSummaryPage RegisterPageDetails() {  
  
	  	FirstName.sendKeys("test");
	  	int M_no_1= (int) Math.random();
	  	MobileNumber.sendKeys("2345678901"+M_no_1);
	  	int Remail_1= (int) Math.random();
		EmailAddress.sendKeys("test"+Remail_1+"@test.com");
	  	Password.sendKeys("test@123");
	  	SelectCheckbox.click();
	  	//String email=EmailAddress.
	  	//if()Ok_Button
	  	Sign_Up_Button.click();		
		
	  return new PlaceOrderSummaryPage();		  
  
  }
  
}
 
