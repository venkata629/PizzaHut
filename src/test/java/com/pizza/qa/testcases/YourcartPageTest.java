package com.pizza.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.PizzaTabPage;
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.testbase.TestBase;

public class YourcartPageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;	
	//TestUtil testUtil;	
	YourcartPage yourcartPage;
	SelectpizzaPage selectpizzaPage;
	PizzaTabPage pizzaTabPage;

	public YourcartPageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp(){
		initialization();
		//testUtil = new TestUtil();		
		startmyorderPage = new StartmyorderPage();
		yourcartPage = startmyorderPage.Startmyorder();		
		pizzaTabPage = yourcartPage.ClickOnPizzaTab(); 
		selectpizzaPage = new SelectpizzaPage();
	}
	
	
	@Test(priority=1)
	public void verifyYourcartPageTitleTest(){
		String yourcartPageTitle = yourcartPage.verifyYourcartPageTitle();
		Assert.assertEquals(yourcartPageTitle, "Pizza Hut Oman | Pizza Delivery Near you | Order Pizza Online","Yourcart page title not matched");
	}
	
	
	  @Test(priority=2) public void verifyUserSelectionTest(){
	  //testUtil.switchToFrame(); 
	   boolean flag =((YourcartPage)yourcartPage).verifyCorrectUserSelection();
	  Assert.assertTrue(flag); }
	 
	
	
	  @Test(priority=3) 
	  public void verifyPriceonSeletionBtnTest(){
	  //testUtil.switchToFrame(); 
		  System.out.println("inside Priceonseletion");		
			//TestUtil.takeScreenshotAtEndOfTest("yourcartPage");		
		  selectpizzaPage = yourcartPage.clickOnPriceonSelectionBtn(); 
	  }
	 
	  @Test(groups ={"TakeAway"}) 
	  public void verifyPizzaTabSeletionTest(){
	  //testUtil.switchToFrame(); 
		  //TestUtil.takeScreenshotAtEndOfTest("yourcartPage");		
		  pizzaTabPage = yourcartPage.ClickOnPizzaTab(); 
	  }
	
	
	
	@AfterMethod
	public void tearDown(){
		
		
			//driver.quit();
		}
	
	
	

}
