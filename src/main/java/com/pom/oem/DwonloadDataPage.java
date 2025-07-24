package com.pom.oem;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DwonloadDataPage {

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[1]/div/div[1]//button[@type=\"button\"]")
	private WebElement dwonloaddatabtn; 
	private WebDriver driver; 
	private WebDriverWait wait;
	public DwonloadDataPage(WebDriver driver) {
		this.driver = driver;
		 this.wait = new  WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	 public  DwonloadDataPage dwonloadgelobal() throws InterruptedException {
		 Thread.sleep(5000);
		 dwonloaddatabtn.click();
		return this;
		 
	 }
	
}


