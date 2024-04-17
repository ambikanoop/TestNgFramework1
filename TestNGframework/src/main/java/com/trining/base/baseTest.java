package com.trining.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	WebDriver driver;
	public WebDriver getdriver() {
		if(driver==null)
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	
	return driver;
}
	public void close() {
		driver.close();
		driver=null;
	}
}
