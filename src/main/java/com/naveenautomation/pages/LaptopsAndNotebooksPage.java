package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class LaptopsAndNotebooksPage extends TestBase {

	public LaptopsAndNotebooksPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button[onclick=\"wishlist.add('47');\"]")
	WebElement wishListBtn;
	
	@FindBy(css = "button[onclick=\"cart.add('47', '1');\"]>span")
	WebElement addToCartBtn;
	
	@FindBy(css = "button[data-original-title=\"Compare this Product\"]")
	WebElement comapareBtn;
	
	@FindBy(css = "div[class='alert alert-success alert-dismissible']>a:last-of-type")
	WebElement productComparisonBtn;
	
	@FindBy(css = "div[class='caption']>h4>a")
	WebElement itemName;

	public LaptopsAndNotebooksPage clickOnWishList() {
		wishListBtn.click();
		return new LaptopsAndNotebooksPage();
	}

	@FindBy(css = "div[class='alert alert-success alert-dismissible']")
	WebElement alertBannerText;

	public String getBannerText() {
		return alertBannerText.getText();
	}
	
	public HPLP3065Page clickOnAddToCart() {
		addToCartBtn.click();
		return new HPLP3065Page();
	}
	
	public void clickOnAddToComparisonList() {
		comapareBtn.click();
	}
	public ProductComparisonPage getComparisonList() {
		comapareBtn.click();
		productComparisonBtn.click();
		return new ProductComparisonPage();
	}
	
	public HPLP3065Page clickOnItem() {
		itemName.click();
		return new HPLP3065Page();
	}
}
