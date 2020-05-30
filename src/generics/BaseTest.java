package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest implements Autoconstant
{
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		  driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
	}
}