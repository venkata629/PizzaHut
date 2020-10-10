package com.pizza.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.AddtoDealPizzainSelectedpizzaDetailsPage;
import com.pizza.qa.pages.AvailablePanPizzaDetailsPage;
import com.pizza.qa.pages.CheckoutLoginPage;
import com.pizza.qa.pages.MyBoxSelectedPizzaPage;
import com.pizza.qa.pages.MyboxStarterpickingPage;
import com.pizza.qa.pages.PlaceOrderSummaryPage;
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.pages.YourcartsummaryDetailsPage;
import com.pizza.qa.testbase.TestBase;

public class CheckoutLoginPageTest extends TestBase{
	
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	//TestUtil testUtil;
	SelectpizzaPage selectpizzaPage;
	MyBoxSelectedPizzaPage myBoxSelectedPizzaPage;
	MyboxStarterpickingPage myboxStarterpickingPage;
	YourcartsummaryDetailsPage yourcartsummaryDetailsPage;
	PlaceOrderSummaryPage placeOrderSummaryPage;
	AvailablePanPizzaDetailsPage availablePanPizzaDetailsPage;
	AddtoDealPizzainSelectedpizzaDetailsPage addtoDealPizzainSelectedpizzaDetailsPage;
	
	CheckoutLoginPage checkoutLoginPage;
	

	public CheckoutLoginPageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		//testUtil = new TestUtil();
		selectpizzaPage = new SelectpizzaPage();
		startmyorderPage = new StartmyorderPage();
		addtoDealPizzainSelectedpizzaDetailsPage = new AddtoDealPizzainSelectedpizzaDetailsPage();
		yourcartPage = startmyorderPage.Startmyorder();
		selectpizzaPage = yourcartPage.clickOnPriceonSelectionBtn();		
		myboxStarterpickingPage = new MyboxStarterpickingPage();
		myBoxSelectedPizzaPage = selectpizzaPage.clickOnSelectPizzaBtn();
		selectpizzaPage = myBoxSelectedPizzaPage.clickOnMyBoxpizzaAddtoDealBtn(); 
		myBoxSelectedPizzaPage = selectpizzaPage.clickOnMyBoxSelectStartersBtn_1();
		myBoxSelectedPizzaPage = myboxStarterpickingPage.clickOnMyboxStarterpickingPageAddtoDealBtn();
		selectpizzaPage = myBoxSelectedPizzaPage.clickOnMyBoxSelectStartersBtn_2();
		myBoxSelectedPizzaPage= myboxStarterpickingPage.clickOnMyboxStarterpickingPageAddtoDeal_2Btn();
		yourcartsummaryDetailsPage = new YourcartsummaryDetailsPage();
		yourcartsummaryDetailsPage = myBoxSelectedPizzaPage.clickOnMyBoxSelectStartersAddToCartBtn();
		placeOrderSummaryPage = new PlaceOrderSummaryPage();
		//addtoDealPizzainSelectedpizzaDetailsPage = availablePanPizzaDetailsPage.clickOnAvailablePanpizzaAddtoDealBtn();
		 checkoutLoginPage = yourcartsummaryDetailsPage.clickOncheckoutOMRBtn();		 
		 placeOrderSummaryPage = checkoutLoginPage.clickOnContinue_as_GustuserLink();
		
		 
	}
	
	
	@Test(priority=1)
	public void verifyCheckoutLoginPageTitleTest(){
		String CheckoutLoginPageTitle = checkoutLoginPage.verifyCheckoutLoginPageTitle();
		Assert.assertEquals(CheckoutLoginPageTitle, "Pizza Hut Oman | Pizza Delivery Near you | Order Pizza Online","Yourcart page title not matched");
	}
	
	
	
	
	  @Test(priority=2) 
	  public void verifyGustlogin_PlaceOrderPageTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Your Cart summary details screen");
		  
		  placeOrderSummaryPage = checkoutLoginPage.clickOnContinue_as_GustuserLink(); 
	  }
	  
	  @Test(priority=3) 
	  public void verifyCreateAccountUserLinkTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Your Cart summary details screen");
		  
		  placeOrderSummaryPage = checkoutLoginPage.clickOnCreateAccountUserLink(); 
	  }
	 
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}



}
