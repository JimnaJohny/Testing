package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class MyWishListPage extends TestBase {
	public MyWishListPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[data-original-title='Remove']")
	WebElement removeBtn;

	@FindBy(css = "div[class='alert alert-success alert-dismissible']")
	WebElement bannerText;

	public void RemoveFromWishList() {
		removeBtn.click();
	}

	public String getBannerText() {
		return bannerText.getText();
	}
}
