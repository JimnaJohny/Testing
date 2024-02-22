package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class RegisterAccountPage extends TestBase {
	public RegisterAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#column-right>div>a:nth-of-type(2)")
	WebElement rightColumnRegisterBtn;
	@FindBy(css = "input[type='text'][name='firstname']")
	WebElement firstName;
	@FindBy(css = "input[name='lastname']")
	WebElement lastName;
	@FindBy(css = "input[name='email']")
	WebElement email;
	@FindBy(css = "input[name='telephone']")
	WebElement telephone;
	@FindBy(css = "input[name='password']")
	WebElement password;
	@FindBy(css = "input[name='confirm']")
	WebElement confirmPassword;
	@FindBy(css = "label.radio-inline input[type='radio'][value='1']")
	WebElement subscribeRadioBtn;
	@FindBy(css = "input[type='checkbox']")
	WebElement privacyPolicyCheckBox;
	@FindBy(css = "input[type='submit']")
	WebElement continueBtn;

	private void clickRegister() {
		rightColumnRegisterBtn.click();
	}

	private void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}

	private void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}

	private void enterEmail(String emailId) {
		email.sendKeys(emailId);
	}

	private void enterTelephone(String telephoneNum) {
		telephone.sendKeys(telephoneNum);
	}

	private void enterPassword(String setPassword) {
		password.sendKeys(setPassword);
	}

	private void enterConfirmedPassword(String setConfirmedPassword) {
		confirmPassword.sendKeys(setConfirmedPassword);
	}

	private void clickSubscribe() {
		subscribeRadioBtn.click();
	}

	private void clickPrivacyPolicy() {
		privacyPolicyCheckBox.click();
	}

	private void clickContinue() {
		continueBtn.click();
	}

	public void Register(String fName, String lName, String emailId, String telephoneNum, String setPassword,
			String setConfirmedPassword) {
		clickRegister();
		enterFirstName(fName);
		enterLastName(lName);
		enterEmail(emailId);
		enterTelephone(telephoneNum);
		enterPassword(setPassword);
		enterConfirmedPassword(setConfirmedPassword);
		clickSubscribe();
		clickPrivacyPolicy();
		clickContinue();
	}
}
