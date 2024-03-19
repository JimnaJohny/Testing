package com.naveenautomation.pages;

//import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class ShoppingCartPage extends TestBase {
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[class='panel-heading']>h4>a")
	WebElement useCoupon;

	@FindBy(id = "input-coupon")
	WebElement couponCode;

	@FindBy(id = "button-coupon")
	WebElement couponCodeBtn;

	@FindBy(css = "div[class='alert alert-danger alert-dismissible']")
	WebElement errorText;

	public void clickUseCouponCode() {
		useCoupon.click();
		couponCode.sendKeys("dfcgvbh");
		couponCodeBtn.click();
	}

	public String getErrorText() {
		return errorText.getText();
	}
}
