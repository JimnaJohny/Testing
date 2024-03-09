package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;

public class MyAccountPageRemoveFromCartTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test()
	public void removeFromCart() {
		myAccountPage = page.submitLogin("testing@gmail.com", "Password1");
		myAccountPage.clickCartBtn();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
