package com.nopcommerce.e2eTests.step_definitions;

import com.nopcommerce.e2eTests.page_objects.LoginNopPageObjects;
import com.nopcommerce.e2eTests.utils.ConfigFileReader;
import com.nopcommerce.e2eTests.utils.SeleniumUtils;
import com.nopcommerce.e2eTests.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginNopStepDefinitions {
	
	public SeleniumUtils seleniumUtils;
	public LoginNopPageObjects  loginNopPageObjects;
	public ConfigFileReader configFileReader;
	public Validations validations;
	
	public LoginNopStepDefinitions() {
		seleniumUtils = new SeleniumUtils();
		loginNopPageObjects = new LoginNopPageObjects();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}
	

	@Given("Je navigue sur le site nopcommerce")
	public void jeNavigueSurLeSiteNopcommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	    
	}
	@When("Je saisis l'adresse mail")
	public void jeSaisisLAdresseMail() {
		seleniumUtils.writeText(LoginNopPageObjects.getPassword(), configFileReader.getProperties("home.Email"));
	}
	@When("Je saisis le mot de passe")
	public void jeSaisisLeMotDePasse() {
		seleniumUtils.writeText(LoginNopPageObjects.getPassword(), configFileReader.getProperties("home.password"));
		
	}
	@When("Je clique sur le bouton login in")
	public void jeCliqueSurLeBoutonLoginIn() {
		seleniumUtils.click(LoginNopPageObjects.getBtnLogin());
	    
	}
	@Then("Je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String string) {
		validations.assertEquals(LoginNopPageObjects.getDashboard(), "Dashboard");
	    
	}




}
