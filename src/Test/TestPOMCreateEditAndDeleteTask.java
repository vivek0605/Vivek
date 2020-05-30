package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMActitime;

public class TestPOMCreateEditAndDeleteTask extends BaseTest{
	@Test
	public void CreateEditAndDeletetask() throws InterruptedException, IOException {
		POMActitime acti=new POMActitime(driver);
		acti.createTaskMethod();
		acti.EditAndDeletetaskMethod();
	}

}
