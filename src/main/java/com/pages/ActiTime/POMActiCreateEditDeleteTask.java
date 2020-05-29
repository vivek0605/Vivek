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

public class POMActiCreateEditDeleteTask extends BasePage implements Autoconstant {
	WebDriver driver;
	@FindBy(id="addTaskButtonId")
	WebElement newbutton;	
	@FindBy(xpath="(//div[@class='dropdownButton'])[5]")
	WebElement selectCustomer;
	@FindBy(xpath="//div[contains(text(),'New Customer')]")
	WebElement newcustomer;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	WebElement entercustomername;
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	WebElement enterprojectname;
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	WebElement enterTask;
	@FindBy(xpath="(//input[@placeholder='Enter task name']/../..//div[.='engineering'])[2]")
	WebElement engineeringdropdown;
	@FindBy(xpath="(//div[.='testing'])[2]")
	WebElement selecttesting;
	@FindBy(xpath="//div[.='Create Tasks']")
	WebElement createtaskbutton;
	@FindBy(xpath="//div[.='Selenium']")
	WebElement createdTask;
	@FindBy(xpath="(//div[.='Selenium'])[2]")
	WebElement editTask;
	@FindBy(xpath="//input[@placeholder='Enter Task Name']")
	WebElement enterNewtask;
	@FindBy(xpath="//div[.='ACTIONS']")
	WebElement actionButton;	
	@FindBy(xpath="//div[.='Delete']")
	WebElement deleteTask;
	@FindBy(xpath="//span[.='Delete permanently']")
	WebElement tdeletepermanently;
	
	  public POMActiCreateEditDeleteTask(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
	 public void createTaskMethod() throws InterruptedException, IOException {
			Thread.sleep(3000);
			newbutton.click();
			Thread.sleep(3000);
			selectCustomer.click();
			Thread.sleep(3000);
			newcustomer.click();
			Thread.sleep(3000);
			entercustomername.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeDetailsSheet, 1, 3));
			Thread.sleep(3000);
			enterprojectname.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeDetailsSheet, 1, 4));
			Thread.sleep(3000);
			enterTask.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeDetailsSheet, 1, 5));
			Thread.sleep(3000);
			engineeringdropdown.click();
			Thread.sleep(3000);
			selecttesting.click();
			createtaskbutton.click();
		}
		public void EditAndDeletetaskMethod() throws InterruptedException, IOException {
			Thread.sleep(3000);
			createdTask.click();
			Thread.sleep(5000);
			elementclick(driver, editTask);
			enterNewtask.sendKeys(Keys.CONTROL,"a");
			Thread.sleep(3000);
			enterNewtask.sendKeys(Keys.BACK_SPACE);
			enterNewtask.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeDetailsSheet, 1, 6));
			Thread.sleep(3000);
			actionButton.click();
			Thread.sleep(3000);
			deleteTask.click();
			Thread.sleep(3000);
			tdeletepermanently.click();
		}
}
