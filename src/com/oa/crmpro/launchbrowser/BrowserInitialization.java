package com.oa.crmpro.launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//extra

public class BrowserInitialization {

	public WebDriver ChromebrowserInitialization() {
		//Setting properties
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Directories\\chromedriver.exe");
		
		//Invoking browser
		WebDriver oDriver = new ChromeDriver();
		oDriver.get("https://classic.crmpro.com");
		
		return oDriver;

	}

}
