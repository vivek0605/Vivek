package com.scripts.ActiTimeLogin;

import java.io.IOException;
import org.testng.annotations.Test;

import com.generics.ActiTime.BaseTest;
import com.pages.ActiTime.POMActiCreateEditDeleteLeave;

public class TestCreateEditDeleteLeave extends BaseTest{
@Test
public void CreateEditDeleteLeave() throws InterruptedException, IOException {
	POMActiCreateEditDeleteLeave leave=new POMActiCreateEditDeleteLeave(driver);
	leave.createLeaveMethod();
	leave.EditAnddeleteLeaveMethod();
}
}
