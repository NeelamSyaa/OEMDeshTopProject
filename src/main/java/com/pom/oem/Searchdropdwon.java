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
	@FindBy(xpath = "//*[@id=\"«r3l»\"]//ul//li[2]")
    private	WebElement Searchbydropmenu;
	@FindBy(xpath =  "//input[@placeholder=\"Search by Serial No\"]")
	private WebElement Search_bySerialNo;

 public Searchdropdwon (WebDriver  driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 public void SearchbyIMIE( ) {
	   SearchbyIMIE.clear();
	   SearchbyIMIE.sendKeys("543645767345436");
 }
 
   public  void SearchbyIMEIdrpMenu() {
	   Searchbydropmenu.click();
   }
   
   public void Search_bySerialNodrp() {
		 Search_bySerialNo.sendKeys("2436548679809bhtyujt6ui");
		
	 }
   
 
}