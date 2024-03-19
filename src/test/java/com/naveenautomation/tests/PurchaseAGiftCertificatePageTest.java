package com.naveenautomation.tests;

//import org.apache.commons.lang.RandomStringUtils;
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
	public void purchaseGiftCertificate() {
		PurchaseAGiftCertificatePage page = new PurchaseAGiftCertificatePage();
		page.giftCertificate("cfgvbhj", "User2@gmail.com",
				"cfgvhbjn", "user1@gmail.com", "fghjklvbhnjkm,l",
				"2");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
