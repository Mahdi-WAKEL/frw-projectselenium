package com.e2eTests.automatedTests.authentication.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automatedTests.authentication.pageObjects.AuthenticationPage;
import com.e2eTests.automatedTests.utils.CommonMethods;
import com.e2eTests.automatedTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDefinition {
	
	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private CommonMethods commonMethods = new CommonMethods();	
	
	public AuthenticationStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}
	
	@Given("^Je me connecte sur l'application OrangeHRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		commonMethods.readFileConfig();	
	}
	
//	@Given("^Je me connecte sur l'application Chanel$")
//	public void jeMeConnecteSurChanel() throws Throwable {
//		commonMethods.readFileConfig("chanel");
//	}

	@When("^Je saisis le username \"([^\"]*)\"$")
	public void jeSaisisLeUsername(String name) throws Throwable {
		authenticationPage.fillUserName(name);		
	}

	@When("^Je saisis le password \"([^\"]*)\"$")
	public void jeSaisisLePassword(String pswd) throws Throwable {
		authenticationPage.fillPassword(pswd);		
	}

	@When("^Je clique sur le boutton LOGIN$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
		authenticationPage.clickLoginButton();	
	}

	@Then("^Je me redirige vers la page home \"([^\"]*)\"$")
	public void jeMeRedirigeVersLaPageHome(String msg) throws Throwable {
		String message = AuthenticationPage.welcomeMessage.getText();
		Assert.assertTrue(message.contains(msg));	
	}

}
