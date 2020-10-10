package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pizza.qa.testbase.TestBase;

public class Drinks_Tab_Page extends TestBase {

	//Page Factory - OR:
	
			@FindBy(xpath = "//*[contains(text(),'Add To Cart')]")
			@CacheLookup
			WebElement Drinks_1_Selected;	
			
			@FindBy(xpath = "//*[contains(text(),'Checkout')]")
			@CacheLookup
			WebElement CheckOut_Button;			
			
					
					
					
					//Initializing the Page Objects:
					public Drinks_Tab_Page(){
						PageFactory.initElements(driver, this);
					}
					
					//Actions:
					public String validateDrinks_Tab_PageTitle(){
						return driver.getTitle();
					}
					
					
					public YourcartsummaryDetailsPage ClickOnDrinksSelected() {
						  //driver.switchTo().frame(PizzaTab);
						  //Actions action = new Actions (driver);
						  //action.moveToElement(PizzaTab).build().perform();
						  //action.doubleClick();
						WebDriverWait wait = new WebDriverWait(driver, 10);
						  wait.until(ExpectedConditions.elementToBeClickable(Drinks_1_Selected));
						//JavascriptExecutor js = (JavascriptExecutor)driver; 
						  //js.executeScript("arguments[0].click();",	DYNAMITESHRIMPPizzaSelected);
						  Drinks_1_Selected.click();
						  WebDriverWait wait1 = new WebDriverWait(driver, 10);
						  wait1.until(ExpectedConditions.elementToBeClickable(Drinks_1_Selected));
						  Drinks_1_Selected.click();
						  
						  return new YourcartsummaryDetailsPage();  
					}
					
					/*
					 * public CheckoutLoginPage ClickOnCheckOut_Button() {
					 * //driver.switchTo().frame(PizzaTab); //Actions action = new Actions (driver);
					 * //action.moveToElement(PizzaTab).build().perform(); //action.doubleClick();
					 * WebDriverWait wait = new WebDriverWait(driver, 10);
					 * wait.until(ExpectedConditions.elementToBeClickable(CheckOut_Button)); String
					 * ordervalue = CheckOut_Button.getText(); System.out.println(ordervalue);
					 * //JavascriptExecutor js = (JavascriptExecutor)driver;
					 * //js.executeScript("arguments[0].click();", DYNAMITESHRIMPPizzaSelected);
					 * CheckOut_Button.click();
					 * 
					 * return new CheckoutLoginPage(); }
					 */
					
	
}
