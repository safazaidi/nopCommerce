package com.nopcommerce.e2eTests.step_definitions;

import com.nopcommerce.e2eTests.page_objects.CatalogProductPageObjects;
import com.nopcommerce.e2eTests.utils.ConfigFileReader;
import com.nopcommerce.e2eTests.utils.SeleniumUtils;
import com.nopcommerce.e2eTests.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogProductStepDefinitions {
	
	public SeleniumUtils seleniumUtils;
	public CatalogProductPageObjects catalogProductPageObjects;
	public ConfigFileReader configFileReader;
	public Validations validations;
	
	public CatalogProductStepDefinitions() {
		seleniumUtils = new SeleniumUtils();
		catalogProductPageObjects = new CatalogProductPageObjects();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
		
		
	}

	@When("Je clique sur le bouton catalog")
	public void jeCliqueSurLeBoutonCatalog() {
		seleniumUtils.click(CatalogProductPageObjects.getBtncatalog());
	    
	}
	@When("Je clique sur le bouton product dans le menu catalog")
	public void jeCliqueSurLeBoutonProductDansLeMenuCatalog() {
		seleniumUtils.click(CatalogProductPageObjects.getBtnproduct());
	    
	}
	
	@When("Je saisie le product name")
	public void jeSaisieLeProductName() {
		seleniumUtils.writeText(CatalogProductPageObjects.getNameProduct(), "pc" );
		
	}
	
//	@When("Je choisis à partir de la liste category electronic")
//	public void jeChoisisÀPartirDeLaListeCategoryElectronic() {
//		seleniumUtils.writeText(CatalogProductPageObjects.getNameCategory(), "electronics" );
//		
//	}
//	
//	
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
//		seleniumUtils.writeText(CatalogProductPageObjects.getVendor(), "Vendor 1" );
//		
//	}
//	
//	@When("Je selectionne ALL dans le menu warehouse")
//	public void jeSelectionneALLDansLeMenuWarehouse() {
//		seleniumUtils.writeText(CatalogProductPageObjects.getWarehouse(), "All" );
//		
//	}
//	
//	@When("Je selectionne ALL dans le menu Product Type")
//	public void jeSelectionneALLDansLeMenuProductType() {
//		seleniumUtils.writeText(CatalogProductPageObjects.getProductType(), "All" );		
//	}
//	
//	@When("Je selectionne ALL dans le menu Published")
//	public void jeSelectionneALLDansLeMenuPublished() {
//		seleniumUtils.writeText(CatalogProductPageObjects.getPublished(), "All" );
//		
//	}
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
//	
//	@Then("Je redirige vers nouvelle page {string}")
//	public void jeRedirigeVersNouvellePage(String string) {
//		validations.assertEquals(CatalogProductPageObjects.getMssg(), "Edit product details - HP Spectre XT Pro UltraBook  back to product list");
//		
//	}




}
