package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Automation_const{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
        driver= new ChromeDriver(chromeOptions);
		driver.get("https://online.actitime.com/thbs/");

		
	}
	@AfterMethod
	public void closeAppln()
	{
		
		driver.close();
	}
}
