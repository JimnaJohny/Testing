package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class LogoDisplayedPage extends TestBase{
	public LogoDisplayedPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "img[title='naveenopencart']")
	WebElement image;
	
	public WebElement isImageDisplayed() {
		return image;
	}
}
