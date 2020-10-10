package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.AddtoDealPizzainSelectedpizzaDetailsPage;
import com.pizza.qa.pages.AvailablePanPizzaDetailsPage;
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class AvailablePanPizzaDetailsPageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	//TestUtil testUtil;
	SelectpizzaPage selectpizzaPage;
	AvailablePanPizzaDetailsPage availablePanPizzaDetailsPage;
	AddtoDealPizzainSelectedpizzaDetailsPage addtoDealPizzainSelectedpizzaDetailsPage;
	

	public AvailablePanPizzaDetailsPageTest() {
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
		yourcartPage = startmyorderPage.Startmyorder();
		selectpizzaPage = yourcartPage.clickOnPriceonSelectionBtn();
		//availablePanPizzaDetailsPage = selectpizzaPage.clickOnSelectPizzaBtn();
		 
	}
	
	
	@Test(priority=1)
	public void verifyAvailablePanPizzaDetailsPageTitleTest(){
		String AvailablePanPizzaDetailsPageTitle = availablePanPizzaDetailsPage.verifyAvailablePanPizzaDetailsPageTitle();
		Assert.assertEquals(AvailablePanPizzaDetailsPageTitle, "Pizza Hut Oman | Pizza Delivery Near you | Order Pizza Online","Yourcart page title not matched");
	}
	
	/*
	 * @Test(priority=2) public void verifyUserSelectionTest(){
	 * //testUtil.switchToFrame(); boolean flag =((YourcartPage)
	 * yourcartPage).verifyCorrectUserSelection1(); Assert.assertTrue(flag); }
	 */
	
	
	  @Test(priority=3) 
	  public void verifyAvailablePanpizzaAddtoDealBtnTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Add to Deal button");
		 try {
				TestUtil.takeScreenshotAtEndOfTest("availablePanPizzaDetailsPage");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  addtoDealPizzainSelectedpizzaDetailsPage = availablePanPizzaDetailsPage.clickOnAvailablePanpizzaAddtoDealBtn(); 
	  }
	 
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	



}
