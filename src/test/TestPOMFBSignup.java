package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMFBSignup;

public class TestPOMFBSignup extends BaseTest{
@Test
public void Signup() throws IOException {
	POMFBSignup signup=new POMFBSignup(driver);
	signup.signupMethod();
}
}
