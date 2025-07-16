package com.listeners.oem;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.oem.Base;

public class TestListener extends Base  implements ITestListener {
       
	@Override
	public void onTestFailure(ITestResult result) {
		
		if (Base.driver == null) {
            System.out.println("🚫 Driver is null. Cannot take screenshot.");
            return;
        }
		 TakesScreenshot ts = (TakesScreenshot)Base.driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);

	        // Add timestamp to avoid overwrite
	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        String testName = result.getMethod().getMethodName();
	        File dest = new File("./Screenshots/" + testName + "_" + timestamp + ".png");

	        try {
	            FileUtils.copyFile(src, dest);
	            System.out.println("🔴 Screenshot saved: " + dest.getAbsolutePath());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        
	    }
	 
	

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}
	
	

}
