package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.CustomizePizzaPage;
import com.pizza.qa.pages.PizzaTabPage;
import com.pizza.qa.pages.StartersTabPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.pages.YourcartsummaryDetailsPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class StartersTabPageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	PizzaTabPage pizzaTabPage;
	CustomizePizzaPage customizePizzaPage;
	StartersTabPage startersTabPage;
	YourcartsummaryDetailsPage yourcartsummaryDetailsPage;
	
	public StartersTabPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		startmyorderPage = new StartmyorderPage();
		pizzaTabPage = new PizzaTabPage();		
		yourcartPage = startmyorderPage.Startmyorder();		
		pizzaTabPage = yourcartPage.ClickOnPizzaTab(); 
		customizePizzaPage= pizzaTabPage.ClickOnDYNAMITESHRIMPPizzaSelected();
		
	
	}
	
	
	
	 
	@Test(groups ={"MultiplePizza"}) 
	  public void verifyClickOnDYNAMITESHRIMPPizzaSelectedTest(){ 
		  customizePizzaPage= pizzaTabPage.ClickOnDYNAMITESHRIMPPizzaSelected();
	   	   
	   }
	 
	@Test(groups = "TakeAway") 
	  public void verifyClickOnStartersSelectedTest(){ 
		yourcartsummaryDetailsPage= startersTabPage.ClickOnStarters_Selected();
	   	   
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
