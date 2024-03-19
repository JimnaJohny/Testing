package com.naveenautomation.tests;
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
		page.contact("dfcghbj", "User@gmail.com", "dfxcgvbhj");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
