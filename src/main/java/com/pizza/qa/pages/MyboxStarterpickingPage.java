package com.pizza.qa.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pizza.qa.testbase.TestBase;

public class MyboxStarterpickingPage extends TestBase {
	
	@FindBy(xpath = "//*[contains(text(),'Add To Deal') and @class='ml-2']")
	@CacheLookup
	WebElement StarterAddtoDealPizzaBtn_1;
	
	@FindBy(xpath = "//*[contains(text(),'Add To Deal') and @class='ml-2']")
	@CacheLookup
	WebElement StarterAddtoDealPizzaBtn_2;
	
	
	
		
	// Initializing the Page Objects:
	public MyboxStarterpickingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyMyboxStarterpickingPageTitle(){
		return driver.getTitle();
	}
	
	
	
	  public MyBoxSelectedPizzaPage clickOnMyboxStarterpickingPageAddtoDealBtn(){
		  StarterAddtoDealPizzaBtn_1.click(); 
		 return new MyBoxSelectedPizzaPage(); 			
	  }	  
			
	  
	  public MyBoxSelectedPizzaPage clickOnMyboxStarterpickingPageAddtoDeal_2Btn(){
		  
		  
		  List <WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'Add To Deal') and @class='ml-2']"));
		 // int countElements =elements.size();
		  elements.get(1).click();
		  //StarterAddtoDealPizzaBtn_2.click();
		 return new MyBoxSelectedPizzaPage(); 			
	  }	  
			  


}
