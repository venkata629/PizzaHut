package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.TakeAwayPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class StartmyorderPageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	TakeAwayPage takeAwayPage;
	
	public StartmyorderPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		startmyorderPage = new StartmyorderPage();
		
	
	}
	
	
	  @Test(priority=1) 
	  public void startmyorderPageTitleTest() throws IOException{ 
	   String title = startmyorderPage.validateStartmyorderPageTitle(); 
	   Assert.assertEquals(title,"Pizza Hut Oman | Pizza Delivery Near you | Order Pizza Online"); 
	   	   
	   }
	 
	 @Test(priority=2) 
	  public void pizzaLogoImageTest() { 
		 boolean flag = startmyorderPage.validatePizzaImage();
		 Assert.assertTrue(flag); 
		 }
	 
	
	@Test(priority=3)
	public void StartmyorderTest() {
		yourcartPage = startmyorderPage.Startmyorder();
		
	}
	
	@Test(priority=4)
	public void ClickOnTakeAway_buttonTest() {
		takeAwayPage = startmyorderPage.ClickOnTakeAway_button();
		
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result){
		 if(result.getStatus()==1) {
			 System.out.println("Test Case Passed");
		 }else if(result.getStatus()== 2) {
			 try {
				TestUtil.takeScreenshotAtEndOfTest("StartMyOrderPage");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			//driver.quit();
		}
	

}
