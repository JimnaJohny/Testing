package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPageAssignment;
import com.naveenautomation.pages.HPLP3065Page;
import com.naveenautomation.pages.LaptopsAndNotebooksPage;
import com.naveenautomation.pages.MyAccountPageAssignment;

public class HPLP3065PageTest extends TestBase{
	AccountLoginPageAssignment page;
	MyAccountPageAssignment myAccountPage;
	LaptopsAndNotebooksPage laptopAndNotebookPage;
	HPLP3065Page laptop;
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPageAssignment();
	}

	@Test()
	public void addToCart() {
		myAccountPage = page.submitLogin("testing@gmail.com", "Password1");
		laptopAndNotebookPage = myAccountPage.clickOnLaptopsAndNoteBooks();
		laptop = laptopAndNotebookPage.clickOnAddToCart();
		laptop.clickOnaddToCartButton();
		String bannerText = laptop.getBannerText();
		Assert.assertEquals(bannerText, "Success: You have added HP LP3065 to your shopping cart!\n×");
	}
	@Test()
	public void getreviewError() {
		myAccountPage = page.submitLogin("testing@gmail.com", "Password1");
		laptopAndNotebookPage = myAccountPage.clickOnLaptopsAndNoteBooks();
		laptop = laptopAndNotebookPage.clickOnItem();
		laptop.clickOnReviewButtonError();
		String bannerText = laptop.getErrorText();
		Assert.assertEquals(bannerText, "Warning: Review Text must be between 25 and 1000 characters!");
	}
	
	@Test()
	public void getreview() {
		myAccountPage = page.submitLogin("testing@gmail.com", "Password1");
		laptopAndNotebookPage = myAccountPage.clickOnLaptopsAndNoteBooks();
		laptop = laptopAndNotebookPage.clickOnItem();
		laptop.clickOnReviewButton();
		String bannerText = laptop.getBannerText();
		Assert.assertEquals(bannerText, "Thank you for your review. It has been submitted to the webmaster for approval.");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
