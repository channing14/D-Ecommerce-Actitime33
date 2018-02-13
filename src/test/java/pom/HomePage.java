package pom;

import generic.Base_Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage extends Base_Page {
	@FindBy(xpath="//a[@href='/thbs/tasks/tasklist.do']")
	private WebElement task;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	@FindBy(xpath="//div[@class='popup_menu_icon support_icon']")
	private WebElement help;
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement about;
	@FindBy(xpath="//span[.='actiTIME 2017 Online']")
	private WebElement version;
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement close;
	@FindBy(xpath="//div[.='USERS']")
	private WebElement users;
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void veifyHomePage(String hp_title)
	{
		verifyTitle(hp_title);
	}
	public void clickLogout()
	{
		Actions act=new Actions(driver);
		act.moveToElement(logout).perform();
		logout.click();
	}

public void click_Task()
{
	task.click();
}
public void clickHelp()
{
	help.click();
}
public void about()
{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500)");
	about.click();
}
public void verifyActitimeVersion(String eversion)
{
	String aversion=version.getText();
	try
	{
	
	Assert.assertEquals(aversion,eversion);
	Reporter.log("version verified");
	}
	catch(Exception e)
	{
		Reporter.log("version not verified");
		Assert.fail();
	}
}
public void click_close()
{
	close.click();
}
public void vclickLogout() {
	for(int i=0;i<2;i++)
	{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,-500)");
	}
	logout.click();
}
public void clickUsers() throws InterruptedException
{
	Thread.sleep(3000);
	users.click();
}

}
