package com.eb.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.eb.utility.BrowserFactory;
import com.eb.utility.ConfigDataProviders;

public class BaseTest {

	public WebDriver driver;
	public ConfigDataProviders config= new ConfigDataProviders();

	@BeforeClass
	public void setUp() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingUrl());
	}

	@AfterClass
	public void teardown() {
		BrowserFactory.quiteBrowser(driver);
	}
}
