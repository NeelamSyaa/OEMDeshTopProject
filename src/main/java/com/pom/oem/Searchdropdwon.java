package com.pom.oem;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class Searchdropdwon {
	private WebDriver driver;
	@FindBy(xpath = "//div[@class=\"MuiFormControl-root MuiTextField-root css-4bwmf8\"]//input[@placeholder=\"Search by IMEI\"]")
	private WebElement SearchbyIMIE;
	@FindBy(xpath = "//ul//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-k9ifbw\"]")
    private	WebElement Searchbydropmenu;
	@FindBy(xpath =  "//input[@placeholder=\"Search by Serial No\"]")
	private WebElement Search_bySerialNo;

 public Searchdropdwon (WebDriver  driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 public void SearchbyIMIE(String imie) {
	   SearchbyIMIE.clear();
	   SearchbyIMIE.sendKeys(imie ,Keys.ENTER);
 }
 
   public  void SearchbyIMEIdrpMenu() {
	   Searchbydropmenu.click();
   }
   
   public void Search_bySerialNodrp( String SerialNo) {
		 Search_bySerialNo.sendKeys(SerialNo );
		 Search_bySerialNo.sendKeys(Keys.ENTER);
	 }
   
 
}