package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.AppleCinema30Page;
import com.naveenautomation.pages.DesktopsPage;
import com.naveenautomation.pages.MyAccountPage;

public class AppleCinema30PageTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	DesktopsPage desktop;
	AppleCinema30Page apple;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test()
	public void errorInAddToCart() throws InterruptedException {
		myAccountPage = page.submitLogin("testing2@gmail.com", "Password1");
		desktop = myAccountPage.viewDesktops();
		apple = desktop.clickOnDesktop();
		apple.toUploadFile();
		String bannerText = apple.getWarningText();
		Assert.assertEquals(bannerText, "Radio required!");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
