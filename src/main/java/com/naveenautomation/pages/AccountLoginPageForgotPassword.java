package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class AccountLoginPageForgotPassword extends TestBase {

	public AccountLoginPageForgotPassword() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div.list-group>a:nth-of-type(3)")
	WebElement forgottenPwdBtn;

	@FindBy(css = "div[class='alert alert-success alert-dismissible']")
	WebElement bannerText;

	public ForgotYourPasswordPage clickForgotBtn() {
		forgottenPwdBtn.click();
		return new ForgotYourPasswordPage();
	}

	public String getBannerText() {
		return bannerText.getText();
	}

}
