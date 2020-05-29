package com.scripts.ActiTimeLogin;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.ActiTime.BaseTest;
import com.pages.ActiTime.POMActiCreateEditAndDeleteCustomer;


public class TestActiCreateEditDeleteCustomer extends BaseTest{
	@Test
	public void createEditAndDeleteCustomer() throws InterruptedException, IOException {
		POMActiCreateEditAndDeleteCustomer acti=new POMActiCreateEditAndDeleteCustomer(driver);
		acti.createcustomerMethod();
		acti.editcustomerMethod();
		acti.deleteCustomer();
	}
}