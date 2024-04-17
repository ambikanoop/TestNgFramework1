package com.trainig.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.trining.base.basePage;

public class loginpage extends basePage{
	
	@FindBy(id="email_field")
	WebElement username;
	@FindBy(id="password_field")
	WebElement password;
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement Login;
	
	
	public loginpage(WebDriver driver) {
		super(driver);
	}
	
	public void eneterusername(String username1)

	{
		username.sendKeys(username1);
	}
	public void eneterpassword(String password1) {
		password.sendKeys(password1);
	}
	public void Loginbutton() {
		waitforelements(Login);
		Login.click();
	}
	

}
