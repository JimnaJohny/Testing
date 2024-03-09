package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class DesktopsPage extends TestBase{
	public DesktopsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "div[class='caption']>h4>a")
	WebElement deskTopName;
	
	public AppleCinema30Page clickOnDesktop() {
		deskTopName.click();
		return new AppleCinema30Page();
	}
}
