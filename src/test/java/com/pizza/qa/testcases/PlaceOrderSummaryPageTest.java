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
import com.pizza.qa.pages.LoginPage;
import com.pizza.qa.pages.MyBoxSelectedPizzaPage;
import com.pizza.qa.pages.MyboxStarterpickingPage;
import com.pizza.qa.pages.PizzaTabPage;
import com.pizza.qa.pages.PlaceOrderSummaryPage;
import com.pizza.qa.pages.SelectpizzaPage;
import com.pizza.qa.pages.StartersTabPage;
import com.pizza.qa.pages.StartmyorderPage;
import com.pizza.qa.pages.TakeAwayPage;
import com.pizza.qa.pages.Thanks_you_for_PlacingPage;
import com.pizza.qa.pages.YourcartPage;
import com.pizza.qa.pages.YourcartsummaryDetailsPage;
import com.pizza.qa.testbase.TestBase;
import com.pizza.qa.util.TestUtil;

public class PlaceOrderSummaryPageTest extends TestBase {

	StartmyorderPage startmyorderPage;
	YourcartPage yourcartPage;
	// TestUtil testUtil;
	SelectpizzaPage selectpizzaPage;
	MyBoxSelectedPizzaPage myBoxSelectedPizzaPage;
	MyboxStarterpickingPage myboxStarterpickingPage;
	YourcartsummaryDetailsPage yourcartsummaryDetailsPage;
	PlaceOrderSummaryPage placeOrderSummaryPage;
	Thanks_you_for_PlacingPage thanks_you_for_PlacingPage;
	AvailablePanPizzaDetailsPage availablePanPizzaDetailsPage;
	AddtoDealPizzainSelectedpizzaDetailsPage addtoDealPizzainSelectedpizzaDetailsPage;

	CheckoutLoginPage checkoutLoginPage;
	TakeAwayPage takeAwayPage;
	PizzaTabPage pizzaTabPage;
	CustomizePizzaPage customizePizzaPage;
	StartersTabPage startersTabPage;
	Drinks_Tab_Page drinks_Tab_Page;
	LoginPage loginPage;

	public PlaceOrderSummaryPageTest() {
		super();
	}

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws InterruptedException {
		initialization();
		// thanks_you_for_PlacingPage =
		// placeOrderSummaryPage.clickOnPlaceOrderbuttonClick(fullname,CharSequence[]
		// MobileNo ,String Email,String Address,String Building);

	}

	@Test(groups = "OrderFlowGuestUser")
	public void verifyOrderflow_with_GuestUserTest() {
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
		myBoxSelectedPizzaPage = myboxStarterpickingPage.clickOnMyboxStarterpickingPageAddtoDeal_2Btn();
		yourcartsummaryDetailsPage = new YourcartsummaryDetailsPage();
		yourcartsummaryDetailsPage = myBoxSelectedPizzaPage.clickOnMyBoxSelectStartersAddToCartBtn();
		placeOrderSummaryPage = new PlaceOrderSummaryPage();
		checkoutLoginPage = yourcartsummaryDetailsPage.clickOncheckoutOMRBtn();
		placeOrderSummaryPage = checkoutLoginPage.clickOnContinue_as_GustuserLink();
		placeOrderSummaryPage.PlaceOrderSummaryPage_validatingOrder_Amount();
		thanks_you_for_PlacingPage = placeOrderSummaryPage.clickOnPlaceOrderbutton_Deals_GuestUserClick();
	}

	// with out data sheet
	@Test(groups = "TakeAwaywithGuestUser")
	public void verifyPlaceOrderSummaryPage_TakeAwayGuestUserTest() {
		selectpizzaPage = new SelectpizzaPage();
		startmyorderPage = new StartmyorderPage();
		addtoDealPizzainSelectedpizzaDetailsPage = new AddtoDealPizzainSelectedpizzaDetailsPage();
		takeAwayPage = new TakeAwayPage();
		pizzaTabPage = new PizzaTabPage();
		customizePizzaPage = new CustomizePizzaPage();
		yourcartsummaryDetailsPage = new YourcartsummaryDetailsPage();
		drinks_Tab_Page = new Drinks_Tab_Page();
		checkoutLoginPage = new CheckoutLoginPage();
		takeAwayPage = startmyorderPage.ClickOnTakeAway_button();
		yourcartPage = takeAwayPage.TakeAwayPage_Select_store();
		pizzaTabPage = yourcartPage.ClickOnPizzaTab();
		customizePizzaPage = pizzaTabPage.ClickOnDYNAMITESHRIMPPizzaSelected();
		customizePizzaPage.ClickOnCustomizePanPizzaimg();
		customizePizzaPage.ClickOnIncludedToppingsPanPizza();
		yourcartsummaryDetailsPage = customizePizzaPage.ClickOnAddtoCartBtnPanPizza();
		startersTabPage = yourcartsummaryDetailsPage.clickOnStartersTab();
		yourcartsummaryDetailsPage = startersTabPage.ClickOnStarters_Selected();
		drinks_Tab_Page = yourcartsummaryDetailsPage.clickOnDrinksTab();
		yourcartsummaryDetailsPage = drinks_Tab_Page.ClickOnDrinksSelected();
		checkoutLoginPage = yourcartsummaryDetailsPage.clickOncheckoutOMRBtn();
		placeOrderSummaryPage = new PlaceOrderSummaryPage();
		placeOrderSummaryPage = checkoutLoginPage.clickOnContinue_as_GustuserLink();
		thanks_you_for_PlacingPage = new Thanks_you_for_PlacingPage();
		placeOrderSummaryPage.PlaceOrderSummaryPage_validatingOrder_Amount();
		thanks_you_for_PlacingPage = placeOrderSummaryPage.clickOnPlaceOrderbutton_GuestUserClick();

	}

	// with out data sheet
	@Test(groups = "TakeAwaywithLoginUser")
	public void verifyPlaceOrderSummaryPage_TakeAwayLoginUserTest() {
		selectpizzaPage = new SelectpizzaPage();
		startmyorderPage = new StartmyorderPage();
		addtoDealPizzainSelectedpizzaDetailsPage = new AddtoDealPizzainSelectedpizzaDetailsPage();
		takeAwayPage = new TakeAwayPage();
		pizzaTabPage = new PizzaTabPage();
		customizePizzaPage = new CustomizePizzaPage();
		yourcartsummaryDetailsPage = new YourcartsummaryDetailsPage();
		drinks_Tab_Page = new Drinks_Tab_Page();
		checkoutLoginPage = new CheckoutLoginPage();
		takeAwayPage = startmyorderPage.ClickOnTakeAway_button();
		yourcartPage = takeAwayPage.TakeAwayPage_Select_store();
		pizzaTabPage = yourcartPage.ClickOnPizzaTab();
		customizePizzaPage = pizzaTabPage.ClickOnDYNAMITESHRIMPPizzaSelected();
		customizePizzaPage.ClickOnCustomizePanPizzaimg();
		customizePizzaPage.ClickOnIncludedToppingsPanPizza();
		yourcartsummaryDetailsPage = customizePizzaPage.ClickOnAddtoCartBtnPanPizza();
		startersTabPage = yourcartsummaryDetailsPage.clickOnStartersTab();
		yourcartsummaryDetailsPage = startersTabPage.ClickOnStarters_Selected();
		drinks_Tab_Page = yourcartsummaryDetailsPage.clickOnDrinksTab();
		yourcartsummaryDetailsPage = drinks_Tab_Page.ClickOnDrinksSelected();
		yourcartsummaryDetailsPage.clickOnDeleting_DrinkBtn(); 
		checkoutLoginPage = yourcartsummaryDetailsPage.clickOncheckoutOMRBtn();
		// placeOrderSummaryPage = new PlaceOrderSummaryPage();
		// placeOrderSummaryPage = checkoutLoginPage.clickOnCreateAccountUserLink();
		loginPage = new LoginPage();
		placeOrderSummaryPage = loginPage.LoginPageDetails();
		thanks_you_for_PlacingPage = new Thanks_you_for_PlacingPage();
		placeOrderSummaryPage.PlaceOrderSummaryPage_validatingOrder_Amount();
		thanks_you_for_PlacingPage = placeOrderSummaryPage.clickOnPlaceOrderbutton_LoginUserClick();

	}

	/*
	 * @Test(priority=1)
	 * 
	 * @DataProvider(name = "testdata") public Object[][] readExcel() throws
	 * InvalidFormatException, IOException{ Object data [][] =
	 * Xls_Reader.readExcel("filePath", "sheetName"); return data;
	 * //testUtil.switchToFrame();
	 * //System.out.println("Near to Your Cart summary details screen");
	 * 
	 * }
	 * 
	 * 
	 * @Test(dataProvider = "readExcel") public void
	 * verifyPlaceOrderSummaryPage_PlaceorderBtnTest(String fullname,CharSequence[]
	 * MobileNo ,String Email,String Address,String Building){
	 * //testUtil.switchToFrame();
	 * //System.out.println("Near to Your Cart summary details screen");
	 * thanks_you_for_PlacingPage =
	 * placeOrderSummaryPage.clickOnPlaceOrderbuttonClick(fullname, MobileNo, Email,
	 * Address, Address); }
	 */

	// with out data sheet
	@Test(groups = "MultiplePizzaGuestUser")
	public void verifyPlaceOrderSummaryPage_MultiplePizzaGuestUserTest() {
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
		myBoxSelectedPizzaPage = myboxStarterpickingPage.clickOnMyboxStarterpickingPageAddtoDeal_2Btn();
		yourcartsummaryDetailsPage = new YourcartsummaryDetailsPage();
		yourcartsummaryDetailsPage = myBoxSelectedPizzaPage.clickOnMyBoxSelectStartersAddToCartBtn();
		placeOrderSummaryPage = new PlaceOrderSummaryPage();
		// addtoDealPizzainSelectedpizzaDetailsPage =
		// availablePanPizzaDetailsPage.clickOnAvailablePanpizzaAddtoDealBtn();
		checkoutLoginPage = yourcartsummaryDetailsPage.clickOncheckoutOMRBtn();
		placeOrderSummaryPage = checkoutLoginPage.clickOnContinue_as_GustuserLink();
		placeOrderSummaryPage.PlaceOrderSummaryPage_validatingOrder_Amount();
		thanks_you_for_PlacingPage = placeOrderSummaryPage.clickOnPlaceOrderbutton_Deals_GuestUserClick();

		
	}
	
	
	// with out data sheet
		@Test(groups = "MultiplePizzaLoginUser")
		public void verifyPlaceOrderSummaryPage_MultiplePizzaLoginUserTest() {
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
			myBoxSelectedPizzaPage = myboxStarterpickingPage.clickOnMyboxStarterpickingPageAddtoDeal_2Btn();
			yourcartsummaryDetailsPage = new YourcartsummaryDetailsPage();
			yourcartsummaryDetailsPage = myBoxSelectedPizzaPage.clickOnMyBoxSelectStartersAddToCartBtn();
			placeOrderSummaryPage = new PlaceOrderSummaryPage();
			// addtoDealPizzainSelectedpizzaDetailsPage =
			// availablePanPizzaDetailsPage.clickOnAvailablePanpizzaAddtoDealBtn();
			checkoutLoginPage = yourcartsummaryDetailsPage.clickOncheckoutOMRBtn();
			loginPage = new LoginPage();
			placeOrderSummaryPage = loginPage.LoginPageDetails();
			thanks_you_for_PlacingPage = new Thanks_you_for_PlacingPage();
			placeOrderSummaryPage.PlaceOrderSummaryPage_validatingOrder_Amount();
			thanks_you_for_PlacingPage = placeOrderSummaryPage.clickOnPlaceOrderbutton_Deals_LoginUserClick();
			
		}


	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == 1) {
			System.out.println("Test Case Passed");
		} else if (result.getStatus() == 2) {
			try {
				TestUtil.takeScreenshotAtEndOfTest("PlaceOrderSummaryPage");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.quit();
	}

}
