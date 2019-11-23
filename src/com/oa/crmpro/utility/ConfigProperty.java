package com.oa.crmpro.utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperty {
	
	
	public Properties readConfigProperties() {

		Properties prop = new Properties();
		try {
			
			InputStream input = new FileInputStream("F:\\Eclipse_Code\\CRMProAutomation\\src\\config.properties");

			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

}
