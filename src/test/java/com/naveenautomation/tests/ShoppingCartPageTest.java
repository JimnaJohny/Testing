package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.ShoppingCartPage;

public class ShoppingCartPageTest extends TestBase{
AccountLoginPage page;
MyAccountPage myAccountPage;
ShoppingCartPage shopping;
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test()
	public void applyCouponCode() {
		myAccountPage = page.submitLogin("testing2@gmail.com", "Password1");
		shopping = myAccountPage.clickShoppingCart();
		shopping.clickUseCouponCode();;
		String bannerText = shopping.getErrorText();
		Assert.assertEquals(bannerText, "Warning: Coupon is either invalid, expired or reached its usage limit!\n×");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
