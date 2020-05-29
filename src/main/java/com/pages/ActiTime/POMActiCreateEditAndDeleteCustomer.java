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


public class POMActiCreateEditAndDeleteCustomer extends BasePage implements Autoconstant{
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
	
	 public POMActiCreateEditAndDeleteCustomer(WebDriver driver) {
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
				entername.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeDetailsSheet, 1, 0));
				entercustomerdetails.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeDetailsSheet, 1, 1));
				dropdownbutton.click();
			    Thread.sleep(4000);
				company.click();
				Thread.sleep(3000);
				createcustomerbutton.click();

			}
		 
		 public void editcustomerMethod() throws InterruptedException, IOException {
				Thread.sleep(6000);
				searchbutton.click();
				searchbutton.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeDetailsSheet, 1, 0));
      elementclick(driver, customersetting);
			Thread.sleep(6000);
			editname.click();
			Thread.sleep(3000);
		 enterNName.sendKeys(Keys.CONTROL,"a");
		 enterNName.sendKeys(Keys.BACK_SPACE);
		 Thread.sleep(3000);
				enterNName.sendKeys(Excellibrary.getcellvalue(excel_path, ActitimeDetailsSheet, 1, 2));
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
}
