package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.BasePage;
import generics.Excellibrary;

public class POMFBSignup extends BasePage implements Autoconstant{
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstnametextfield;
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastnametextfield;
@FindBy(xpath="//input[@name='reg_email__']")
WebElement emailaddresstextfield;
@FindBy(xpath="(//input[@type='password'])[2]")
WebElement passwordtextfield;
@FindBy(id="day")
WebElement selectday;
@FindBy(id="month")
WebElement selectmonth;
@FindBy(id="year")
WebElement selectyear;

@FindBy(xpath="//label[.='Male']")
WebElement malelabel;
@FindBy(xpath="(//button[.='Sign Up'])[1]")
WebElement signupbutton;

public POMFBSignup(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void signupMethod() throws IOException {
	firstnametextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1, 0));
	lastnametextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1, 1));
	emailaddresstextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 1, 2));
	passwordtextfield.sendKeys(Excellibrary.getcellvalue(excel_path, sheetname, 0, 3));
	selectbyvalue(selectday, "6");
	selectbyvisibletext(selectmonth, "May");
	selectbyvisibletext(selectyear, "1993");
	malelabel.click();
	signupbutton.click();
}
}
