package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMYahooSignup;

public class TestPOMYahooSignup extends BaseTest {
@Test
public void yahoosignup() throws IOException {
	POMYahooSignup signup=new POMYahooSignup(driver);
	signup.yahooSignupMethod();
}
}
