package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pizza.qa.testbase.TestBase;

public class MyBoxSelectedPizzaPage extends TestBase {
	
	@FindBy(xpath = "//*[contains(text(),'Add To Deal') and @class ='ml-2']")
	@CacheLookup
	WebElement AddtoDealPizzaBtn;
	
	@FindBy(xpath = "//*[@id ='addButton1']")
	@CacheLookup
	static
	WebElement SelectStartersAddBtn_1;
	
	@FindBy(xpath = "//*[@id ='addButton2']")
	@CacheLookup
	static
	WebElement SelectStartersAddBtn_2;
	
	@FindBy(xpath = "//*[@name =\"button\"]")
	@CacheLookup
	static
	WebElement AddToCartBtn;
	
		
	// Initializing the Page Objects:
	public MyBoxSelectedPizzaPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyMyBoxSelectedPizzaPageTitle(){
		return driver.getTitle();
	}
	
	
	
	  public SelectpizzaPage clickOnMyBoxpizzaAddtoDealBtn(){
		  AddtoDealPizzaBtn.click(); 
		 return new SelectpizzaPage(); 
		 }

	  

			
			  public MyBoxSelectedPizzaPage clickOnMyBoxSelectStartersBtn_1() {
				  WebDriverWait wait = new WebDriverWait(driver, 10);
				  wait.until(ExpectedConditions.elementToBeClickable(SelectStartersAddBtn_1));
			  SelectStartersAddBtn_1.click(); 
			  return new MyBoxSelectedPizzaPage();
			  }
			 
			  public SelectpizzaPage clickOnMyBoxSelectStartersBtn_2() {
				  WebDriverWait wait = new WebDriverWait(driver, 10);
				  wait.until(ExpectedConditions.elementToBeClickable(SelectStartersAddBtn_2));
			  SelectStartersAddBtn_2.click(); 
			  return new SelectpizzaPage();
			  }

			  public YourcartsummaryDetailsPage clickOnMyBoxSelectStartersAddToCartBtn() {
				  WebDriverWait wait = new WebDriverWait(driver, 10);
				  wait.until(ExpectedConditions.elementToBeClickable(AddToCartBtn));
				  AddToCartBtn.click(); 
			  return new YourcartsummaryDetailsPage();
			  }
	

}
