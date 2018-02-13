package pom;

import generic.Base_Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage extends Base_Page{
	@FindBy(xpath="//div[.='TASKS']")
	private WebElement task_major_tab;
@FindBy(xpath="//div[.='Add New Task']")
private WebElement add_new_task;
@FindBy(xpath="//div[.='Create new tasks']")
private WebElement create_new_task;
@FindBy(id="ext-gen23")
private WebElement select_customer;
@FindBy(xpath=".//*[@id='ext-gen161']")
private WebElement all_active_customer;
@FindBy(xpath="//button[@id='ext-gen32']")
private WebElement select_project;

@FindBy(xpath=".//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
private WebElement enter_task_name;
@FindBy(xpath="//table[@class='createTasksTable']/tbody/tr[1]/td[2]")
private WebElement edit_icon;
@FindBy(id="editDescriptionPopupText")
private WebElement edit_task_description;
@FindBy(id="scbutton")
private WebElement save_button;
@FindBy(xpath="//img[@title='Click here to close']")
private WebElement close_button;
@FindBy(xpath="//table[@class='createTasksTable']/tbody/tr[1]/td[3]")
private WebElement estimate_txtbox;
@FindBy(xpath="//table[@class='createTasksTable']/tbody/tr[1]/td[4]")
private WebElement set_deadline;
@FindBy(xpath="//span[.='22']")
private WebElement deadline_date;
@FindBy(xpath="//button[@id='ext-gen232']")
private WebElement ok_btn;
@FindBy(xpath="//table[@class='createTasksTable']/tbody/tr[1]/td[5]")
private WebElement type_of_work;
@FindBy(xpath="//button[@id='ext-gen54']")
private WebElement testing;
@FindBy(xpath="//table[@class='createTasksTable']/tbody/tr[1]/td[6]")
private WebElement check_box;
@FindBy(xpath=".//span[.='Create Tasks']")
private WebElement create_tasks_btn;
	public TaskListPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}

	public void addNewTaskBtn()
	{
		add_new_task.click();
	}
	public void createNewTask()
	{
		create_new_task.click();
	}
	public void clickSelectCustomer()
	{
		select_customer.click();
	}
	public void selectAllActiveCustomers()
	{
		all_active_customer.click();
	}
	public void selectProjects() throws InterruptedException
	{
		select_project.click();
		Thread.sleep(3000);
	}

	public void enterTaskName(String taskname)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement enter_task_name=".//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input";
	js.executeScript ("document.getElementByXpath(".//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input").focus()");
		enter_task_name.sendKeys(taskname);
	}
	public void clickEditIcon()
	{
		edit_icon.click();
	}
	public void setEditTaskDescription(String taskdescription)
	{
		edit_task_description.sendKeys(taskdescription);
	}
	public void clickSaveBtn()
	{
		save_button.click();
	}
	public void clickCloseBtn()
	{
		close_button.click();
	}
	public void setEstimate(String estimate)
	{
		 estimate_txtbox.sendKeys(estimate);
	}
	public void clickSetDeadline()
	{
		set_deadline.click();
	}
	public void selectDeadlineDate()
	{
		deadline_date.click();
	}
	public void clickOKbutton()
	{
		ok_btn.click();
	}
    public void clickTypeOfWork()
    {
    	type_of_work.click();
    }
    public void clickTesting()
    {
    	testing.click();
    }
    public void selectcheckBox()
    {
    	check_box.click();
    }
    public void clickCreateTaskButton()
    {
    	create_tasks_btn.click();
    }

}
