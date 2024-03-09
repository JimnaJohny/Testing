package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.utility.Utility;

public class AccountLoginPageTestWithWrongCredentials extends TestBase {
	AccountLoginPage login;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		login = new AccountLoginPage();
	}

	@Test
	public void validateLoginWithWrongCredential() {
		login.submitLoginWithWrongCredentials(Utility.generateRandomEmail(), Utility.generateRandomPassword());
		String bannerText = login.getWarnigMsg();
		Assert.assertEquals(bannerText, "Warning: No match for E-Mail Address and/or Password.");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
