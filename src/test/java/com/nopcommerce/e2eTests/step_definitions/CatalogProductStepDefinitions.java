package com.nopcommerce.e2eTests.step_definitions;

import com.nopcommerce.e2eTests.page_objects.CatalogProductPageObjects;
import com.nopcommerce.e2eTests.utils.ConfigFileReader;
import com.nopcommerce.e2eTests.utils.SeleniumUtils;
import com.nopcommerce.e2eTests.utils.Setup;
import com.nopcommerce.e2eTests.utils.Validations;
import com.nopcommerce.e2eTests.utils.Wait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogProductStepDefinitions {
	
	public SeleniumUtils seleniumUtils;
	public CatalogProductPageObjects catalogProductPageObjects;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public Wait wait;
	
	public CatalogProductStepDefinitions() {
		seleniumUtils = new SeleniumUtils();
		catalogProductPageObjects = new CatalogProductPageObjects();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
		wait = new Wait(Setup.getDriver());
		
		
	}

	@When("Je clique sur le bouton catalog")
	public void jeCliqueSurLeBoutonCatalog() throws InterruptedException {
		seleniumUtils.click(CatalogProductPageObjects.getBtncatalog());
	    
	}
	@When("Je clique sur le bouton product dans le menu catalog")
	public void jeCliqueSurLeBoutonProductDansLeMenuCatalog() throws InterruptedException {
		
		seleniumUtils.click(CatalogProductPageObjects.getBtnproduct());
	    
	}
	
	@When("Je saisie le product name")
	public void jeSaisieLeProductName() {
		seleniumUtils.writeText(CatalogProductPageObjects.getNameProduct(), "pc" );
		
	}
	
	@When("Je choisis à partir de la liste category electronic")
	public void jeChoisisÀPartirDeLaListeCategoryElectronic() throws InterruptedException {
		seleniumUtils.autoSuggest(CatalogProductPageObjects.getNameCategory(), "Elec", "Electronics");
		
		//seleniumUtils.writeText(CatalogProductPageObjects.getNameCategory(), "electronics" );
		
	}
	
	
//	@When("Je clique sur le bouton search subcategory")
//	public void jeCliqueSurLeBoutonSearchSubcategory() {
//		seleniumUtils.click(CatalogProductPageObjects.getBtnSurtchSubcategory());   
//	}
//	
//	@When("Je selectionne HP dans le menu manufactorer")
//	public void jeSelectionneHPDansLeMenuManufactorer() {
//		seleniumUtils.writeText(CatalogProductPageObjects.getManufacter(), "HP" );
//		
//	}
//	
//	@When("Je selectionne vendor1 dans le menu vendor")
//	public void jeSelectionneVendor1DansLeMenuVendor() {
//	seleniumUtils.writeText(CatalogProductPageObjects.getVendor(), "Vendor 1" );
//		
//	}
//	
//	@When("Je selectionne ALL dans le menu warehouse")
//	public void jeSelectionneALLDansLeMenuWarehouse() {
//		seleniumUtils.writeText(CatalogProductPageObjects.getWarehouse(), "Warehouse 1 (New York" );
//		
//	}
//	
//	@When("Je selectionne ALL dans le menu Product Type")
//	public void jeSelectionneALLDansLeMenuProductType() {
//		seleniumUtils.writeText(CatalogProductPageObjects.getProductType(), "Simple" );		
//	}
//	
//	@When("Je selectionne ALL dans le menu Published")
//	public void jeSelectionneALLDansLeMenuPublished() {
//		seleniumUtils.writeText(CatalogProductPageObjects.getPublished(), "Published only" );
//		
//	}
//	
//	@When("Je saisie HP_SPX_UB dans Go directly to product SKU")
//	public void jeSaisieHPSPXUBDansGoDirectlyToProductSKU() {
//		seleniumUtils.writeText(CatalogProductPageObjects.getProductSKU(), "HP_SPX_UB" );
//		
//	}
//	@When("Je clique sur le bouton go")
//	public void jeCliqueSurLeBoutonGo() {
//		seleniumUtils.click(CatalogProductPageObjects.getBtngo());
//		
//	}
	
//	@Then("Je redirige vers nouvelle page {string}")
//	public void jeRedirigeVersNouvellePage(String string) {
//		validations.assertEquals(CatalogProductPageObjects.getMssg(), "Edit product details - HP Spectre XT Pro UltraBook  back to product list");
//		
//	}

	//Add new Product
	
	
	

	@When("Je clique sur le bouton add new product")
	public void jeCliqueSurLeBoutonAddNewProduct() {
		seleniumUtils.click(CatalogProductPageObjects.getBtnAddNew());    
	}
	
	@When("Je clique sur le bouton product info")
	public void jeCliqueSurLeBoutonProductInfo() {
		
		seleniumUtils.click(CatalogProductPageObjects.getBtnInfo());
	}
	
	@When("Je redirige vers une nouvelle page")
	public void jeRedirigeVersUneNouvellePage() {
		seleniumUtils.writeText(CatalogProductPageObjects.getProductName(), "pcPortable");
	    
	}
	
	
	
	@When("Je saisie une short description")
	public void jeSaisieUneShortDescription() {
		seleniumUtils.writeText(CatalogProductPageObjects.getShortdescription(), "pc portable de nouveau generation");
	    
	}
	
	@When("Je saisie full description")
	public void jeSaisieFullDescription() {
		seleniumUtils.writeText(CatalogProductPageObjects.getFulldescription(), "pc portable de nouveau generation de la marque HP");
	    
	}
	
	@When("Je saisie le SKU")
	public void jeSaisieLeSKU() {
		seleniumUtils.writeText(CatalogProductPageObjects.getSku(), "HP_SPX_UB");
	    
	}
	
	@When("Je selectionne Electronics dans le menu Categories")
	public void jeSelectionneElectronicsDansLeMenuCategories() {
		seleniumUtils.writeText(CatalogProductPageObjects.getCategories(), "Electronics");
	    
	}
	
	@When("Je selectionne HP dans le menu Manufactures")
	public void jeSelectionneHPDansLeMenuManufactures() {
		seleniumUtils.writeText(CatalogProductPageObjects.getManufacter(), "HP");
	    
	}
	
	@When("Je clique sur le bouton Published")
	public void jeCliqueSurLeBoutonPublished() {


	}
//	
//	@When("Je saisie Product tags")
//	public void jeSaisieProductTags() {
//
//
//	}
//	
//	@When("Je saisie le GTIN")
//	public void jeSaisieLeGTIN() {
//	    
//	}
//	
//	@When("Je saisie manufacturer part number")
//	public void jeSaisieManufacturerPartNumber() {
//	    
//	}
//	
//	@When("Je clique sur le bouton show on home page")
//	public void jeCliqueSurLeBoutonShowOnHomePage() {
//	    
//	}
//	
//	@When("Je selectionne simple dans le menu product template")
//	public void jeSelectionneSimpleDansLeMenuProductTemplate() {
//	    
//	}






}
