package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class SuccessPage extends TestBase{
	public SuccessPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "div[id='content']>p")
	WebElement successText;
	
	public String getText() {
		return successText.getText();
	}
}
