package com.e2eTests.automatedTests.authentication.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automatedTests.utils.CommonMethods;

public class AuthenticationPage {
	
//	CommonMethods commonMethods = new CommonMethods();	
	
	/*Locators*/
	final static String USERNAME_ID = "txtUsername";
	final static String PASSWORD_ID = "txtPassword";
	final static String BUTTON_LOGIN_ID = "btnLogin";
	final static String WELCOM_MESSAGE = "welcome";
		
	/*@FindBy*/
	@FindBy(how = How.ID, using = USERNAME_ID)
	public static WebElement username;		
	@FindBy(how = How.ID, using = PASSWORD_ID)
	public static WebElement password;	
	@FindBy(how = How.ID, using = BUTTON_LOGIN_ID)
	public static WebElement buttonLogin; 	
	@FindBy(how = How.ID, using = WELCOM_MESSAGE)
	public static WebElement welcomeMessage;
	
	/*Methods*/
	public void fillUserName(String name) {
		username.sendKeys(name);	
	}
	public void fillPassword(String pswd) {
		password.sendKeys(pswd);		
	}
	public void clickLoginButton() {
		buttonLogin.click();		
	}
	
//	public void movement() {
//		commonMethods.moveToElement(welcomeMessage);
//	}

}
