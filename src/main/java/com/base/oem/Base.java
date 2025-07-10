package com.base.oem;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.utilities.oem.ConfigReader;



public class Base {

	public static WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void setbrowser(@Optional("chrome") String browser) throws IllegalAccessException, IOException {
		ConfigReader.loadProperties();
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			throw new RuntimeException("Browser not supported: " + browser);
		}

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(ConfigReader.getProperty("baseURL"));
	}

	@AfterMethod
	public void teardwon() {
		driver.quit();
	}
}
