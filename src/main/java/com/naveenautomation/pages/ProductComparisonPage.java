package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class ProductComparisonPage extends TestBase{
	public ProductComparisonPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "td>a[class='btn btn-danger btn-block']")
	WebElement removeBtn;
	
	@FindBy(css = "div[class='alert alert-success alert-dismissible']")
	WebElement alertBannerText;
	
	public void removeFromComarisonList() {
		removeBtn.click();
	}
	
	public String getBannerText() {
		return alertBannerText.getText();
	}
}
