package com.pom.oem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleFilePage {
	private WebDriver driver;
	@FindBy(xpath = "//button[normalize-space(text())='Sample File']")
	private  WebElement  simplefile;
	
	
	
	public SampleFilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void simplefileDeviceManagerPage() {
		simplefile.click();
	}
	
}
