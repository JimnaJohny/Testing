package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.ProductReturnsPage;

public class ProductReturnsPageTest extends TestBase{
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ProductReturnsPage returns;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test()
	public void returnProduct() {
		myAccountPage = page.submitLogin("testing2@gmail.com", "Password1");
		returns = myAccountPage.clickReturns();
		returns.fillForm();
		String bannerText = returns.getText();
		Assert.assertEquals(bannerText, "You will be notified via e-mail as to the status of your request.");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
