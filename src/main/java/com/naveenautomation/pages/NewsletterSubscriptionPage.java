package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class NewsletterSubscriptionPage extends TestBase {
	public NewsletterSubscriptionPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[type='radio'][value='1']")
	WebElement radioBtn;
	
	@FindBy(css = "input[type='radio'][value='0']")
	WebElement noRadioBtn;

	@FindBy(css = "input[value='Continue']")
	WebElement continueBtn;

	public MyAccountPage clickContinue() {
		radioBtn.click();
		continueBtn.click();
		return new MyAccountPage();
	}
	
	public MyAccountPage clickContinueToNo() {
		noRadioBtn.click();
		continueBtn.click();
		return new MyAccountPage();
	}
}
