package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ApplePage;
import com.naveenautomation.pages.BrandsPage;
import com.naveenautomation.pages.MyAccountPage;

public class ApplePageTest extends TestBase{
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	BrandsPage brands;
	ApplePage applePage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test()
	public void viewAppleProducts() {
		myAccountPage = page.submitLogin("testing2@gmail.com", "Password1");
		brands = myAccountPage.clickBrands();
		applePage=brands.clickAppleBrand();
		String bannerText = applePage.getText();
		Assert.assertEquals(bannerText, "Apple");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
