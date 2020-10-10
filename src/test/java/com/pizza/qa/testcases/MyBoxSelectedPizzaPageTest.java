package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.ITestResult;

import com.pizza.qa.pages.AddtoDealPizzainSelectedpizzaDetailsPage;
import com.pizza.qa.pages.AvailablePanPizzaDetailsPage;
import com.pizza.qa.pages.MyBoxSelectedPizzaPage;
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;


public class MyBoxSelectedPizzaPageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	//TestUtil testUtil;
	SelectpizzaPage selectpizzaPage;
	MyBoxSelectedPizzaPage myBoxSelectedPizzaPage;
	AvailablePanPizzaDetailsPage availablePanPizzaDetailsPage;
	AddtoDealPizzainSelectedpizzaDetailsPage addtoDealPizzainSelectedpizzaDetailsPage;
	

	public MyBoxSelectedPizzaPageTest() {
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
		myBoxSelectedPizzaPage = new MyBoxSelectedPizzaPage();
		myBoxSelectedPizzaPage = selectpizzaPage.clickOnSelectPizzaBtn();
		selectpizzaPage = myBoxSelectedPizzaPage.clickOnMyBoxpizzaAddtoDealBtn(); 
		myBoxSelectedPizzaPage = selectpizzaPage.clickOnMyBoxSelectStartersBtn_1();
		//myBoxSelectedPizzaPage = selectpizzaPage.clickOnMyBoxSelectStartersBtn_2();
		//availablePanPizzaDetailsPage = new AvailablePanPizzaDetailsPage();
		
		 
	}
	
	
	@Test(priority=1)
	public void verifyMyBoxSelectedPizzaPageTitleTest(){
		String MyBoxSelectedPizzaPageTitle = myBoxSelectedPizzaPage.verifyMyBoxSelectedPizzaPageTitle();
		Assert.assertEquals(MyBoxSelectedPizzaPageTitle, "Pizza Hut Oman | Pizza Delivery Near you | Order Pizza Online","Yourcart page title not matched");
	}
	
	/*
	 * @Test(priority=2) public void verifyUserSelectionTest(){
	 * //testUtil.switchToFrame(); boolean flag =((YourcartPage)
	 * yourcartPage).verifyCorrectUserSelection1(); Assert.assertTrue(flag); }
	 */
	
	
	  @Test(priority=3) 
	  public void verifyMyBoxSelectedPizzaPageAddtoDealBtnTest(){
	  //testUtil.switchToFrame(); 
		  //System.out.println("Near to Add to Deal button");
		 selectpizzaPage = myBoxSelectedPizzaPage.clickOnMyBoxpizzaAddtoDealBtn(); 
	  }
	 
	  
	  
		
		  @Test(priority=3) public void  verifyMyBoxSelectedPizzaPageSelectStartersBtnTest(){
		  //testUtil.switchToFrame();
		  //System.out.println("Near to Add to Deal button"); 
			  //WebDriverWait wait = new WebDriverWait(driver, 10);
			  //wait.until(ExpectedConditions.elementToBeClickable(myBoxSelectedPizzaPage.SelectStartersAddBtn_1));
			  myBoxSelectedPizzaPage =  selectpizzaPage.clickOnMyBoxSelectStartersBtn_1(); }
		 
		  @Test(priority=4) 
		  public void  verifyMyBoxSelectedPizzaPageSelectStartersBtn_2Test(){
			  //testUtil.switchToFrame();
			  //System.out.println("Near to Add to Deal button"); 
				  //WebDriverWait wait = new WebDriverWait(driver, 10);
				  //wait.until(ExpectedConditions.elementToBeClickable(myBoxSelectedPizzaPage.SelectStartersAddBtn_1));
				 // selectpizzaPage =  myBoxSelectedPizzaPage.clickOnMyBoxSelectStartersBtn_2();
				  }
	
	@AfterMethod
	public void tearDown(ITestResult result){
	 if(result.getStatus()==1) {
		 System.out.println("Test Case Passed");
	 }else if(result.getStatus()== 2) {
		 try {
			TestUtil.takeScreenshotAtEndOfTest("MyboxPage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
		driver.quit();
	}

}
