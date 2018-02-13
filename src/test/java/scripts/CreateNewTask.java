package scripts;

import generic.Base_Test;
import generic.Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pom.HomePage;
import pom.LoginPage;
import pom.TaskListPage;

public class CreateNewTask extends Base_Test{
	@Test
	public void testCreateNewTask() throws InterruptedException
	{
		String un=Excel.getCellValue(PATH, "CreateNewTask", 1, 0);
	    String pwd=Excel.getCellValue(PATH, "CreateNewTask", 1, 1);
	    String lp_title=Excel.getCellValue(PATH, "CreateNewTask", 1, 2);
	    String hp_title=Excel.getCellValue(PATH, "CreateNewTask", 1, 3);
	    String taskname=Excel.getCellValue(PATH, "CreateNewTask", 1, 4);
	    String taskdescription=Excel.getCellValue(PATH, "CreateNewTask", 1, 5);
	    String estimate=Excel.getCellValue(PATH, "CreateNewTask", 1, 6);
	    LoginPage lp=new LoginPage(driver);
	    lp.clickLogin(un, pwd);
	    HomePage hp=new HomePage(driver);
	    hp.veifyHomePage(hp_title);
	    hp.click_Task();
	    TaskListPage tp=new TaskListPage(driver);
	    tp.addNewTaskBtn();
	    tp.createNewTask();
	    Thread.sleep(3000);
	    tp.clickSelectCustomer();
	    Thread.sleep(3000);
	    tp.selectAllActiveCustomers();
	    Thread.sleep(4000);
	  
	    tp.enterTaskName(taskname);
	    Thread.sleep(3000);
	    tp.clickEditIcon();
	    Thread.sleep(3000);
	    tp.setEditTaskDescription(taskdescription);
	    Thread.sleep(3000);
	    tp.clickSaveBtn();
	    tp.setEstimate(estimate);
	    tp.clickSetDeadline();
	    tp.selectDeadlineDate();
	    tp.clickTypeOfWork();
	    tp.clickTesting();
	    tp.clickCreateTaskButton();
	}
	
	
}
