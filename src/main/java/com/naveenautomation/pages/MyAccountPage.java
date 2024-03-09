package com.naveenautomation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>ul:nth-of-type(1) li:nth-of-type(2) a")
	WebElement changePwdBtn;

	@FindBy(css = "div.alert")
	WebElement successBanner;

	@FindBy(css = "#account-account>div.row h2:first-of-type")
	WebElement myAccountText;

	@FindBy(css = "#column-right a")
	List<WebElement> sideNavWebelementList;

	@FindBy(css = "div.list-group>a:nth-of-type(2)")
	WebElement editAccount;

	@FindBy(css = "div[class='alert alert-success alert-dismissible']")
	WebElement bannerText;

	@FindBy(css = "div[class='list-group']>a:nth-of-type(12)")
	WebElement newsLetterBtn;

	@FindBy(css = "div[class='alert alert-success alert-dismissible']")
	WebElement successMsg;

	@FindBy(css = "#wishlist-total>span[class='hidden-xs hidden-sm hidden-md']")
	WebElement wishListBtn;
	
	@FindBy(id = "cart-total")
	WebElement cartBtn;
	
	@FindBy(css = "td:nth-of-type(5)>button")
	WebElement removeBtn;
	
	@FindBy(css = "a[title='Shopping Cart']>span")
	WebElement shoppingCartBtn;
	
	@FindBy(xpath = "//ul[@class='list-unstyled']//a[text()='Returns']")
	WebElement returnsBtn;
	
	@FindBy(css = "a[title='My Account']> span[class='hidden-xs hidden-sm hidden-md']")
	WebElement myAccountBtn;

	@FindBy(css = "ul[class='dropdown-menu dropdown-menu-right']>li:nth-of-type(2)>a")
	WebElement orderHistory;
	
	@FindBy(xpath = "//a[text()='Brands']")
	WebElement brandsBtn;
	
	@FindBy(xpath = "//a[text()='Specials']")
	WebElement specialsBtn;
	
	@FindBy(css = "li[class='dropdown']:first-of-type>a")
	WebElement desktopsBtn;
	
	@FindBy(css = "div[class='dropdown-menu']>a[class='see-all']")
	WebElement showAllDesktop;
	
	public ChangePwdPage clickChangePasswordBtn() {
		changePwdBtn.click();
		return new ChangePwdPage();
	}

	public String getPasswordUpdateAlertText() {
		return successBanner.getText();
	}

	public String getMyAccountText() {
		return myAccountText.getText();
	}

	public AddressBookPage clickSideNavMenuItem(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new AddressBookPage();
	}

	public MyAccountInformationPage clickOnEditAccount() {
		editAccount.click();
		return new MyAccountInformationPage();
	}

	public String getBannerText() {
		return bannerText.getText();
	}

	public NewsletterSubscriptionPage clickOnNewsLetter() {
		newsLetterBtn.click();
		return new NewsletterSubscriptionPage();
	}

	public String getSuccessMsg() {
		return successMsg.getText();
	}

	public MyWishListPage clickWishList() {
		wishListBtn.click();
		return new MyWishListPage();
	}
	
	public void clickCartBtn() {
		System.out.println("Total items in the cart is: "+cartBtn.getText());
		cartBtn.click();
		removeBtn.click();
		driver.navigate().refresh();
		System.out.println("Total items in the cart after removing an item is: "+cartBtn.getText());
	}
	
	public ShoppingCartPage clickShoppingCart() {
		shoppingCartBtn.click();
		return new ShoppingCartPage();
	}
	
	public ProductReturnsPage clickReturns() {
		returnsBtn.click();
		return new ProductReturnsPage();
	}
	
	public OrderHistoryPage clickMyAccountBtn() {
		myAccountBtn.click();
		orderHistory.click();
		return new OrderHistoryPage();
	}
	
	public BrandsPage clickBrands() {
		brandsBtn.click();
		return new BrandsPage();
	}
	
	public SpecialOffersPage clickSpecials() {
		specialsBtn.click();
		return new SpecialOffersPage();
	}
	public DesktopsPage viewDesktops() {
		desktopsBtn.click();
		showAllDesktop.click();
		return new DesktopsPage();
	}
}