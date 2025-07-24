package com.pom.oem;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Factory;

public class SearchdropdwonDevicePage {
	private WebDriver driver;
	 private WebDriverWait wait;
	@FindBy(xpath = "//input[@placeholder=\"Enter IMEI\"]")
	private WebElement SearchbyIMIE;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[1]/div/div[1]/div[1]")
    private	WebElement Searchbydropmenu;
	@FindBy(xpath = "//*[@id=\"menu-\"]/div[3]//ul//li[2]")
	private  WebElement SearchbySerialNo;
	@FindBy(xpath =  "//div[2]//input[@placeholder=\"Enter Serial No\"]")
	private WebElement Search_bySerialNo;

 public  SearchdropdwonDevicePage (WebDriver  driver) {
	 this.driver = driver;
	 this.wait = new  WebDriverWait(driver,Duration.ofSeconds(10));
	 PageFactory.initElements(driver, this);
 }
 
 public SearchdropdwonDevicePage SearchbyIMIE() {
	   SearchbyIMIE.clear();
	   SearchbyIMIE.sendKeys("860560067157174");
	   return this;
 }
 
   public SearchdropdwonDevicePage selectserialNumber() {
	   SearchbySerialNo.click();
	   return this;
   }
   
   public SearchdropdwonDevicePage clcikdropdwonmanuSearch() {
	   Searchbydropmenu.click();
	   return this;
   }
   
   public SearchdropdwonDevicePage  Search_bySerialNodrp() {
	     Search_bySerialNo.clear();

		 Search_bySerialNo.sendKeys("BBOX77A052412098536");
		 return this;
		
	 }
   
 
}