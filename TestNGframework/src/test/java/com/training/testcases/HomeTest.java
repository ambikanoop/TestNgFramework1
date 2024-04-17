package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trainig.pages.Homepage;
import com.trainig.pages.loginpage;
import com.trining.base.baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTest extends baseTest {
	loginpage loginpage;
	WebDriver driver;
	Homepage home;
	
	@BeforeMethod
   public void beforeMethod() {
		driver=getdriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		 loginpage=new loginpage(driver);
		 home=new Homepage(driver);
	}


@Test
public void hometab() {


loginpage.eneterusername("admin123@gmail.com");
loginpage.eneterpassword("admin123");
loginpage.Loginbutton();
home.clickonHome();
home.enetername("Ambika");
home.enterfathername("krishnamurthy");
}
@Test
public void testlastname() {


loginpage.eneterusername("admin123@gmail.com");
loginpage.eneterpassword("admin123");
loginpage.Loginbutton();
home.clickonHome();

home.enterfathername("krishnamurthy");
}
@AfterMethod
public void teardown() {
	close();
}

}