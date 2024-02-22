package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

	public class PurchaseAGiftCertificatePage extends TestBase {

		public PurchaseAGiftCertificatePage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath ="//a[text()='Gift Certificates']")
		WebElement giftCertificates;

		@FindBy(id = "input-to-name")
		WebElement recipientsName;
		
		@FindBy(id = "input-to-email")
		WebElement recipientsEmail;

		@FindBy(id = "input-from-name")
		WebElement yourName;
		
		@FindBy(id = "input-from-email")
		WebElement yourEmail;
		
		@FindBy(css = "input[value='7']")
		WebElement radioBtnGiftCertificateTheme;
		
		@FindBy(id = "input-message")
		WebElement message;
		
		@FindBy(css = "input[value='1'][name='amount']")
		WebElement amount;
		
		@FindBy(css = "input[type='checkbox']")
		WebElement checkBoxAgree;
		
		@FindBy(css = "input[type='submit']")
		WebElement continueBtn;
		
		private void clickGiftCertificate() {
			giftCertificates.click();
		}
		
		private void enterRecepientsName(String name) {
			recipientsName.sendKeys(name);
		}

		private void enterRecepientsEmail(String email) {
			recipientsEmail.sendKeys(email);
		}
		private void enterYourName(String urName) {
			yourName.sendKeys(urName);
		}
		private void enterYourEmail(String urEmail) {
			yourEmail.sendKeys(urEmail);
		}
		private void clickGiftCertificateTheme() {
			radioBtnGiftCertificateTheme.click();
		}
		private void enterMessage(String msg) {
			message.sendKeys(msg);
		}
		
		private void enteramount(String amt) {
			amount.sendKeys(amt);
		}
		
		private void clickcheckBoxAgree() {
			checkBoxAgree.click();
		}
		
		private void clickContinueBtn() {
			continueBtn.submit();
		}
		public void giftCertificate(String name,String email,String urName,String urEmail,String msg,String amt ) {
			clickGiftCertificate();
			enterRecepientsName(name);
			enterRecepientsEmail(email);
			enterYourName(urName);
			enterYourEmail(urEmail);
			clickGiftCertificateTheme();
			enterMessage(msg);
			enteramount(amt);
			clickcheckBoxAgree();
			clickContinueBtn();
		}

}
