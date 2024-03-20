package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.SpecialOffersPage;

public class SpecialOffersPageTest extends TestBase{
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	SpecialOffersPage specialOffers;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test()
	public void viewSpecialOffers() {
		myAccountPage = page.submitLogin("testing2@gmail.com", "Password1");
		specialOffers = myAccountPage.clickSpecials();
		String bannerText = specialOffers.getText();
		Assert.assertEquals(bannerText, "Special Offers");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
