package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class AppleCinema30Page extends TestBase{
	public AppleCinema30Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "button-upload222")
	WebElement uploadFile;
	
	@FindBy(id = "button-cart")
	WebElement addToCartBtn;
	
	@FindBy(css = "div[class='text-danger']")
	WebElement warningText;
	
	public void toUploadFile() throws InterruptedException {
//		uploadFile.sendKeys("\"C:\\Users\\jimna\\Downloads\\phase-1.txt\"");
//		driver.switchTo().alert().accept();
		addToCartBtn.click();
	}
	public String getWarningText() {
		return warningText.getText();
	}
}
