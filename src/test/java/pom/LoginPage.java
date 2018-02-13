package pom;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base_Page {
	@FindBy(id="username")
	private WebElement uname1;
	
	@FindBy(name="pwd")
	private WebElement pswd1;
	
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']")
	private WebElement errmsg;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickLogin(String uname,String pswd)
	{
	  uname1.sendKeys(uname);
	  pswd1.sendKeys(pswd);
	  login.click();
	}
	public void verifyLoginPage(String lp_title)
	{
		verifyTitle(lp_title);
	}
	public void verifyErrMsg()
	{
		verifyIfElementisPresent(errmsg);
	}
   
}
