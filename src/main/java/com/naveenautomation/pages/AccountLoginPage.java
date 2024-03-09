//package com.naveenautomation.pages;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.naveenautomation.TestBase.TestBase;
//
//public class AccountLoginPage extends TestBase {
//
//	public AccountLoginPage() {
//		PageFactory.initElements(driver, this);
//	}
//
//	@FindBy(id = "input-email")
//	WebElement loginInput;
//
//	@FindBy(id = "input-password")
//	WebElement pwdInput;
//
//	@FindBy(css = "#content div>div form>input")
//	WebElement loginBtn;
//
//	private void enterEmail(String email) {
//		loginInput.sendKeys(email);
//	}
//
//	private void enterPwd(String pwd) {
//		pwdInput.sendKeys(pwd);
//	}
//
//	private void clickLogin() {
//		loginBtn.click();
//	}
//
//	public void submitLogin(String email, String pwd) {
//		enterEmail(email);
//		enterPwd(pwd);
//		clickLogin();
//	}
//
//}

package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class AccountLoginPage extends TestBase {

	public AccountLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	WebElement loginInput;

	@FindBy(id = "input-password")
	WebElement pwdInput;

	@FindBy(css = "#content div>div form>input")
	WebElement loginBtn;

	@FindBy(css = "div[class='alert alert-danger alert-dismissible']")
	WebElement bannerText;

	private void enterEmail(String email) {
		loginInput.sendKeys(email);
	}

	private void enterPwd(String pwd) {
		pwdInput.sendKeys(pwd);
	}

	private void clickLogin() {
		loginBtn.click();
	}

	public MyAccountPage submitLogin(String email, String pwd) {
		enterEmail(email);
		enterPwd(pwd);
		clickLogin();
		return new MyAccountPage();// page chaining concept
	}

	public void submitLoginWithWrongCredentials(String email, String pwd) {
		enterEmail(email);
		enterPwd(pwd);
		clickLogin();
	}

	public String getWarnigMsg() {
		return bannerText.getText();
	}
}