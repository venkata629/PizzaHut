package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.AddtoDealPizzainSelectedpizzaDetailsPage;
import com.pizza.qa.pages.AvailablePanPizzaDetailsPage;
import com.pizza.qa.pages.CheckoutLoginPage;
import com.pizza.qa.pages.ItemsOrderSummaryPage;
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.pages.YourcartsummaryDetailsPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class OrderSummaryPageTest extends TestBase {

	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	//TestUtil testUtil;
	SelectpizzaPage selectpizzaPage;
	AvailablePanPizzaDetailsPage availablePanPizzaDetailsPage;
	AddtoDealPizzainSelectedpizzaDetailsPage addtoDealPizzainSelectedpizzaDetailsPage;
	YourcartsummaryDetailsPage yourcartsummaryDetailsPage;
	CheckoutLoginPage checkoutLoginPage;
	OrderSummaryPageTest orderSummaryPageTest;
	ItemsOrderSummaryPage itemsOrderSummaryPage;
	

	public OrderSummaryPageTest() {
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
		availablePanPizzaDetailsPage = new AvailablePanPizzaDetailsPage();
		selectpizzaPage = new SelectpizzaPage();
		startmyorderPage = new StartmyorderPage();
		addtoDealPizzainSelectedpizzaDetailsPage = new AddtoDealPizzainSelectedpizzaDetailsPage();
		yourcartsummaryDetailsPage = new YourcartsummaryDetailsPage();
		checkoutLoginPage = new CheckoutLoginPage();
		orderSummaryPageTest = new OrderSummaryPageTest();
		itemsOrderSummaryPage = new ItemsOrderSummaryPage();
		yourcartPage = startmyorderPage.Startmyorder();
		selectpizzaPage = yourcartPage.clickOnPriceonSelectionBtn();
		//availablePanPizzaDetailsPage = selectpizzaPage.clickOnSelectPizzaBtn();
		addtoDealPizzainSelectedpizzaDetailsPage = availablePanPizzaDetailsPage.clickOnAvailablePanpizzaAddtoDealBtn();
		 
	}
	
	
	@Test(priority=1)
	public void verifyOrderSummaryPageTestTitle(){
		//String orderSummaryPageTestTitle = orderSummaryPageTest.verifyOrderSummaryPageTestTitle();
		//Assert.assertEquals(orderSummaryPageTestTitle, "Pizza Hut Oman | Pizza Delivery Near you | Order Pizza Online","Yourcart page title not matched");
	}
	
	/*
	 * @Test(priority=2) public void verifyUserSelectionTest(){
	 * //testUtil.switchToFrame(); boolean flag =((YourcartPage)
	 * yourcartPage).verifyCorrectUserSelection1(); Assert.assertTrue(flag); }
	 */
	
	
	/*
	 * @Test(priority=3) public itemsOrderSummaryPage verifyPlaceorderBtnTest(){
	 * //testUtil.switchToFrame();
	 * System.out.println("Near to Your in ordersummary details screen");
	 * itemsOrderSummaryPage = orderSummaryPageTest.verifyPlaceorderBtnTest(); }
	 */
	 
	
	@AfterMethod
	public void tearDown(ITestResult result){
		 if(result.getStatus()==1) {
			 System.out.println("Test Case Passed");
		 }else if(result.getStatus()== 2) {
			 try {
				TestUtil.takeScreenshotAtEndOfTest("Order Summary Page");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			driver.quit();
		}

}
