package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class AccountLogoutPage extends TestBase {
	public AccountLogoutPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div.col-sm-9>p:first-of-type")
	WebElement logoutText;

	public String isLogout() {
		return logoutText.getText();
	}
}
