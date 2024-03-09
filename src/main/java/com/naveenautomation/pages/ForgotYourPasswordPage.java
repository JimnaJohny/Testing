package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class ForgotYourPasswordPage extends TestBase {

	public ForgotYourPasswordPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	WebElement emailAddress;

	@FindBy(css = "input[class='btn btn-primary']")
	WebElement continueBtn;

	@FindBy(css = "div[class='alert alert-danger alert-dismissible']")
	WebElement bannerText;

	private void enterEmail(String email) {
		emailAddress.sendKeys(email);
	}

	private void clickContinue() {
		continueBtn.click();
	}

	public AccountLoginPageForgotPassword submitForgotPassword(String email) {
		enterEmail(email);
		clickContinue();
		return new AccountLoginPageForgotPassword();
	}

	public void submitWithWrongEmail(String email) {
		enterEmail(email);
		clickContinue();
	}

	public String getBannerText() {
		return bannerText.getText();
	}
}
