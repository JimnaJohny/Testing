package com.naveenautomation.tests;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.PurchaseAGiftCertificatePage;

public class PurchaseAGiftCertificatePageTest extends TestBase {
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void registration() {
		PurchaseAGiftCertificatePage page = new PurchaseAGiftCertificatePage();
		page.giftCertificate(RandomStringUtils.randomAlphabetic(5), "User2@gmail.com",
				RandomStringUtils.randomAlphabetic(5), "user1@gmail.com", RandomStringUtils.randomAlphabetic(10),
				RandomStringUtils.randomNumeric(1));
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
