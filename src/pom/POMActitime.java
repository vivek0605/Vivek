package pom;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.BasePage;
import generics.Excellibrary;

public class POMActitime extends BasePage implements Autoconstant {
	WebDriver driver;
	@FindBy(id="container_tasks")
	WebElement opentask;

	@FindBy(xpath="//div[.='Add New']")
	WebElement addnew;

	@FindBy(xpath="//div[contains(text(),'New Customer')]")
	WebElement createcustomer;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	WebElement entername;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	WebElement entercustomerdetails;
	 
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
	WebElement dropdownbutton;

	@FindBy(xpath="(//div[.='Big Bang Company'])[7]")
	WebElement company;

	@FindBy(xpath="//div[.='Create Customer']")
	WebElement createcustomerbutton;

	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	WebElement cancelbutton;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	WebElement searchbutton;
	
	@FindBy(xpath="//span[.='Vk']/../../..//div[@class='editButton']")
	WebElement customersetting;
	
	@FindBy(xpath="(//div[.='Vk'])[4]")
	WebElement editname;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[1]")
	WebElement enterNName;
	
	@FindBy(xpath="(//div[.='ACTIONS'])[1]")
	WebElement actionbutton;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	WebElement deletebutton;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	WebElement cdeletepermanently;
	
	
	
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
	
 public POMActitime(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
 public void createcustomerMethod() throws InterruptedException, IOException {
		Thread.sleep(3000);
		opentask.click();
		Thread.sleep(3000);
		addnew.click();
		Thread.sleep(3000);
		createcustomer.click();
		Thread.sleep(3000);
		entername.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeSheet, 1, 0));
		entercustomerdetails.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeSheet, 1, 1));
		dropdownbutton.click();
	    Thread.sleep(4000);
		company.click();
		Thread.sleep(3000);
		createcustomerbutton.click();

	}
 
 public void editcustomerMethod() throws InterruptedException, IOException {
		Thread.sleep(6000);
		searchbutton.click();
		searchbutton.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeSheet, 1, 0));
	elementclick(driver, customersetting);
	Thread.sleep(6000);
	editname.click();
	Thread.sleep(3000);
 enterNName.sendKeys(Keys.CONTROL,"a");
 enterNName.sendKeys(Keys.BACK_SPACE);
 Thread.sleep(3000);
		enterNName.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeSheet, 1, 2));
	}
 
 public void deleteCustomer() throws InterruptedException {
		Thread.sleep(3000);
		actionbutton.click();
		Thread.sleep(3000);
		actionbutton.click();
		Thread.sleep(3000);
		deletebutton.click();
		Thread.sleep(3000);
		cdeletepermanently.click();
		}
	public void createTaskMethod() throws InterruptedException, IOException {
		Thread.sleep(3000);
		newbutton.click();
		Thread.sleep(3000);
		selectCustomer.click();
		Thread.sleep(3000);
		newcustomer.click();
		Thread.sleep(3000);
		entercustomername.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeSheet, 1, 3));
		Thread.sleep(3000);
		enterprojectname.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeSheet, 1, 4));
		Thread.sleep(3000);
		enterTask.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeSheet, 1, 5));
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
		enterNewtask.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeSheet, 1, 6));
		Thread.sleep(3000);
		actionButton.click();
		Thread.sleep(3000);
		deleteTask.click();
		Thread.sleep(3000);
		tdeletepermanently.click();
	}
	public void createLeaveMethod() throws InterruptedException, IOException {
		Thread.sleep(3000);
		settingbutton.click();
		Thread.sleep(3000);
		LeavesButton.click();
		Thread.sleep(3000);
		createleavetype.click();
		Thread.sleep(3000);
		enterleavetype.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeSheet, 1, 7));
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
