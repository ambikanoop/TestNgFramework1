package com.training.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trainig.pages.Homepage;
import com.trainig.pages.loginpage;
import com.trining.base.baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class loginTest extends baseTest{
	
	loginpage loginpage;
	WebDriver driver;

	@BeforeMethod

	public void beforeMethod() {
		driver=getdriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		 loginpage=new loginpage(driver);
	}



@Test
	public void Login() {
	
	
	loginpage.eneterusername("admin123@gmail.com");
	loginpage.eneterpassword("admin123");
	loginpage.Loginbutton();
		
	}
@Test
public void InvalidLogin() {
	loginpage.eneterusername("admin123@gmail.com");
	loginpage.eneterpassword("admin1234");
	loginpage.Loginbutton();
}
@AfterMethod
public void teardown() {
	close();
}
}
