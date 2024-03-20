package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountInformationPage;
import com.naveenautomation.pages.MyAccountPage;

public class MyAccountPageEditAccountTest extends TestBase {

	AccountLoginPage login;
	MyAccountPage page;
	MyAccountInformationPage information;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		login = new AccountLoginPage();
	}

	@Test
	public void validateUserCanResetPwd() {
		page = login.submitLogin("testing2@gmail.com", "Password1");
		information = page.clickOnEditAccount();
		page = information.editAccount("456789123");
		String bannerText = page.getBannerText();
		Assert.assertEquals(bannerText, "Success: Your account has been successfully updated.");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
