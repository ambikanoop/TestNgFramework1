package com.trainig.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trining.base.basePage;

public class Homepage extends basePage {
	@FindBy(xpath="//a[text()='Home']")
	WebElement hometab;
	@FindBy(id="name")
	WebElement name;
	@FindBy(id="lname")
	WebElement fathername;

	public Homepage(WebDriver driver) {
		super(driver);
	}
	public void clickonHome() {
		waitforelements(hometab);
		hometab.click();
	}
	public void enetername(String name1) {
		name.sendKeys(name1);
	}
	public void enterfathername(String fname) {
		fathername.sendKeys(fname);
	}

}
