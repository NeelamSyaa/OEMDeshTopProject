package com.pom.oem;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class sidebarPAGE {
	
private WebDriver driver ;
private  WebDriverWait  wait ;
	@FindBy (xpath ="//*[@id=\"root\"]/div/div/div")
	private WebElement sidebarclickbtn;
	

public sidebarPAGE(WebDriver driver) {
this.driver = driver;
this.wait= new WebDriverWait(driver ,Duration.ofSeconds(20));
PageFactory.initElements(driver, this);
}
public void sidebarbtn() {
	sidebarclickbtn.click();
}
}
