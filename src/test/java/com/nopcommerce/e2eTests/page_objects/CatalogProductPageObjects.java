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
	
	//Add New Product
	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']" )
	private static WebElement btnAddNew  ;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Name']" )
	private static WebElement  productName ;
	
	@FindBy(how = How.XPATH, using = "//div[@id='product-info']//div[@class='card-header with-border clearfix']" )
	private static WebElement btnInfo  ;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='ShortDescription']" )
	private static WebElement  shortdescription ;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='ShortDescription']" )
	private static WebElement  fulldescription ;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Sku']" )
	private static WebElement  sku ;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-expanded='true']//input[@role='searchbox']" )
	private static WebElement categories ;
	
	@FindBy(how = How.XPATH, using = "//span[@class='select2 select2-container select2-container--default select2-container--below select2-container--focus']//input[@role='searchbox']" )
	private static WebElement  manufecter ;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Published']" )
	private static WebElement btnPublished ;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-expanded='true']//input[@role='searchbox']" )
	private static WebElement tags ;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Gtin']" )
	private static WebElement gtin ;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ManufacturerPartNumber']" )
	private static WebElement partNumber ;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ShowOnHomepage']" )
	private static WebElement btnShow ;
	
	@FindBy(how = How.XPATH, using = "//select[@id='ProductTypeId']" )
	private static WebElement typeProduct ;

	
	public CatalogProductPageObjects( ) {
		super(Setup.getDriver());
		
	}
	
	public static WebElement getBtncatalog() throws InterruptedException {
		Thread.sleep(3000);
		return btncatalog ;
	}
	public static WebElement getBtnproduct() throws InterruptedException {
		Thread.sleep(5000);
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
	
	//Add New Product
	
	public static WebElement getBtnAddNew() {
		return btnAddNew ;
	}
	
	public static WebElement getProductName() {
		return productName ;
	}
	
	public static WebElement getShortdescription() {
		return shortdescription;
	}
	
	public static WebElement getFulldescription() {
		return fulldescription ;
	}
	
	public static WebElement getSku() {
		return sku ;
	}
	
	public static WebElement getCategories() {
		return categories ;
	}
	
	public static WebElement getManufecter() {
		return manufecter ;
	}
	
	public static WebElement getBtnPublished() {
		return btnPublished ;
	}
	
	public static WebElement getTags() {
		return tags ;
	}
	
	public static WebElement getGtin() {
		return gtin ;
	}
	
	public static WebElement getPartNumber() {
		return partNumber ;
	}
	
	public static WebElement getBtnShow() {
		return btnShow ;
	}
	
	public static WebElement getTypeProduct() {
		return typeProduct ;
	}
	
	public static WebElement getBtnInfo() {
		return btnInfo ;
	}




}
