package com.pages.ActiTime;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.ActiTime.Autoconstant;
import com.generics.ActiTime.BasePage;
import com.generics.ActiTime.Excellibrary;


public class POMActiCreateEditDeleteLeave  extends BasePage implements Autoconstant {
	WebDriver driver;
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	WebElement settingbutton;
	
	@FindBy(xpath="//a[.='Leave Types']")
	WebElement LeavesButton;
	
	@FindBy(xpath="//span[.='Create Leave Type']")
	WebElement createleavetype;
	
	@FindBy(id="leaveTypeLightBox_nameField")
	WebElement enterleavetype;
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	WebElement createleavebutton;
	
	@FindBy(xpath="(//div[@class='leaveTypeNameText'])[6]")
	WebElement createdleave;
	
@FindBy(xpath="//input[@id='inputDiv']")
WebElement enternewleave;
	
@FindBy(xpath="( //div[@class='applyButton'])[2]")
WebElement applyButton;

	@FindBy(xpath="//span[.='Corona']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	WebElement deleteleave;
	
	 public POMActiCreateEditDeleteLeave(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 public void createLeaveMethod() throws InterruptedException, IOException {
			Thread.sleep(3000);
			settingbutton.click();
			Thread.sleep(3000);
			LeavesButton.click();
			Thread.sleep(3000);
			createleavetype.click();
			Thread.sleep(3000);
			enterleavetype.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeDetailsSheet, 1, 7));
			createleavebutton.click();
		}
		public void EditAnddeleteLeaveMethod() throws InterruptedException {
			elementclick(driver, createdleave);
			Thread.sleep(3000);
			 enternewleave.sendKeys(Keys.CONTROL,"a");
			 enternewleave.sendKeys(Keys.BACK_SPACE);
			 Thread.sleep(3000);
			enternewleave.sendKeys("Corona");
			applyButton.click();
			deleteleave.click();
			AlertAccept(driver);
	}
	
}
