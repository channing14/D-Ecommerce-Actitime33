package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Base_Page {
   public WebDriver driver; 
	public Base_Page(WebDriver driver) {
	super();
	this.driver = driver;
}
	public void verifyTitle(String etitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
		wait.until(ExpectedConditions.titleContains(etitle));
		Reporter.log("title is matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("title is nt matching",true);
			Assert.fail();
		}
	


		
		
	}
	public void verifyIfElementisPresent(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		try
		{
			wait.until(ExpectedConditions.visibilityOf(ele));
		Reporter.log("ele is present");
		}
		catch(Exception e)
		{
			Reporter.log("ele is not present");
			Assert.fail();
		}
		
	}

}
