package com.pizza.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pizza.qa.testbase.TestBase;

public class PlaceOrderSummaryPage  extends TestBase{
	
	@FindBy(xpath = "//input[@formcontrolname ='firstname']")
	@CacheLookup
	WebElement FullNametext;
	
	@FindBy(xpath = "//input[@formcontrolname ='phone']")
	@CacheLookup
	WebElement MobileNotext;
	
	@FindBy(xpath = "//input[@formcontrolname ='email']")
	@CacheLookup
	WebElement Emailtext;
	
	@FindBy(xpath = "//input[@formcontrolname ='address1']")
	@CacheLookup
	WebElement AddressStreetNametext;
	
	@FindBy(xpath = "//input[@formcontrolname ='address2']")
	@CacheLookup
	WebElement BuildingorFlatnotext;
	
	
	@FindBy(xpath = "//input[@id ='payment00' and @type ='radio']")
	@CacheLookup
	WebElement Payment_Cashradio;
	
	@FindBy(xpath = "//input[@formcontrolname ='termsOfUse']")
	@CacheLookup
	WebElement AgreeCheckbox;
	
	@FindBy(xpath = "//input[@id ='placeorderbtn']")
	@CacheLookup
	WebElement PlaceOrderbtn;
	
	@FindBy(xpath = "//*[@id='type']")
	@CacheLookup
	WebElement AddressType;
	
	@FindBy(xpath = "//*[contains(text(),'Save') and @class='btn btn-green w-100 ']")
	@CacheLookup
	WebElement SaveButton;
	
	@FindBy(xpath = "//*[contains(text(),'Change')]")
	@CacheLookup
	WebElement ChangeButton;
	
	@FindBy(xpath = "//h2[contains(text(),' OMR') and @class ='sub-title mb-0']")
	@CacheLookup
	WebElement OrderAmounttext;
	
	
	
		
	// Initializing the Page Objects:
	public PlaceOrderSummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Validating the OrderAmount:
		@SuppressWarnings("unused")
		public void PlaceOrderSummaryPage_validatingOrder_Amount() {
			String Orderamount= (String) OrderAmounttext.getAttribute("textContent").subSequence(5,10);
			Assert.assertEquals(actualamount, Orderamount);
		}
		
	
	
	/*
	 * public Thanks_you_for_PlacingPage clickOnPlaceOrderbuttonClick(String
	 * fullname,CharSequence[] MobileNo ,String Email,String Address,String
	 * Building){ FullNametext.sendKeys(fullname); MobileNotext.sendKeys(MobileNo);
	 * Emailtext.sendKeys(Email); AddressStreetNametext.sendKeys(Address);
	 * BuildingorFlatnotext.sendKeys(Building); Payment_Cashradio.click();
	 * System.out.println("after flatno"); AgreeCheckbox.click();
	 * PlaceOrderbtn.click(); return new Thanks_you_for_PlacingPage(); }
	 */
	  
	  public Thanks_you_for_PlacingPage clickOnPlaceOrderbutton_GuestUserClick(){
		  
		    FullNametext.sendKeys("test");
		    MobileNotext.sendKeys("2345678901");
			Emailtext.sendKeys("test@test.com");
			//AddressStreetNametext.sendKeys("123 street no");
			//BuildingorFlatnotext.sendKeys("124");			
			Payment_Cashradio.click();
			AgreeCheckbox.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(PlaceOrderbtn));
			//PlaceOrderbtn.click();	
			JavascriptExecutor js = (JavascriptExecutor)driver; 
			js.executeScript("arguments[0].click();",	PlaceOrderbtn);
		  return new Thanks_you_for_PlacingPage();	
		  
	  }
	  
	  
	  public Thanks_you_for_PlacingPage clickOnPlaceOrderbutton_Deals_GuestUserClick(){
		  
		    FullNametext.sendKeys("test");
		    MobileNotext.sendKeys("2345678901");
			Emailtext.sendKeys("test@test.com");
			AddressStreetNametext.sendKeys("123 street no");
			BuildingorFlatnotext.sendKeys("124");			
			Payment_Cashradio.click();
			AgreeCheckbox.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(PlaceOrderbtn));
			//PlaceOrderbtn.click();	
			JavascriptExecutor js = (JavascriptExecutor)driver; 
			js.executeScript("arguments[0].click();",	PlaceOrderbtn);
		  return new Thanks_you_for_PlacingPage();	
		  
	  }
	  public Thanks_you_for_PlacingPage clickOnPlaceOrderbutton_LoginUserClick(){
		  	 
			  //AddressStreetNametext.sendKeys("123 street no");
				//BuildingorFlatnotext.sendKeys("124");			
				Payment_Cashradio.click();
				AgreeCheckbox.click();
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.elementToBeClickable(PlaceOrderbtn));
				//PlaceOrderbtn.click();	
				JavascriptExecutor js = (JavascriptExecutor)driver; 
				js.executeScript("arguments[0].click();",	PlaceOrderbtn);
			  
			  return new Thanks_you_for_PlacingPage();	
		 
	  }
	  
	  public Thanks_you_for_PlacingPage clickOnPlaceOrderbutton_Deals_LoginUserClick(){
		  	 
		    //AddressStreetNametext.sendKeys("123 street no");
			//BuildingorFlatnotext.sendKeys("124");
			//AddressType.sendKeys("Home");			
			Payment_Cashradio.click();
			//String changeval = ChangeButton.getText();
			//System.out.println("Change:"+changeval);
			//if(!changeval.equals("")){				
			AgreeCheckbox.click();
			//SaveButton.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(PlaceOrderbtn));
			//PlaceOrderbtn.click();	
			JavascriptExecutor js = (JavascriptExecutor)driver; 
			js.executeScript("arguments[0].click();",	PlaceOrderbtn);
			//}else {
			//AgreeCheckbox.click();
			//SaveButton.click();
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.elementToBeClickable(PlaceOrderbtn));
			//PlaceOrderbtn.click();	
			//JavascriptExecutor js = (JavascriptExecutor)driver; 
			//js.executeScript("arguments[0].click();",	PlaceOrderbtn);
			//}
			
		  
		  return new Thanks_you_for_PlacingPage();	
	 
  }
	  


}
