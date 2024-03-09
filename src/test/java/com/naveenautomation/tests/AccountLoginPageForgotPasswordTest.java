package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPageForgotPassword;
import com.naveenautomation.pages.ForgotYourPasswordPage;

public class AccountLoginPageForgotPasswordTest extends TestBase {

	AccountLoginPageForgotPassword login;
	ForgotYourPasswordPage forgotPwd;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		login = new AccountLoginPageForgotPassword();
	}

	@Test
	public void validateUserCanResetPwd() {
		forgotPwd = login.clickForgotBtn();
		login = forgotPwd.submitForgotPassword("testing@gmail.com");
		String bannerText = login.getBannerText();
		Assert.assertEquals(bannerText, "An email with a confirmation link has been sent your email address.");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
