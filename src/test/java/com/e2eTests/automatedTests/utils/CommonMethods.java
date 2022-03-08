package com.e2eTests.automatedTests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods {
		
	public CommonMethods() {
		driver = Setup.driver;
	}
	
	public static WebDriver driver;
	public static Properties prop;
			
	public void readFileConfig() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
	}
	
//	public void readFileConfigi(String url) throws IOException {
//		prop = new Properties();
//		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
//		prop.load(fis);
//		driver.get(prop.getProperty(url));
//	}
	
	public void refresNavigator() {
		driver.navigate().refresh();
	}
	
	
//	public void moveToElement(WebElement welcomeMessage) {	
//	  	Actions actions = new Actions(driver);
//	  	WebElement mouseHover = (welcomeMessage);	
//	  	actions.moveToElement(mouseHover).perform();
//	}
	

}
