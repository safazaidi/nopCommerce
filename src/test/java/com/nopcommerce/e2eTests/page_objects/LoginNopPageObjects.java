package com.nopcommerce.e2eTests.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.nopcommerce.e2eTests.utils.BasePage;
import com.nopcommerce.e2eTests.utils.Setup;

public class LoginNopPageObjects extends BasePage{
	
	

	@FindBy(how = How.XPATH, using = "//input[@id='Email']" )
	private static WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Password']" )
	private static WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']" )
	private static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Dashboard']" )
	private static WebElement dashBoard;
	
	public LoginNopPageObjects() {
		super(Setup.getDriver());
		
	}
	
	
	public static WebElement getEmail() {
		return email;
	}
	
	public static WebElement getPassword() {
		return password;
	}
	
	public static WebElement getBtnLogin() {
		
		return btnLogin;
	}
	
	public static WebElement getDashboard() {
		return dashBoard;

}
}
