package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMActitime;

public class TestPOMCreateEditAndDeleteLeave extends BaseTest{
	
	@Test
	public void CreateandDeleteLeave() throws InterruptedException, IOException {
		POMActitime acti=new POMActitime(driver);
		acti.createLeaveMethod();
		acti.EditAnddeleteLeaveMethod();
	}
	}

