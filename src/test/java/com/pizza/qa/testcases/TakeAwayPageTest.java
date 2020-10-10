package com.pizza.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.TakeAwayPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class TakeAwayPageTest extends TestBase {
	
	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	TakeAwayPage takeAwayPage;
	
	public TakeAwayPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		startmyorderPage = new StartmyorderPage();
		takeAwayPage = startmyorderPage.ClickOnTakeAway_button();
	
	}
		
	
	@Test(groups ={"TakeAway"})
	public void ClickOnTakeAwayPage_Select_storeTest() {
		yourcartPage = takeAwayPage.TakeAwayPage_Select_store();
		
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result){
		 if(result.getStatus()==1) {
			 System.out.println("Test Case Passed");
		 }else if(result.getStatus()== 2) {
			 try {
				TestUtil.takeScreenshotAtEndOfTest("TakeAwayPage_Select_store");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			//driver.quit();
		}
	


}
