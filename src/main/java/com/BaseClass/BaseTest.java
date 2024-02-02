package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	// 1 Launch Browser
		protected static WebDriver launchBrowser(String browsername) {	
		if (browsername.equalsIgnoreCase("chrome")) {
					
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
					
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}	
		else if (browsername.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}	
		driver.manage().window().maximize();
		return driver;
		}
		// 2 get
		protected static WebDriver launchUrl(String url) {
			driver.get(url);
			return driver;
		
		}
		// 3 sendkeys
		protected static void input(WebElement element, String value) {
			element.sendKeys(value);	
		}
		//move to element
		protected static void moveToElement(WebElement element) {
			Actions actions = new Actions (driver);
			actions.moveToElement(element).perform();
			
		}
		
		//click 
		protected static void clickButton(WebElement element) {
			element.click();
		}

		// 3 close
		protected static void closeBrowser() {
			driver.close();
		}


}
