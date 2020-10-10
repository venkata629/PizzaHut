package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.CustomizePizzaPage;
import com.pizza.qa.pages.PizzaTabPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class PizzaTabPageTest extends TestBase{
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	PizzaTabPage pizzaTabPage;
	CustomizePizzaPage customizePizzaPage;
	
	public PizzaTabPageTest(){
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
	
	
	  @Test(priority=1) 
	  public void PizzaTabPageTitleTest() throws IOException{ 
	   String title = pizzaTabPage.validatePizzaTabPageTitle(); 
	   Assert.assertEquals(title,"Pizza Hut Oman | Pizza Delivery Near you | Order Pizza Online"); 
	   	   
	   }
	 
	  @Test(groups ={"TakeAway"}) 
	  public void verifyClickOnDYNAMITESHRIMPPizzaSelectedTest(){ 
		  customizePizzaPage= pizzaTabPage.ClickOnDYNAMITESHRIMPPizzaSelected();
	   	   
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
