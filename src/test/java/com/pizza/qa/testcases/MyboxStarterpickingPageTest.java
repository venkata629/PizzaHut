package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.AddtoDealPizzainSelectedpizzaDetailsPage;
import com.pizza.qa.pages.AvailablePanPizzaDetailsPage;
import com.pizza.qa.pages.MyBoxSelectedPizzaPage;
import com.pizza.qa.pages.MyboxStarterpickingPage;
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.pages.YourcartsummaryDetailsPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class MyboxStarterpickingPageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	//TestUtil testUtil;
	SelectpizzaPage selectpizzaPage;
	MyBoxSelectedPizzaPage myBoxSelectedPizzaPage;
	MyboxStarterpickingPage myboxStarterpickingPage;
	YourcartsummaryDetailsPage yourcartsummaryDetailsPage;
	AvailablePanPizzaDetailsPage availablePanPizzaDetailsPage;
	AddtoDealPizzainSelectedpizzaDetailsPage addtoDealPizzainSelectedpizzaDetailsPage;
	

	public MyboxStarterpickingPageTest() {
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
	}
	

	
	  @Test(priority=1) 
	  public void verifyMyboxStarterpickingPageAddtoDealBtnTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Add to Deal button");
		  myBoxSelectedPizzaPage = myboxStarterpickingPage.clickOnMyboxStarterpickingPageAddtoDealBtn() ;
	  }
	 
	  
	  @Test(priority=2) 
	  public void verifyMyboxStarterpickingPageAddtoDealBtn_2Test(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Add to Deal button");
		  myBoxSelectedPizzaPage = myboxStarterpickingPage.clickOnMyboxStarterpickingPageAddtoDeal_2Btn();
	  }
	  	  
	  @Test(priority=3) 
	  public void verifyMyboxStarterpickingPageAddtoCartBtnTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Add to Deal button");
		  yourcartsummaryDetailsPage = myBoxSelectedPizzaPage.clickOnMyBoxSelectStartersAddToCartBtn();
	  }
		  
	@AfterMethod
	public void tearDown(ITestResult result){
	 if(result.getStatus()==1) {
		 System.out.println("Test Case Passed");
	 }else if(result.getStatus()== 2) {
		 try {
			TestUtil.takeScreenshotAtEndOfTest("Mybox Starter Picking Page");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
		driver.quit();
	}



}
