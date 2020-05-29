package com.scripts.ActiTimeLogin;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.ActiTime.BaseTest;
import com.pages.ActiTime.POMActiCreateEditDeleteTask;


public class TestCreateEditDeleteTask extends BaseTest{
	@Test
	public void CreateEditAndDeletetask() throws InterruptedException, IOException {
		POMActiCreateEditDeleteTask acti=new POMActiCreateEditDeleteTask(driver);
		acti.createTaskMethod();
		acti.EditAndDeletetaskMethod();
	}

}
