package com.pom.oem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BulkUploadPage {
	private WebDriver driver;
@FindBy (xpath = "//*[@id=\"root\"]/div/main/div/div/div/div[1]/div[2]/button[3]")
private WebElement btnbulkupload;
@FindBy(xpath = "//input[@type='file']")
private WebElement fileInput;


@FindBy(xpath =  "//div//button[text()=\"Upload\"]")
private WebElement uploadbtn ;
@FindBy(xpath = "//div//button[text()=\"Close\"]")
private WebElement closebtn;

//@FindBy(xpath = "//div//button[text()=\"Cancel\"]")
//private WebElement cancelbtn;


 public   BulkUploadPage( WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver , this);
	 
 }
 public void btnbulkuploaddevice() {
	 btnbulkupload.click();
 }
 public void clickfilebtn() {
	 fileInput.sendKeys("C:\\Users\\SYAA TECH\\eclipse-workspace\\OEMDeshTopProject\\data\\bulkdata1test.xlsx");
 }
 public  void uploadfile( ) throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait until the upload button is visible and enabled
	    WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(uploadbtn));

	    // Optional: scroll into view (to avoid overlap issues)
	    ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uploadButton);

	    // Final check before clicking
	    if (uploadButton.isEnabled()) {
	        uploadButton.click();
	    } else {
	        throw new RuntimeException("Upload button is still disabled or covered.");
	    }
 }
// public void cancelfile() {
//	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	    // Wait until the Cancel button is visible and clickable
//	    wait.until(ExpectedConditions.elementToBeClickable(cancelbtn));
//
//	    // Scroll into view to avoid overlaps
//	    ((org.openqa.selenium.JavascriptExecutor) driver)
//	        .executeScript("arguments[0].scrollIntoView(true);", cancelbtn);
//
//	    // Slight wait to let animations complete (if needed)
//	    try {
//	        Thread.sleep(500); // Short delay; better to avoid, but safe here for animations
//	    } catch (InterruptedException e) {
//	        Thread.currentThread().interrupt();
//	    }
//
//	    // Now click safely
//	    cancelbtn.click();
//}
 
 
 public void cloasefile() {
	 closebtn.click();
 }
}
