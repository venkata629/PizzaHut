package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.CustomizePizzaPage;
import com.pizza.qa.pages.Drinks_Tab_Page;
import com.pizza.qa.pages.PizzaTabPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.pages.YourcartsummaryDetailsPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class Drinks_Tab_PageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	PizzaTabPage pizzaTabPage;
	CustomizePizzaPage customizePizzaPage;
	Drinks_Tab_Page drinks_Tab_Page;
	YourcartsummaryDetailsPage yourcartsummaryDetailsPage;
	
	public Drinks_Tab_PageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		startmyorderPage = new StartmyorderPage();
		pizzaTabPage = new PizzaTabPage();	
		drinks_Tab_Page = new Drinks_Tab_Page();
		yourcartPage = startmyorderPage.Startmyorder();		
		pizzaTabPage = yourcartPage.ClickOnPizzaTab(); 
		customizePizzaPage= pizzaTabPage.ClickOnDYNAMITESHRIMPPizzaSelected();
		yourcartsummaryDetailsPage = drinks_Tab_Page.ClickOnDrinksSelected();
		
	
	}
	
	
	  @Test(priority=1) 
	  public void PizzaTabPageTitleTest() throws IOException{ 
	   String title = pizzaTabPage.validatePizzaTabPageTitle(); 
	   Assert.assertEquals(title,"Pizza Hut Oman | Pizza Delivery Near you | Order Pizza Online"); 
	   	   
	   }
	 
	  @Test(priority=2) 
	  public void verifyClickOnDYNAMITESHRIMPPizzaSelectedTest(){ 
		  customizePizzaPage= pizzaTabPage.ClickOnDYNAMITESHRIMPPizzaSelected();
	   	   
	   }
	  
	  @Test(priority=3) 
	  public void verifyClickOnDrinks_Tab_SelectedTest(){ 
		  yourcartsummaryDetailsPage= drinks_Tab_Page.ClickOnDrinksSelected();
	   	   
	   }
	 
	
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result){
		 if(result.getStatus()==1) {
			 System.out.println("Test Case Passed");
		 }else if(result.getStatus()== 2) {
			 try {
				TestUtil.takeScreenshotAtEndOfTest("StartMyOrderPage");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			//driver.quit();
		}


}
