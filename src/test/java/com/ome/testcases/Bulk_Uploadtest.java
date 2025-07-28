package com.ome.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.BulkUploadPage;
import com.pom.oem.LoginPage;
@Test(enabled = false)
public class Bulk_Uploadtest extends Base{
public	BulkUploadPage Bup;
LoginPage lp;

	public void bulkupload() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.enterPassword("username");
		lp.enterPassword("password");
		lp.clickLogin();
	   
	   Bup = new BulkUploadPage(driver);
	   Bup.btnbulkuploaddevice();
	   Bup.clickfilebtn();
	   Bup.uploadfile();
	 //   Bup.cancelfile(); 
	   Bup.cloasefile();
	    
	}
	
	
		
	
}
