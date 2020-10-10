package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.CustomizePizzaPage;
import com.pizza.qa.pages.PizzaTabPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.pages.YourcartsummaryDetailsPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class CustomizePizzaPageTest extends TestBase {

	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	PizzaTabPage pizzaTabPage;
	CustomizePizzaPage customizePizzaPage;
	YourcartsummaryDetailsPage yourcartsummaryDetailsPage;
	Boolean flag;
	
	public CustomizePizzaPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		
	}
	
	
	
	  
	  @Test(groups ={"TakeAway"}) 
	  public void CustomizePizzaPageFlowTest() throws IOException{ 
		  
		  	startmyorderPage = new StartmyorderPage();
			pizzaTabPage = new PizzaTabPage();
			yourcartPage = startmyorderPage.Startmyorder();	
			//clickOnCustomizePanPizzaimg = new ClickOnCustomizePanPizzaimg();
			pizzaTabPage = yourcartPage.ClickOnPizzaTab(); 
			customizePizzaPage= pizzaTabPage.ClickOnDYNAMITESHRIMPPizzaSelected();
			customizePizzaPage.ClickOnCustomizePanPizzaimg();
			customizePizzaPage.ClickOnIncludedToppingsPanPizza();
			yourcartsummaryDetailsPage = customizePizzaPage.ClickOnAddtoCartBtnPanPizza();
			int val = 1;
			if (val==1) {
				customizePizzaPage = yourcartsummaryDetailsPage.clickOnCHICKEN_SUPREME_PizzaSelectedBtn();
				customizePizzaPage.ClickOnCustomizePanPizzaimg();
				customizePizzaPage.ClickOnIncludedToppingsPanPizza();
				yourcartsummaryDetailsPage = customizePizzaPage.ClickOnAddtoCartBtnPanPizza();
				flag = true;
			}
	   
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
