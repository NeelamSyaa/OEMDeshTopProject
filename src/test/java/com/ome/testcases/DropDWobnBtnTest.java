package com.ome.testcases;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;
import com.pom.oem.Searchdropdwon;



@Test(enabled = false)
public class DropDWobnBtnTest extends Base {
	LoginPage LPDP;
	Searchdropdwon sdpdn;
	@Test( dataProvider = "searchdata")
	public void searchdata() throws EncryptedDocumentException, IOException {
		sdpdn  =	new Searchdropdwon(driver);
	  
	    LPDP = new  LoginPage(driver);	
	    LPDP.enterPassword("username");
	    LPDP.enterPassword("password");
	    LPDP.clickLogin();
		
	
	
		//String imei = ExcelUtilSerialNumber.getCellData("Searchdata1", 1, 0);  
	//	System.out.println("IMEI: " + imei);
	 //String serialno = ExcelUtilSerialNumber.getCellData("Searchdata1", 1, 2);

	sdpdn.SearchbyIMEIdrpMenu();
	sdpdn.Search_bySerialNodrp();
		
	}
	
	
}
