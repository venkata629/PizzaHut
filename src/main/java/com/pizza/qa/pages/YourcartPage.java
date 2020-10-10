package com.pizza.qa.pages;





import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizza.qa.testbase.TestBase;

public class YourcartPage extends TestBase {
	
	@FindBy(xpath = "//*[@id=\"menusection\"]/app-header/div[2]/div/div[2]/div[1]/div[3]/span/span")
	@CacheLookup
	WebElement userselectionval;	
	
	@FindBy(xpath = "//*[contains(text(),'MY BOX') and @class ='card-title clr-three mb-0']")
	WebElement MyBoxbtn;
	
	@FindBy(xpath="//*[@class='nav-link' and @id='Pizza']")
	static
	WebElement PizzaTab;
	

	// Initializing the Page Objects:
	public YourcartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyYourcartPageTitle(){
		return driver.getTitle();
	}
	
	
	
	  public boolean verifyCorrectUserSelection(){
	  System.out.println("Deal City and Area"+userselectionval); 
	  return  userselectionval.isDisplayed(); 
	  }
	 
	
	
	  public SelectpizzaPage clickOnPriceonSelectionBtn(){
		 MyBoxbtn.click(); 
		 return new SelectpizzaPage(); 
		 }
	  
	  

	public PizzaTabPage ClickOnPizzaTab() {
		  //driver.switchTo().frame(PizzaTab);
		  //Actions action = new Actions (driver);
		  //action.moveToElement(PizzaTab).build().perform();
		  //action.doubleClick();
		  PizzaTab.click();		  
		  return new PizzaTabPage();  
	}

			
	

	
}
