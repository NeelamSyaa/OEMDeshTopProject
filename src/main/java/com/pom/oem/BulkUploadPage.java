package com.pom.oem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BulkUploadPage {
@FindBy (xpath = "/div//button[text()=\"Bulk Upload\"]")
private WebElement btnbulkupload;

@FindBy(xpath =  "//span[text()=\"Choose File\"]")
private WebElement uploadfile ;



 public   BulkUploadPage() {
	 
 }
}
