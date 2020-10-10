package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pizza.qa.testbase.TestBase;

public class StartersTabPage extends TestBase {
	
	//Page Factory - OR:
	
		@FindBy(xpath = "//*[contains(text(),'Add To Cart')]")
		@CacheLookup
		WebElement Starters_1_Selected;	
		
		@FindBy(xpath = "//*[@id='Drinks']")
		@CacheLookup
		WebElement DrinksTab_Selected;	
		
		
				
				
				
				//Initializing the Page Objects:
				public StartersTabPage(){
					PageFactory.initElements(driver, this);
				}
				
				//Actions:
				public String validatePizzaTabPageTitle(){
					return driver.getTitle();
				}
				
				
				public YourcartsummaryDetailsPage ClickOnStarters_Selected() {
					  //driver.switchTo().frame(PizzaTab);
					  //Actions action = new Actions (driver);
					  //action.moveToElement(PizzaTab).build().perform();
					  //action.doubleClick();
					WebDriverWait wait = new WebDriverWait(driver, 10);
					  wait.until(ExpectedConditions.elementToBeClickable(Starters_1_Selected));
					//JavascriptExecutor js = (JavascriptExecutor)driver; 
					  //js.executeScript("arguments[0].click();",	DYNAMITESHRIMPPizzaSelected);
					  Starters_1_Selected.click();
					  Starters_1_Selected.click();
					  
					  return new YourcartsummaryDetailsPage();  
				}
				
				public Drinks_Tab_Page ClickOnDrinksTab_Selected() {
					  //driver.switchTo().frame(PizzaTab);
					  //Actions action = new Actions (driver);
					  //action.moveToElement(PizzaTab).build().perform();
					  //action.doubleClick();
					WebDriverWait wait = new WebDriverWait(driver, 10);
					  wait.until(ExpectedConditions.elementToBeClickable(DrinksTab_Selected));
					//JavascriptExecutor js = (JavascriptExecutor)driver; 
					  //js.executeScript("arguments[0].click();",	DYNAMITESHRIMPPizzaSelected);
					  DrinksTab_Selected.click();
					 
					  
					  return new Drinks_Tab_Page();  
				}
				
				

}
