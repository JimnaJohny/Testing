package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPageAssignment;
import com.naveenautomation.pages.LaptopsAndNotebooksPage;
import com.naveenautomation.pages.MyAccountPageAssignment;
import com.naveenautomation.pages.ProductComparisonPage;

public class ProductComparisonPageTest extends TestBase{
	AccountLoginPageAssignment page;
	MyAccountPageAssignment myAccountPage;
	LaptopsAndNotebooksPage laptopAndNotebookPage;
	ProductComparisonPage comparison;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPageAssignment();
	}

	@Test()
	public void removeFromComparisonList() {
		myAccountPage = page.submitLogin("testing@gmail.com", "Password1");
		laptopAndNotebookPage = myAccountPage.clickOnLaptopsAndNoteBooks();
		comparison=laptopAndNotebookPage.getComparisonList();
		comparison.removeFromComarisonList();
		String bannerText = comparison.getBannerText();
		Assert.assertEquals(bannerText, "Success: You have modified your product comparison!\n×");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
