package com.utilities.oem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	 private static Properties prop;

	   

	    	public static void loadProperties() throws IOException {
	    		prop = new Properties();
	    		FileInputStream file = new FileInputStream("C:\\Users\\SYAA TECH\\eclipse-workspace\\OEMDeshTopProject\\data\\config.properties");
	    		prop.load(file);
	    	}

	    	public static String getProperty(String key) {
	    		return prop.getProperty(key);
	    	}
}

