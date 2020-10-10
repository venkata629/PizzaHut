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
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartersTabPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.pages.YourcartsummaryDetailsPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class YourcartsummaryDetailsPageTest extends TestBase {
	
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
	

	public YourcartsummaryDetailsPageTest() {
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
		
		 
		 //customizePizzaPage = yourcartsummaryDetailsPage.clickOnCHICKEN_SUPREME_PizzaSelectedBtn();
		// startersTabPage = yourcartsummaryDetailsPage.clickOnStartersTab();
		 
	}
		
	
	@Test(groups ={"TakeAway"})
	  public void verifyAddtoDealPizzaSelectedBtnTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Your Cart summary details screen");
		   checkoutLoginPage = yourcartsummaryDetailsPage.clickOncheckoutOMRBtn(); 
	  }
	 
	  
	  @Test
	  public void verifyclickOnCHICKEN_SUPREME_PizzaSelectedBtnTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Your Cart summary details screen");
		  customizePizzaPage = yourcartsummaryDetailsPage.clickOnCHICKEN_SUPREME_PizzaSelectedBtn(); 
	  }
	  
	  @Test
	  public void verifyclickOnStartersTabTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Your Cart summary details screen");
		  startersTabPage = yourcartsummaryDetailsPage.clickOnStartersTab(); 
	  }
	 
	  
	  @Test
	  public void verifyclickOnDrinksTabTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Your Cart summary details screen");
		  drinks_Tab_Page = yourcartsummaryDetailsPage.clickOnDrinksTab(); 
	  }
	  
	  @Test
	  public void verifyclickOnDeleting_ToppingTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Your Cart summary details screen");
		  yourcartsummaryDetailsPage.clickOnDeleting_DrinkBtn(); 
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
			driver.quit();
		}


}
