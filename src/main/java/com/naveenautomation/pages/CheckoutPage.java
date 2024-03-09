package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class CheckoutPage extends TestBase{
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "button-payment-address")
	WebElement billingContinueBtn;
	
	@FindBy(id = "button-shipping-address")
	WebElement deliveryContinueBtn;
	
	@FindBy(id = "button-shipping-method")
	WebElement deliveryMethodContinueBtn;
	
	@FindBy(css = "input[type='checkbox']")
	WebElement checkBox;
	
	@FindBy(id = "button-payment-method")
	WebElement paymentContinueBtn;
	
	@FindBy(id = "button-confirm")
	WebElement confirmBtn;
	
	public SuccessPage fillCheckoutInfo() {
		billingContinueBtn.click();
		deliveryContinueBtn.click();
		deliveryMethodContinueBtn.click();
		checkBox.click();
		paymentContinueBtn.click();
		confirmBtn.click();
		return new SuccessPage();
	}
}
