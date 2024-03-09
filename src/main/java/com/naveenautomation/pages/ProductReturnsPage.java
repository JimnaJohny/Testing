package com.naveenautomation.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.utility.Utility;

public class ProductReturnsPage extends TestBase{
	public ProductReturnsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "input-firstname")
	WebElement firstName;
	@FindBy(id = "input-lastname")
	WebElement lastName;
	@FindBy(id = "input-email")
	WebElement email;
	@FindBy(id = "input-telephone")
	WebElement telephone;
	@FindBy(id = "input-order-id")
	WebElement orderId;
	@FindBy(id = "input-product")
	WebElement productName;
	@FindBy(id = "input-model")
	WebElement productCode;
	@FindBy(id = "input-quantity")
	WebElement quantity;
	@FindBy(css = "input[value='2']")
	WebElement radioBtnReasonForReturn;
	@FindBy(css = "input[value='0']")
	WebElement radioBtnOpened;
	@FindBy(css = "input[value='Submit']")
	WebElement submitBtn;
	@FindBy(css = "div[id='content']>p:nth-of-type(2)")
	WebElement text;
	
	public void fillForm() {
		firstName.sendKeys(RandomStringUtils.randomAlphabetic(5));
		lastName.sendKeys(RandomStringUtils.randomAlphabetic(5));
		email.clear();
		email.sendKeys(Utility.generateRandomEmail());
		telephone.sendKeys(RandomStringUtils.randomNumeric(10));
		orderId.sendKeys(RandomStringUtils.randomAlphabetic(5));
		productName.sendKeys(RandomStringUtils.randomAlphabetic(5));
		productCode.sendKeys(RandomStringUtils.randomAlphabetic(5));
		quantity.sendKeys("1");
		radioBtnReasonForReturn.click();
		radioBtnOpened.click();
		submitBtn.submit();
	}
	public String getText() {
		return text.getText();
	}
}
