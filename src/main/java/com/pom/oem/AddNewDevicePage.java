package com.pom.oem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewDevicePage {

	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div/div/div[1]/div[2]/button[2]")
	private WebElement SingledriveAdd;
	@FindBy(xpath ="/html/body/div[2]/div[3]/div/div[1]/div/div/div[1]/div/div//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1pk1fka\"]")
	private WebElement SerialNoTextField;
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div/div[2]/div/div//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1pk1fka\"]")
	private WebElement imeinumber;
	@FindBy (xpath ="/html/body/div[2]/div[3]/div/div[1]/div/div/div[3]/div/div//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1pk1fka\"]")
	private WebElement devicemake;
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div[1]/div/div/div[4]/div/div//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1pk1fka\"]")
	private WebElement devicemodel;
     @FindBy(xpath = "//button[text()=\"Add Device\"]")
     private WebElement Adddevices;
     
	private WebDriver driver;
	
	
public 	AddNewDevicePage(WebDriver driver) {
	this.driver = driver ;
	PageFactory.initElements(driver,this );
}

public void  SrialNumber() {
	SingledriveAdd.click();
}

public void  SerialNoTextField(String SNdata) {
	SerialNoTextField.sendKeys(SNdata);
}
public void imeinumbertext(String imie) {
	imeinumber.sendKeys(imie );
}

public void devicemaketext( String  tata) {
	devicemake.sendKeys(tata);
}
public void devicemodeltext(String blackbox) {
	devicemodel.sendKeys(blackbox);
}

public void AddNewDevice() {
	Adddevices.click();
}
}
