package com.pom.oem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SIMManagementPom {

	@FindBy(xpath = "//div//ul//li/div[@aria-label=\"SIM Management\"]")
	private WebElement SIMManagementsidebarbtn;
	private WebDriver driver;
	
	
	public SIMManagementPom( WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public SIMManagementPom  SIMManagementbtn() {
		SIMManagementsidebarbtn.click();
		return this;
	}
}


