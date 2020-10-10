package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizza.qa.testbase.TestBase;

 

public class YourcartsummaryDetailsPage extends TestBase{
	
	 // public static actual_val="";
	  @FindBy(xpath = "//*[@id=\"cartsectionresp\"]/div/div[3]/div/div[2]/div/input")	//  
	  @CacheLookup 
	  
	  WebElement checkoutOMRBtn;
	 
	  	
	@FindBy(xpath = "//button[@class = 'btn btn-green  w-100 ']")
	@CacheLookup
	WebElement AfterclickiingOkBtn_checkoutOMRBtn;
	
	@FindBy(xpath = "//*[@id=\"pills-Deals\"]/div/div/div[2]/div/div[1]/h3")
	@CacheLookup
	WebElement  CHICKEN_SUPREME_PizzaSelected;
	
	@FindBy(xpath = "//*[@id='Starters']")
	@CacheLookup
	WebElement  StartersTab;
	
	@FindBy(xpath = "//*[@id='Drinks']")
	@CacheLookup
	WebElement  DrinksTab;
	
	@FindBy(xpath = "//*[@id=\"cart-contain_scroll\"]/div[3]/div[1]/div[2]/div/span[1]/a/i")
	@CacheLookup
	WebElement  RemoveOneItem;
	
	
	
		
	// Initializing the Page Objects:
	public YourcartsummaryDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyYourcartsummaryDetailsPageTitle(){
		return driver.getTitle();
	}	
	
	//Delete the toppings
	
	public void clickOnDeleting_DrinkBtn(){
		RemoveOneItem.click();	  
	 //return new CheckoutLoginPage();
	 }
	
	  public CheckoutLoginPage clickOncheckoutOMRBtn(){
		//driver.findElement(by.name(button)
		String checkoutval = checkoutOMRBtn.getAttribute("value");
		int len = checkoutval.length();
		actualamount = checkoutval.substring(13, len);		
		System.out.println(actualamount);
	  checkoutOMRBtn.click(); 	 
	  
	  return new CheckoutLoginPage();
		 
	  }
	
	  public CustomizePizzaPage clickOnCHICKEN_SUPREME_PizzaSelectedBtn(){
		  CHICKEN_SUPREME_PizzaSelected.click(); 	  
		  return new CustomizePizzaPage();
			 
		  }
	  
	  public StartersTabPage clickOnStartersTab(){
		  StartersTab.click(); 	  
		  return new StartersTabPage();
			 
		  }
	  
	  public Drinks_Tab_Page clickOnDrinksTab(){
		  DrinksTab.click(); 	  
		  return new Drinks_Tab_Page();
			 
		  }
	  
	  
	  }
	 


