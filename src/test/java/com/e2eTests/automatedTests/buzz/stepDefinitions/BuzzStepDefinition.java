package com.e2eTests.automatedTests.buzz.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automatedTests.buzz.pageObjects.BuzzPage;
import com.e2eTests.automatedTests.utils.CommonMethods;
import com.e2eTests.automatedTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuzzStepDefinition {
	
	public WebDriver driver;
	private BuzzPage buzzPage = new BuzzPage ();
	private CommonMethods commonMethods = new CommonMethods();
	
	public BuzzStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, BuzzPage.class);
	}
		
	@Given("^Je suis déjà connecté\\(e\\) sur l'application OrangeHRM$")
	public void jeSuisDéjàConnectéESurLApplicationOrangeHRM() throws Throwable {	    
	}

	@When("^Je clique sur le menu buzz$")
	public void jeCliqueSurLeMenuBuzz() throws Throwable {
		buzzPage.clickBuzzMenu();    
	}

	@When("^Je saisis le message \"([^\"]*)\" sur le champ what in your mind$")
	public void jeSaisisLeMessageSurLeChampWhatInYourMind(String msg) throws Throwable {
	    buzzPage.fillFieldWiym(msg);
	}

	@When("^Je clique sur le boutton Post$")
	public void jeCliqueSurLeBouttonPost() throws Throwable {
		buzzPage.clickPostButton();	    
	}

	@Then("^Je verifie si le message \"([^\"]*)\" est bien parmis la liste des post$")
	public void jeVerifieSiLeMessageEstBienParmisLaListeDesPost(String checkComment) throws Throwable {
		commonMethods.refresNavigator();
		Assert.assertEquals(buzzPage.getListOfCommentsPost(checkComment),checkComment);
	}

}
