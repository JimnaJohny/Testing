package com.naveenautomation.pages;

//import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class HPLP3065Page extends TestBase{
	public HPLP3065Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "button-cart")
	WebElement addToCartBtn;
	
	@FindBy(css = "ul[class='nav nav-tabs']>li:nth-of-type(3)>a")
	WebElement reviewBtn;
	
	@FindBy(id = "input-review")
	WebElement inputReview;
	
	@FindBy(css = "input[value='5']")
	WebElement review;
	
	@FindBy(id = "button-review")
	WebElement continueBtn;
	
	@FindBy(css = "div[class='alert alert-success alert-dismissible']")
	WebElement bannerText;
	
	@FindBy(css = "div[class='alert alert-danger alert-dismissible']")
	WebElement errorText;
	
	public void clickOnaddToCartButton() {
		addToCartBtn.click();
	}
	
	public void clickOnReviewButtonError() {
		reviewBtn.click();
		inputReview.sendKeys("dfxcgvbh");
		review.click();
		continueBtn.click();
	}
	
	public void clickOnReviewButton() {
		reviewBtn.click();
		inputReview.sendKeys("dxcfgvbhjn");
		review.click();
		continueBtn.click();
	}
	
	public String getBannerText() {
		return bannerText.getText();
	}
	
	public String getErrorText() {
		return errorText.getText();
	}
}
