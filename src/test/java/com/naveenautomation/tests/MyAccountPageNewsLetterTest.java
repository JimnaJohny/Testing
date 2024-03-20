package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.NewsletterSubscriptionPage;

public class MyAccountPageNewsLetterTest extends TestBase {
	AccountLoginPage login;
	MyAccountPage page;
	NewsletterSubscriptionPage newsLetter;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		login = new AccountLoginPage();
	}

	@Test
	public void subscribeNewsLetter() {
		page = login.submitLogin("testing2@gmail.com", "Password1");
		newsLetter = page.clickOnNewsLetter();
		page = newsLetter.clickContinue();
		String bannerText = page.getBannerText();
		Assert.assertEquals(bannerText, "Success: Your newsletter subscription has been successfully updated!");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
