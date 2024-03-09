package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class MyAccountPageAssignment extends TestBase {
	public MyAccountPageAssignment() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div.collapse>ul.nav>li:nth-of-type(2)>a")
	WebElement laptops;
	@FindBy(css = "div.collapse>ul.nav>li:nth-of-type(2)>div>a")
	WebElement laptopList;
	@FindBy(css = "div.list-group>a:last-of-type")
	WebElement logOutBtn;
	@FindBy(css = "a[title='Checkout']>span")
	WebElement checkOutBtn;
	
	public LaptopsAndNotebooksPage clickOnLaptopsAndNoteBooks() {
		laptops.click();
		laptopList.click();
		return new LaptopsAndNotebooksPage();
	}

	public AccountLogoutPage clickLogOut() {
		logOutBtn.click();
		return new AccountLogoutPage();
	}
	
	public CheckoutPage clickCheckOut() {
		checkOutBtn.click();
		return new CheckoutPage();
	}
}
