package scripts;

import org.testng.annotations.Test;
import generic.Base_Test;
import generic.Excel;

import org.testng.annotations.Test;

import pom.HomePage;
import pom.LoginPage;
/**
 * test case for valid login
 * @author anusha_sharavanababu
 *
 */

public class ValidLoginLogout extends Base_Test {
	@Test
	public void testValidLoginLogout() throws InterruptedException
	{
		String un=Excel.getCellValue(PATH, "ValidLoginLogout", 1,0);
		String pwd=Excel.getCellValue(PATH, "ValidLoginLogout", 1,1);
		String lp_title=Excel.getCellValue(PATH, "ValidLoginLogout", 1,2);
		String hp_title=Excel.getCellValue(PATH, "ValidLoginLogout", 1,3);
		LoginPage lp=new LoginPage(driver);
	System.out.println(driver.getTitle());
		lp.clickLogin(un, pwd);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		HomePage hp=new HomePage(driver);
		hp.veifyHomePage(hp_title);
		
		hp.clickLogout();
		Thread.sleep(4000);
	
		lp.verifyLoginPage(lp_title);
	}

}
