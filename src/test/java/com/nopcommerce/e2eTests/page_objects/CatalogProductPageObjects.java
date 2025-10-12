package com.nopcommerce.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.nopcommerce.e2eTests.utils.BasePage;
import com.nopcommerce.e2eTests.utils.Setup;

public class CatalogProductPageObjects extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']" )
	private static WebElement btncatalog;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']" )
	private static WebElement btnproduct;
	
	@FindBy(how = How.XPATH, using = "//input[@id='SearchProductName']" )
	private static WebElement nameProduct;
	
	@FindBy(how = How.XPATH, using = "//select[@id='SearchCategoryId']" )
	private static WebElement nameCategory;
	
	@FindBy(how = How.XPATH, using = "//input[@id='SearchIncludeSubCategories']" )
	private static WebElement btnSurtchSubcategory;
	
	@FindBy(how = How.XPATH, using = "//select[@id='SearchManufacturerId']" )
	private static WebElement manufacter ;
	
	@FindBy(how = How.XPATH, using = "//select[@id='SearchVendorId']" )
	private static WebElement vendor  ;
	
	@FindBy(how = How.XPATH, using = "//select[@id='SearchWarehouseId']" )
	private static WebElement  warehouse;
	
	@FindBy(how = How.XPATH, using = "//select[@id='SearchProductTypeId']" )
	private static WebElement productType ;
	
	@FindBy(how = How.XPATH, using = "//select[@id='SearchPublishedId']" )
	private static WebElement published ;
	
	@FindBy(how = How.XPATH, using = "//input[@id='GoDirectlyToSku']" )
	private static WebElement productSKU ;
	
	@FindBy(how = How.XPATH, using = "//button[@id='go-to-product-by-sku']" )
	private static WebElement btngo ;
	
	@FindBy(how = How.XPATH, using = "//h1[@class='float-left']" )
	private static WebElement mssg  ;
	
	public CatalogProductPageObjects( ) {
		super(Setup.getDriver());
		
	}
	
	public static WebElement getBtncatalog() {
		return btncatalog ;
	}
	public static WebElement getBtnproduct() {
		return btnproduct ;
	}
	public static WebElement getNameProduct() {
		return nameProduct ;
	}
	public static WebElement getNameCategory() {
		return  nameCategory;
	}
	public static WebElement getBtnSurtchSubcategory() {
		return btnSurtchSubcategory ;
	}
	
	public static WebElement getManufacter() {
		return manufacter ;
	}
	
	public static WebElement getVendor() {
		return vendor ;
	}
	
	public static WebElement getWarehouse() {
		return warehouse ;
	}
	
	public static WebElement getProductType() {
		return productType ;
	}
	
	public static WebElement getPublished() {
		return published ;
	}
	
	public static WebElement getProductSKU() {
		return productSKU ;
	}
	
	public static WebElement getBtngo() {
		return btngo ;
	}
	public static WebElement getMssg() {
		return mssg ;
	}

}
