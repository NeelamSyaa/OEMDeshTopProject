package com.pom.oem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sidebarPAGE {
private WebDriver driver ;
	@FindBy (xpath ="//*[@id=\"root\"]/div/div/div")
	private WebElement sidebarclickbtn;
	

public sidebarPAGE(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}
public void sidebarbtn() {
	sidebarclickbtn.click();
}
}
