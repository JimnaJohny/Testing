package com.naveenautomation.tests;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.RegisterAccountPage;

public class RegisterAccountPageTest extends TestBase {
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void registration() {
		RegisterAccountPage page = new RegisterAccountPage();
		page.Register(RandomStringUtils.randomAlphabetic(5), RandomStringUtils.randomAlphabetic(5), "User@gmail.com",
				RandomStringUtils.randomNumeric(10), "Password123", "Password123");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
