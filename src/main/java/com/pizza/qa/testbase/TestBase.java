package com.pizza.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	public static String actualamount;
	//public  static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;
	static Logger log = Logger.getLogger(TestBase.class);

	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/com/pizza"
					+ "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
			log.info("Invoking the PIzza URL");
		}
		else if(browserName.equals("FF")){
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}
		
		
		//e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		//eventListener = new WebEventListener();
		//e_driver.register(eventListener);
		//driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
