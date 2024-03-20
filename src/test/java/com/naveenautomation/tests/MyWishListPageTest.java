package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.MyWishListPage;

public class MyWishListPageTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	MyWishListPage wishList;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test()
	public void removeFromWishList() {
		myAccountPage = page.submitLogin("testing2@gmail.com", "Password1");
		wishList = myAccountPage.clickWishList();
		wishList.RemoveFromWishList();
		String bannerText = wishList.getBannerText();
		Assert.assertEquals(bannerText, "Success: You have modified your wish list!\n×");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
