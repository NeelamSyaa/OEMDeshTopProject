package com.pom.oem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleFilePage {
	private WebDriver driver;
	//@FindBy(xpath = "//button[normalize-space(text())='Sample File']")
	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div/div/div[1]/div[2]//button[1]")
	private  WebElement  simplefile;
	
	
	
	public SampleFilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SampleFilePage simplefileDeviceManagerPage() {
		simplefile.click();
		return this;
	}
	
}
