package com.naveenautomation.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.utility.ExcelUtils;

public class AccountLoginPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

//@Test(dataProvider = "LoginData2")//For the below Test method using "LoginData2"
	@Test(dataProvider = "LoginData")
	public void validateLogin(String username, String password) {
		// System.out.println("Testing login with username: " + username + " and
		// password: " + password);
		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin(username, password);
	}

//Login to the website using username and passwords saved in the specified excel sheet
	@DataProvider(name = "LoginData")
	private String[][] loginInfoProvider() throws IOException {
		String filePath = "C:\\Users\\jimna\\OneDrive\\Desktop\\LoginFile.xlsx";
//		String filePath ="\"C:\\Users\\jimna\\OneDrive\\Desktop\\LoginFile.xlsx\"";
		int rowCount = ExcelUtils.getRowCount(filePath, "Sheet1");
		int colCount = ExcelUtils.getColumnCount(filePath, "Sheet1", rowCount);
		String[][] loginData = new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				loginData[i - 1][j] = ExcelUtils.getCellValue(filePath, "Sheet1", i, j);
			}
		}
		return loginData;
	}

	// If we don't have an excel sheet, still we can use Data Provider, hard code or
	// fill the excel sheet manually
	// @DataProvider(name = "LoginData2")
//	private String[][] loginInfoProvider2() throws IOException {
//		
//		String[][] loginData =new String[2][2];
//		
//		loginData[0][0]= "Parul";
//		loginData[0][1]= "Shukla";
//		loginData[1][0]= "Ankit";
//		loginData[1][1]= "Shukla";
//		return loginData;
//	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}