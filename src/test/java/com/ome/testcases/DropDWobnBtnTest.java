package com.ome.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;
import com.pom.oem.Searchdropdwon;
import com.utilities.oem.ExcelUtilSerialNumber;



public class DropDWobnBtnTest extends Base {
	LoginPage LPDP;
	Searchdropdwon sdpdn;
	@Test( dataProvider = "searchdata")
	public void searchdata(String username1, String password2 ) throws EncryptedDocumentException, IOException {
		sdpdn  =	new Searchdropdwon(driver);
	    System.out.println("Username: " + username1);
	    System.out.println("Password: " + password2);
	    LPDP = new  LoginPage(driver);	
		LPDP.Usernamelogin(username1);
		LPDP.passwordlogin(password2);;
		LPDP.loginbtnlogin();
	
	
		String imei = ExcelUtilSerialNumber.getCellData("Searchdata1", 1, 0);  
		System.out.println("IMEI: " + imei);
	 //String serialno = ExcelUtilSerialNumber.getCellData("Searchdata1", 1, 2);

	 sdpdn.SearchbyIMEIdrpMenu();
	// sdpdn.Search_bySerialNodrp(serialno);
		
	}
	
	  @DataProvider(name = "searchdata")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"admin", "admin"}
	         
	        } ;
}}
