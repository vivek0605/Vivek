package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.BasePage;
import generics.Excellibrary;

public class POMYahooSignup extends BasePage implements Autoconstant {
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstnametextfield;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastnametextfield;
	
	@FindBy(xpath="//input[@name='yid']")
	WebElement emailtextfield;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordtextfield;
	@FindBy(xpath="//input[@name='phone']")
	WebElement phonetextfield;
	@FindBy(id="usernamereg-month")
	WebElement selectbirthmonth;
	@FindBy(xpath="//input[@name='dd']")
	WebElement birthdaytextfield;
	@FindBy(xpath="//input[@name='yyyy']")
	WebElement yeartextfield;
	@FindBy(xpath="//input[@name='freeformGender']")
	WebElement gendertextfield;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitbutton;
	
	public POMYahooSignup(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void yahooSignupMethod() throws IOException {
		firstnametextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1, 0));
		lastnametextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1, 1));
		emailtextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1, 2));
		passwordtextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1, 4));
		phonetextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1, 3));
		selectbyvalue(selectbirthmonth, "5");
		birthdaytextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1, 5));
		yeartextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1,6));
		gendertextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1, 7));
		submitbutton.click();
	}
}
