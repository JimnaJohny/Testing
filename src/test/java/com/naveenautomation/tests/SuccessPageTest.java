package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPageAssignment;
import com.naveenautomation.pages.CheckoutPage;
import com.naveenautomation.pages.MyAccountPageAssignment;
import com.naveenautomation.pages.SuccessPage;

public class SuccessPageTest extends TestBase{
	AccountLoginPageAssignment page;
	MyAccountPageAssignment myAccountPage;
	CheckoutPage checkout;
	SuccessPage success;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPageAssignment();
	}

	@Test()
	public void checkout() {
		myAccountPage = page.submitLogin("testing@gmail.com", "Password1");
		checkout = myAccountPage.clickCheckOut();
		success= checkout.fillCheckoutInfo();
		String bannerText = success.getText();
		Assert.assertEquals(bannerText, "Your order has been successfully processed!");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
