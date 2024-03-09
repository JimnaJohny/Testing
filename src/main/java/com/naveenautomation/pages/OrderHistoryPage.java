package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class OrderHistoryPage extends TestBase{
	public OrderHistoryPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "div#content>h1")
	WebElement text;
	public String getText() {
		return text.getText();
	}
}
