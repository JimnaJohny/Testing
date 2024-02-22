package com.naveenautomation.tests;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.ContactUsPage;

public class ContactUsPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void contactUs() {
		ContactUsPage page = new ContactUsPage();
		page.contact(RandomStringUtils.randomAlphabetic(5), "User@gmail.com", RandomStringUtils.randomAlphabetic(10));
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
