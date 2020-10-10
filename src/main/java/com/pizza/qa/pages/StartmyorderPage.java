package com.pizza.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pizza.qa.testbase.TestBase;

public class StartmyorderPage extends TestBase {

	
	//Page Factory - OR:
	
		@FindBy(xpath="//select[@formcontrolname='Province']")
		static
		WebElement city;
	
		
		@FindBy(xpath="//select[@formcontrolname='Suburb']")
		static
		WebElement area;
		
		
		
		@FindBy(xpath="//*[contains(text(),'Start My Order') and @class ='btn btn-green w-100 ']")
		WebElement StartMyOrderBtn;
		
		
		@FindBy(xpath="/html/body/app-root/app-home/app-header/div[2]/div/div[1]/img")
		WebElement pizzaLogo;
		
		@FindBy(xpath="//*[contains(text(),'Take Away')]")
		WebElement TakeAway_button;
		
		@FindBy(xpath="//*[contains(text(),'Find Nearest Store')]")
		WebElement Find_Nearest_store_button;
		
		
		
		//Initializing the Page Objects:
		public StartmyorderPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateStartmyorderPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validatePizzaImage() {
			
			return pizzaLogo.isDisplayed();
		}
		
		
		
		
		  public YourcartPage Startmyorder() { 
		 		  
		  Select cityselect = new Select(city);
		  cityselect.selectByVisibleText("IBRI"); 
		  //WebElement CityElement =  cityselect.getFirstSelectedOption();
		  //System.out.println("CityElement :"+  cityselect.getFirstSelectedOption());
		   
		  
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.elementToBeClickable(area));
		  //System.out.println("before entering the Select area");
		  Select areaselect = new Select(area); 
		  areaselect.selectByVisibleText("IBRI");
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  StartMyOrderBtn.click(); 
		 // JavascriptExecutor js = (JavascriptExecutor)driver; 
		  //js.executeScript("arguments[0].click();",	StartMyOrderBtn);
		  
		  return new YourcartPage();
		  
		  }
		 
	
		  
		  
		  
		  public TakeAwayPage ClickOnTakeAway_button() { 
	 		  
			  TakeAway_button.click();
			  
			  WebDriverWait wait = new WebDriverWait(driver, 10);
			  wait.until(ExpectedConditions.elementToBeClickable(city));
			  Select cityselect = new Select(city);
			  cityselect.selectByVisibleText("IBRI"); 
			 
			  Select areaselect = new Select(area); 
			  areaselect.selectByVisibleText("IBRI");
			  			   
			 // JavascriptExecutor js = (JavascriptExecutor)driver; 
			  //js.executeScript("arguments[0].click();",	StartMyOrderBtn);
			  Find_Nearest_store_button.click();
			  return new TakeAwayPage();
			  
			  }
			
	
	
}
