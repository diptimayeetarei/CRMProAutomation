package com.oa.crmpro.utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperty {
	
	//extra
	public Properties readConfigProperties() {

		Properties prop = new Properties();
		try {
			
			InputStream input = new FileInputStream("D:\\Twinkle Study\\DiptimayeeWorkSpace\\CRMProAutomation\\src\\config.properties");

			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

}
