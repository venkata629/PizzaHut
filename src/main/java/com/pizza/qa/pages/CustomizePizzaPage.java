package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pizza.qa.testbase.TestBase;

public class CustomizePizzaPage extends TestBase {
	
	@FindBy(xpath = "//*[contains(text(),'Pan')]")
	@CacheLookup
	WebElement CustomizePanPizza;	
	
	@FindBy(xpath = "//*[contains(text(),'Included Toppings')]")
	@CacheLookup
	WebElement IncludedToppingsPanPizza;
	
	@FindBy(xpath = "//*[contains(text(),'Grilled Chicken') and @class='mb-0 clr-one']")
	@CacheLookup
	WebElement Grilled_Chicken_checkbox;
	
	
	@FindBy(xpath = "//*[@id=\"ItemCustomization\"]/div/div/div/div[2]/div[2]/input")
	@CacheLookup
	WebElement AddtoCartBtn;	
	
	
	
	@FindBy(xpath = "//*[contains(text(),'Onions') and @class='mb-0 clr-one']")
	@CacheLookup
	WebElement Onions_checkbox;
	
	@FindBy(xpath = "//*[contains(text(),'Green Pepper') and @class='mb-0 clr-one']")
	@CacheLookup
	WebElement Green_Pepper_checkbox;
	
	@FindBy(xpath = "//*[contains(text(),'Black Olives') and @class='mb-0 clr-one']")
	@CacheLookup
	WebElement Black_Olives_checkbox;
	
	
	@FindBy(xpath = "//*[contains(text(),'Mushrooms') and @class='mb-0 clr-one']")
	@CacheLookup
	WebElement Mushrooms_checkbox;
	
	
	
	

	// Initializing the Page Objects:
	public CustomizePizzaPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCustomizePizzaPageTitle(){
		return driver.getTitle();	}
	
	
	
	 
	  

	
	  public void ClickOnCustomizePanPizzaimg() { //driver.switchTo().frame(PizzaTab);
	  //Actions action = new Actions (driver);
	  //action.moveToElement(PizzaTab).build().perform(); //action.doubleClick();
		  CustomizePanPizza.click();
	  
	  //return new PizzaTabPage(); 
	  }
	  
	  public void ClickOnIncludedToppingsPanPizza() { //driver.switchTo().frame(PizzaTab);
		  		 
		    	IncludedToppingsPanPizza.click();
		  		WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.elementToBeClickable(Grilled_Chicken_checkbox));
				//JavascriptExecutor js = (JavascriptExecutor)driver; 
				//  js.executeScript("arguments[0].click();",	SelectToppingscheckbox);
				//SelectToppingscheckbox.click();
				Grilled_Chicken_checkbox.click();
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				wait1.until(ExpectedConditions.elementToBeClickable(Onions_checkbox));
				Onions_checkbox.click();
				
				/*
				 * WebDriverWait wait2 = new WebDriverWait(driver, 20);
				 * wait2.until(ExpectedConditions.elementToBeClickable(Green_Pepper_checkbox));
				 * Green_Pepper_checkbox.click(); Green_Pepper_checkbox.click();
				 */
				
				/*
				 * WebDriverWait wait3 = new WebDriverWait(driver, 20);
				 * wait3.until(ExpectedConditions.elementToBeClickable(Black_Olives_checkbox));
				 * Black_Olives_checkbox.click();
				 * 
				 * WebDriverWait wait4 = new WebDriverWait(driver, 20);
				 * wait4.until(ExpectedConditions.elementToBeClickable(Mushrooms_checkbox));
				 * Mushrooms_checkbox.click();
				 */
		  
		  //return new PizzaTabPage(); 
		  }
	  
	  public YourcartsummaryDetailsPage ClickOnAddtoCartBtnPanPizza() { //driver.switchTo().frame(PizzaTab);
		  //Actions action = new Actions (driver);
		  //action.moveToElement(PizzaTab).build().perform(); //action.doubleClick();
		  AddtoCartBtn.click();
		  
		  return new YourcartsummaryDetailsPage(); 
		  }
		  
	  

}
