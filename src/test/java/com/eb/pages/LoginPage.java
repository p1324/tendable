package com.eb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest{

	WebDriver driver;

	// constructor
	public LoginPage(WebDriver lDriver) {
		this.driver = lDriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"loginlabel\"]")
	WebElement loginclick;

	@FindBy(name = "log")
	WebElement uname;

	@FindBy(name = "pwd")
	WebElement pass;

	@FindBy(name = "wp-submit")
	WebElement loginButton;



	public void loginToPortal(String username, String password) {
		// TODO Auto-generated method stub
		loginclick.click();
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginButton.click();

	}

	

}
