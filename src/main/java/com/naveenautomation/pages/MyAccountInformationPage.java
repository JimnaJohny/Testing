
package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class MyAccountInformationPage extends TestBase {
	public MyAccountInformationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-telephone")
	WebElement editTelephoneNo;

	@FindBy(css = "input[value='Continue']")
	WebElement continueBtn;

	private void editPhoneNum(String teleNum) {
		editTelephoneNo.clear();
		editTelephoneNo.sendKeys(teleNum);
	}

	private void clickContinue() {
		continueBtn.click();
	}

	public MyAccountPage editAccount(String teleNum) {
		editPhoneNum(teleNum);
		clickContinue();
		return new MyAccountPage();
	}
}
