package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.utility.Utility;

public class AccountLoginPageAssignment extends TestBase {

	public AccountLoginPageAssignment() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	WebElement loginInput;

	@FindBy(id = "input-password")
	WebElement pwdInput;

	@FindBy(css = "#content div>div form>input")
	WebElement loginBtn;

	private void enterEmail(String email) {
		Utility.sendText(loginBtn, email);
		//loginInput.sendKeys(email);
	}

	private void enterPwd(String pwd) {
		Utility.sendText(pwdInput, pwd);
		//pwdInput.sendKeys(pwd);
	}

	private void clickLogin() {
		Utility.clickOnElement(loginBtn);
		//loginBtn.click();
	}

	public MyAccountPageAssignment submitLogin(String email, String pwd) {
		enterEmail(email);
		enterPwd(pwd);
		clickLogin();
		return new MyAccountPageAssignment();// page chaining concept
	}

}