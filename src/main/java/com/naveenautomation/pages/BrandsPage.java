package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class BrandsPage extends TestBase{
	public BrandsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Apple']")
	WebElement appleBrand;
	
	public ApplePage clickAppleBrand() {
		appleBrand.click();
		return new ApplePage();
	}
}
