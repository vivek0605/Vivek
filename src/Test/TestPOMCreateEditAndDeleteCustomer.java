package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMActitime;

public class TestPOMCreateEditAndDeleteCustomer extends BaseTest{
	@Test
	public void createEditAndDeleteCustomer() throws InterruptedException, IOException {
		POMActitime acti=new POMActitime(driver);
		acti.createcustomerMethod();
		acti.editcustomerMethod();
		acti.deleteCustomer();
	}
}
