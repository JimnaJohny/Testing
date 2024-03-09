package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPageAssignment;
import com.naveenautomation.pages.LaptopsAndNotebooksPage;
import com.naveenautomation.pages.MyAccountPageAssignment;

public class LaptopsAndNotebooksPageTest extends TestBase {

	AccountLoginPageAssignment page;
	MyAccountPageAssignment myAccountPage;
	LaptopsAndNotebooksPage laptopAndNotebookPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPageAssignment();
	}

	@Test()
	public void addToWishList() {
		myAccountPage = page.submitLogin("testing@gmail.com", "Password1");
		laptopAndNotebookPage = myAccountPage.clickOnLaptopsAndNoteBooks();
		laptopAndNotebookPage = laptopAndNotebookPage.clickOnWishList();
		String bannerText = laptopAndNotebookPage.getBannerText();
		System.out.println(bannerText);
		Assert.assertEquals(bannerText, "Success: You have added HP LP3065 to your wish list!\n×");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
