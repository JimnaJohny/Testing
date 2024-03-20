package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.OrderHistoryPage;

public class OrderHistoryPageTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	OrderHistoryPage orderHistory;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test()
	public void viewOrderHistory() {
		myAccountPage = page.submitLogin("testing2@gmail.com", "Password1");
		orderHistory = myAccountPage.clickMyAccountBtn();
		String bannerText = orderHistory.getText();
		Assert.assertEquals(bannerText, "Order History");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
