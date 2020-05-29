package com.pages.ActiTime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.ActiTime.Autoconstant;
import com.generics.ActiTime.Excellibrary;

public class POMActiLogin implements Autoconstant {
	@FindBy(id="username")
	private WebElement usernametextfield;
	
	@FindBy(xpath="//input[@class='textField pwdfield']")
	private WebElement passwordtextfield;
	
	@FindBy(id="keepLoggedInLabel")
private WebElement Keepmeloggedinbutton;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement ActiTimeInclink;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotpassword;
	
	public POMActiLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void loginmethod() throws IOException {
		usernametextfield.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeLoginSheet,1,0));
		passwordtextfield.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeLoginSheet, 1, 1));
		Keepmeloggedinbutton.click();
		loginbutton.click();
	}
	public void forgotpasswordMethod() {
		forgotpassword.click();
	}
	public void Actitimeincmethod() {
		ActiTimeInclink.click();
	}
}
