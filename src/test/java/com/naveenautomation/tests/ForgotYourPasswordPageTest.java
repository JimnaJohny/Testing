package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPageForgotPassword;
import com.naveenautomation.pages.ForgotYourPasswordPage;
import com.naveenautomation.utility.Utility;

public class ForgotYourPasswordPageTest extends TestBase {
	AccountLoginPageForgotPassword login;
	ForgotYourPasswordPage forgotPwd;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		login = new AccountLoginPageForgotPassword();
	}

	@Test
	public void forgotPasswordWithWrongEmail() {
		forgotPwd = login.clickForgotBtn();
		forgotPwd.submitWithWrongEmail(Utility.generateRandomEmail());
		String bannerText = forgotPwd.getBannerText();
		Assert.assertEquals(bannerText, "Warning: The E-Mail Address was not found in our records, please try again!");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
