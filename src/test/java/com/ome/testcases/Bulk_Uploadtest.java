package com.ome.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.BulkUploadPage;
import com.pom.oem.LoginPage;

public class Bulk_Uploadtest extends Base{
public	BulkUploadPage Bup;
LoginPage lp;
	@Test(dataProvider = "bulkupload")
	public void bulkupload(String u , String p ) throws InterruptedException {
		lp = new LoginPage(driver);
	    lp.Usernamelogin(u);
	    lp.passwordlogin(p);
	    lp.loginbtnlogin();
	   
	    Bup = new BulkUploadPage(driver);
	   Bup.btnbulkuploaddevice();
	   Bup.clickfilebtn();
	   Bup.uploadfile();
	 //   Bup.cancelfile(); 
	   Bup.cloasefile();
	    
	}
	
	@DataProvider(name ="bulkupload")
	public  Object[][] dataprovider(){
		return  new Object[][] {
			{ "admin","admin"}
		};
		
	}
}
