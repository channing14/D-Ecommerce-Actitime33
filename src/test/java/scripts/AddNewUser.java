package scripts;

import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pom.HomePage;
import pom.LoginPage;
import pom.UserListPage;
import generic.Base_Test;
import generic.Excel;

/** 
 * test case to add a new user profile
 * @author anusha_sharavanababu
 *
 */

public class AddNewUser extends Base_Test {

	@Test
	public void testAddNewUser() throws InterruptedException
	{
		String un=Excel.getCellValue(PATH, "AddNewUser", 1,0);
		String pwd=Excel.getCellValue(PATH, "AddNewUser", 1,1);
		String lp_title=Excel.getCellValue(PATH, "AddNewUser", 1,2);
		String hp_title=Excel.getCellValue(PATH, "AddNewUser", 1,3);
		String firstname=Excel.getCellValue(PATH, "AddNewUser", 1,4);
		String lastname=Excel.getCellValue(PATH, "AddNewUser", 1,5);
		String email=Excel.getCellValue(PATH, "AddNewUser", 1,6);
		String rates1=Excel.getCellValue(PATH, "AddNewUser", 1,7);
		LoginPage lp=new LoginPage(driver);

		lp.clickLogin(un, pwd);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HomePage hp=new HomePage(driver);
		hp.veifyHomePage(hp_title);
		hp.clickUsers();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserListPage up=new UserListPage(driver);
		up.clickAddusers();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		up.clickConfigureProfile();
		Thread.sleep(3000);
		up.setFirstName(firstname);
		up.setLastName(lastname);
		up.setEmail(email);
		Thread.sleep(3000);
		up.clickDept();
		Thread.sleep(3000);
		up.selectDept();
		up.setRates(rates1);
		Thread.sleep(3000);
		up.sendInvitation();
		
	}

}
