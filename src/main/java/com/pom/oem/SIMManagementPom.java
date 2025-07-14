package com.pom.oem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SIMManagementPom {

	@FindBy(xpath = "//ul//li[2]//a[@class=\"MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters Mui-selected MuiListItemButton-root MuiListItemButton-gutters Mui-selected css-tjca0i\"]")
	private WebElement SIMManagementsidebarbtn;
	private WebDriver driver;
	
	
	public SIMManagementPom( WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public void SIMManagementbtn() {
		SIMManagementsidebarbtn.click();
	}
}


