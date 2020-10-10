package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.AddtoDealPizzainSelectedpizzaDetailsPage;
import com.pizza.qa.pages.AvailablePanPizzaDetailsPage;
import com.pizza.qa.pages.CheckoutLoginPage;
import com.pizza.qa.pages.CustomizePizzaPage;
import com.pizza.qa.pages.Drinks_Tab_Page;
import com.pizza.qa.pages.MyBoxSelectedPizzaPage;
import com.pizza.qa.pages.MyboxStarterpickingPage;
import com.pizza.qa.pages.PlaceOrderSummaryPage;
import com.pizza.qa.pages.RegisterPage;
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartersTabPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.Thanks_you_for_PlacingPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.pages.YourcartsummaryDetailsPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class RegisterPageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	//TestUtil testUtil;
	SelectpizzaPage selectpizzaPage;
	MyBoxSelectedPizzaPage myBoxSelectedPizzaPage;
	MyboxStarterpickingPage myboxStarterpickingPage;
	YourcartsummaryDetailsPage yourcartsummaryDetailsPage;
	AvailablePanPizzaDetailsPage availablePanPizzaDetailsPage;
	AddtoDealPizzainSelectedpizzaDetailsPage addtoDealPizzainSelectedpizzaDetailsPage;
	CustomizePizzaPage customizePizzaPage;
	CheckoutLoginPage checkoutLoginPage;
	StartersTabPage startersTabPage;
	Drinks_Tab_Page drinks_Tab_Page;
	RegisterPage registerPage;
	PlaceOrderSummaryPage placeOrderSummaryPage;
	Thanks_you_for_PlacingPage thanks_you_for_PlacingPage;
	

	public RegisterPageTest() {
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
		//addtoDealPizzainSelectedpizzaDetailsPage = availablePanPizzaDetailsPage.clickOnAvailablePanpizzaAddtoDealBtn();
		 checkoutLoginPage = yourcartsummaryDetailsPage.clickOncheckoutOMRBtn();
		 placeOrderSummaryPage = checkoutLoginPage.clickOnCreateAccountUserLink();
		 registerPage = new RegisterPage();
		// placeOrderSummaryPage = registerPage.RegisterPageDetails();
		 
		 
		 
		 //customizePizzaPage = yourcartsummaryDetailsPage.clickOnCHICKEN_SUPREME_PizzaSelectedBtn();
		// startersTabPage = yourcartsummaryDetailsPage.clickOnStartersTab();
		 
	}
		
	
	
	 
	  
	@Test
	  public void verifyclickOnCreateUserBtnTest(){
	
		  placeOrderSummaryPage = registerPage.RegisterPageDetails();
	  }
	
	@AfterMethod
	public void tearDown(ITestResult result){
		 if(result.getStatus()==1) {
			 System.out.println("Test Case Passed");
		 }else if(result.getStatus()== 2) {
			 try {
				TestUtil.takeScreenshotAtEndOfTest("yourcartsummaryDetailsPage");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			//driver.quit();
		}


	
	
}
