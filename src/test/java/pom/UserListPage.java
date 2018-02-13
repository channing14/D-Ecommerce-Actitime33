package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Base_Page;

public class UserListPage extends Base_Page {
	
@FindBy(xpath="//div[.='Add Users']")
private WebElement add_users;
@FindBy(xpath="//div[.='Configure new user profile']")
private WebElement configUserprofile;
@FindBy(id="userDataLightBox_firstNameField")
private WebElement firstname;
@FindBy(id="userDataLightBox_lastNameField")
private WebElement lastname;
@FindBy(id="userDataLightBox_emailField")
private WebElement email;
@FindBy(xpath="//button[@id='ext-gen283']")
private WebElement dept;
@FindBy(xpath=".//*[@id='ext-gen363']")
private WebElement design;
@FindBy(xpath=".//*[@id='userDataLightBox_userRatesEditorPlaceholder']/table/tbody/tr/td[2]/input")
private WebElement regularrates;
@FindBy(xpath="//span[.='Save & Send Invitation']")
private WebElement invitation;
	public UserListPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickAddusers()
	{
		add_users.click();
	}
	public void clickConfigureProfile() throws InterruptedException
	{
		Thread.sleep(3000);
		configUserprofile.click();
	}
	public void setFirstName(String uname)
	{
		firstname.sendKeys(uname);
	}
	public void setLastName(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void setEmail(String email1)
	{
		Actions act=new Actions(driver);
		act.moveToElement(email).perform();
		email.sendKeys(email1);
	}
	public void clickDept() throws InterruptedException
	{
		dept.click();
		Thread.sleep(3000);
	
	}
	public void selectDept()
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN)).perform();
		act.moveToElement(design).perform();

	}
	public void setRates(String rates1)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		regularrates.sendKeys(rates1);
	}
	public void sendInvitation()
	{
		invitation.click();
	}


}
