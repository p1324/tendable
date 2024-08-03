package com.eb.testcases;

import org.testng.annotations.Test;

import com.eb.pages.BaseTest;
import com.eb.pages.LoginPage;

public class LoginTest extends BaseTest {
	LoginPage lp;

	@Test
	public void verifyLogin() {
		lp = new LoginPage(driver);
		String username="Demo12";
		String password="Test123456$";
		lp.loginToPortal(username, password);
	}
}
