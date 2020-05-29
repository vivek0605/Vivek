package com.generics.ActiTime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.pages.ActiTime.POMActiLogin;



public class BaseTest implements Autoconstant
{
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		POMActiLogin login=new POMActiLogin(driver);
		login.loginmethod();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
	}
}