package com.pom.oem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewDevicePage {
	private WebDriver driver;
	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div/div/div[1]/div[2]/button[2]")
	private WebElement SingledriveAddbtn;
	@FindBy(xpath ="/html/body/div[2]/div[3]/div/div[1]/div/div/div[1]/div/div//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1pk1fka\"]")
	private WebElement SerialNoTextinput;
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div/div[2]/div/div//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1pk1fka\"]")
	private WebElement imeinumberinput;
	@FindBy (xpath ="/html/body/div[2]/div[3]/div/div[1]/div/div/div[3]/div/div//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1pk1fka\"]")
	private WebElement devicemakeinput;
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div[1]/div/div/div[4]/div/div//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1pk1fka\"]")
	private WebElement devicemodelinput;
     @FindBy(xpath = "//button[text()=\"Add Device\"]")
     private WebElement Adddevicesbtncloase;
     
public 	AddNewDevicePage(WebDriver driver) {
	this.driver = driver ;
//	this.wait() = new 
	PageFactory.initElements(driver,this );
}

public AddNewDevicePage SingledriveAddbtn() {
	SingledriveAddbtn.click();
	return this;
}

public AddNewDevicePage  SerialNoTextinput(String SNdata) {
	SerialNoTextinput.clear();
	SerialNoTextinput.sendKeys(SNdata);
	return this;
}
public AddNewDevicePage imeinumberinput(String imie) {
	imeinumberinput.clear();
	imeinumberinput.sendKeys(imie );
	return this;
}

public AddNewDevicePage devicemakeinput() {
	devicemakeinput.click();
	devicemakeinput.sendKeys("TaTa");
	return null;
}
public AddNewDevicePage devicemodelinput() {
	devicemodelinput.clear();
	devicemodelinput.sendKeys("blockbox");
	return this;
}

public AddNewDevicePage AddNewDeviceclose() {
	Adddevicesbtncloase.click();
	return this;
}



}
