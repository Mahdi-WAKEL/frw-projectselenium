package com.e2eTests.automatedTests.buzz.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuzzPage {

	/*Locators*/
	final static String BUZZ_MENU_ID = "menu_buzz_viewBuzz";
	final static String FIELD_WIYM_ID = "createPost_content";
	final static String POST_BUTTON_ID = "postSubmitBtn";
	final static String POST_CONTENT_CLASS_NAME = "postContent";

	/*@FindBy*/
	@FindBy(how = How.ID, using = BUZZ_MENU_ID)
	public static WebElement buzzMenu;
	@FindBy(how = How.ID, using = FIELD_WIYM_ID)
	public static WebElement fieldWiym;
	@FindBy(how = How.ID, using = POST_BUTTON_ID)
	public static WebElement postButton;
	@FindBy(how =How.CLASS_NAME, using = POST_CONTENT_CLASS_NAME)
	public static List<WebElement> listOfcommentsPost;

	/*Methods*/
	public void clickBuzzMenu() {		
		buzzMenu.click();
	}

	public void fillFieldWiym(String message) {
		fieldWiym.sendKeys(message);		
	}

	public void clickPostButton() {
		postButton.click();		
	}

	public String getListOfCommentsPost(String comment) {
		String finalComment = null;
		for (WebElement msg : listOfcommentsPost) {
			if (msg.getText().equalsIgnoreCase(comment)) {
				finalComment = msg.getText();
				break;
			}
		}
		return finalComment;

	}
}
