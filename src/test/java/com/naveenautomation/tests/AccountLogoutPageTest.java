package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPageAssignment;
import com.naveenautomation.pages.AccountLogoutPage;
import com.naveenautomation.pages.MyAccountPageAssignment;

public class AccountLogoutPageTest extends TestBase {
	AccountLoginPageAssignment login;
	MyAccountPageAssignment page;
	AccountLogoutPage logout;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		login = new AccountLoginPageAssignment();
	}

	@Test
	public void validateUserCanLogout() {
		page = login.submitLogin("testing@gmail.com", "Password1");
		logout = page.clickLogOut();
		String logoutMsg = logout.isLogout();
		Assert.assertEquals(logoutMsg, "You have been logged off your account. It is now safe to leave the computer.");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
