package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.pizza.qa.pages.AddtoDealPizzainSelectedpizzaDetailsPage;
import com.pizza.qa.pages.AvailablePanPizzaDetailsPage;
import com.pizza.qa.pages.CheckoutLoginPage;
import com.pizza.qa.pages.MyBoxSelectedPizzaPage;
import com.pizza.qa.pages.MyboxStarterpickingPage;
import com.pizza.qa.pages.PlaceOrderSummaryPage;
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.Thanks_you_for_PlacingPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.pages.YourcartsummaryDetailsPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class Thanks_you_for_PlacingPageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	//TestUtil testUtil;
	SelectpizzaPage selectpizzaPage;
	MyBoxSelectedPizzaPage myBoxSelectedPizzaPage;
	MyboxStarterpickingPage myboxStarterpickingPage;
	YourcartsummaryDetailsPage yourcartsummaryDetailsPage;
	PlaceOrderSummaryPage placeOrderSummaryPage;
	Thanks_you_for_PlacingPage thanks_you_for_PlacingPage;
	AvailablePanPizzaDetailsPage availablePanPizzaDetailsPage;
	AddtoDealPizzainSelectedpizzaDetailsPage addtoDealPizzainSelectedpizzaDetailsPage;
	
	CheckoutLoginPage checkoutLoginPage;
	

	public Thanks_you_for_PlacingPageTest() {
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
		 thanks_you_for_PlacingPage = new Thanks_you_for_PlacingPage();
		// thanks_you_for_PlacingPage = placeOrderSummaryPage.clickOnPlaceOrderbuttonClick();
		 
		 
	}
	
	
		 
	 
	
	@AfterMethod
	public void tearDown(ITestResult result){
		 if(result.getStatus()==1) {
			 System.out.println("Test Case Passed");
		 }else if(result.getStatus()== 2) {
			 try {
				TestUtil.takeScreenshotAtEndOfTest("Thanks_you_for_PlacingPage");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			driver.quit();
		}



	
	
}
