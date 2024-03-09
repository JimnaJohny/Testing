package com.naveenautomation.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.LogoDisplayedPage;

public class LogoDisplayTest extends TestBase{
	LogoDisplayedPage page;
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new LogoDisplayedPage();
	}

	@Test()
	public void isLogoDisplayed() {
		WebElement image=page.isImageDisplayed();
		Assert.assertTrue(image.isDisplayed(), "Logo is not displayed on the webpage");//This is the message that will be displayed in the test report if the assertion fails. It provides additional information to help identify the cause of the failure.	
	}
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
