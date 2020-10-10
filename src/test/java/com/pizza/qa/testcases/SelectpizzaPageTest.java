package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.AvailablePanPizzaDetailsPage;
import com.pizza.qa.pages.MyBoxSelectedPizzaPage;
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class SelectpizzaPageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	//TestUtil testUtil;
	SelectpizzaPage selectpizzaPage;
	AvailablePanPizzaDetailsPage availablePanPizzaDetailsPage;
	MyBoxSelectedPizzaPage myBoxSelectedPizzaPage;
	

	public SelectpizzaPageTest() {
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
		startmyorderPage = new StartmyorderPage();
		yourcartPage = startmyorderPage.Startmyorder();
		selectpizzaPage = yourcartPage.clickOnPriceonSelectionBtn();
		selectpizzaPage = new SelectpizzaPage();
		myBoxSelectedPizzaPage = new MyBoxSelectedPizzaPage();
		availablePanPizzaDetailsPage = new AvailablePanPizzaDetailsPage();
	}
	
	
	@Test(priority=1)
	public void verifySelectPizzaPageTitleTest(){
		String selectPizzaPageTitle = selectpizzaPage.verifySelectpizzaPageTitle();
		Assert.assertEquals(selectPizzaPageTitle, "Pizza Hut Oman | Pizza Delivery Near you | Order Pizza Online","Yourcart page title not matched");
	}
	
	
	
	  @Test(priority=2) 
	  public void verifySelectPizzaBtnTest(){
	  //testUtil.switchToFrame(); 
		  System.out.println("Near to SelectPizzabutton");
		  try {
				TestUtil.takeScreenshotAtEndOfTest("selectpizzaPage");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  myBoxSelectedPizzaPage = selectpizzaPage.clickOnSelectPizzaBtn(); 
	  }
	 
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result){
		 if(result.getStatus()==1) {
			 System.out.println("Test Case Passed");
		 }else if(result.getStatus()== 2) {
			 try {
				TestUtil.takeScreenshotAtEndOfTest("Select Pizza Page");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			driver.quit();
		}
	


}
