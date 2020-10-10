package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pizza.qa.testbase.TestBase;

public class PizzaTabPage extends TestBase {
	
	//Page Factory - OR:
	
	
	@FindBy(xpath = "//*[@id='customise_1']")
	@CacheLookup
	WebElement DYNAMITESHRIMPPizzaSelected;	
	
	
			
			
			
			
			//Initializing the Page Objects:
			public PizzaTabPage(){
				PageFactory.initElements(driver, this);
			}
			
			//Actions:
			public String validatePizzaTabPageTitle(){
				return driver.getTitle();
			}
			
			
			public CustomizePizzaPage ClickOnDYNAMITESHRIMPPizzaSelected() {
				  
				WebDriverWait wait = new WebDriverWait(driver, 10);
				  wait.until(ExpectedConditions.elementToBeClickable(DYNAMITESHRIMPPizzaSelected));
				//JavascriptExecutor js = (JavascriptExecutor)driver; 
				  //js.executeScript("arguments[0].click();",	DYNAMITESHRIMPPizzaSelected);
				  DYNAMITESHRIMPPizzaSelected.click();
				  
				  return new CustomizePizzaPage();  
			}
			
			
			
			
			 

}
