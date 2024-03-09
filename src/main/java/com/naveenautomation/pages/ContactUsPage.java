package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class ContactUsPage extends TestBase {

	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Contact Us']")
	WebElement contactUs;

	@FindBy(id = "input-name")
	WebElement yourName;

	@FindBy(id = "input-email")
	WebElement emailAddress1;

	@FindBy(id = "input-enquiry")
	WebElement enquiry;

	@FindBy(css = "input[type='submit']")
	WebElement submitBtn;

	private void clickContactUs() {
		contactUs.click();
	}

	private void enterYourName(String name) {
		yourName.sendKeys(name);
	}

	private void enterEmailAddress(String email) {
		emailAddress1.sendKeys(email);
	}

	private void enterEnquiry(String enquiryQn) {
		enquiry.sendKeys(enquiryQn);
	}

	private void clickSubmit() {
		submitBtn.click();
	}

	public void contact(String name, String email, String enquiryQn) {
		clickContactUs();
		enterYourName(name);
		enterEmailAddress(email);
		enterEnquiry(enquiryQn);
		clickSubmit();
	}

}
