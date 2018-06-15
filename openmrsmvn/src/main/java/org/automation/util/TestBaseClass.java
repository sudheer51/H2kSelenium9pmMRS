package org.automation.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBaseClass {
//modified by Tester_01	
	protected WebDriver driver;
	//protected variables are access via subclass..
	@Parameters({"browserType"})
	@BeforeTest
	public void invokeBrowser(String browserType)
	{
		switch(browserType)
		{
		case "FF":
			System.setProperty("webdriver.gecko.driver","geckodriver.exe"); 
			driver = new FirefoxDriver();
			break;
		case "CH":
			System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
			driver = new ChromeDriver();
			break;
		case "IE":
			//zoom should be 100%
			//Enable protected mode should be selected for all the four zones..
			System.setProperty("webdriver.ie.driver","IEDriverServer.exe"); 
			driver = new InternetExplorerDriver();
			break;
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public  void openBrowser(String url)
	{
		
		driver.get(url);
		 
	}

}
