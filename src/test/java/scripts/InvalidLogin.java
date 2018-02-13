package scripts;

import org.testng.annotations.Test;
import generic.Base_Test;
import generic.Excel;

import org.testng.annotations.Test;

import pom.HomePage;
import pom.LoginPage;
/**
 * test case for invalid login
 * @author anusha_sharavanababu
 *
 */

public class InvalidLogin extends Base_Test {
	@Test
	public void testInvalidLogin() throws InterruptedException
	{
		String un=Excel.getCellValue(PATH, "InvalidLogin", 1,0);
		String pwd=Excel.getCellValue(PATH, "InvalidLogin", 1,1);
		String lp_title=Excel.getCellValue(PATH, "InvalidLogin", 1,2);
		String hp_title=Excel.getCellValue(PATH, "InvalidLogin", 1,3);
		LoginPage lp=new LoginPage(driver);
	System.out.println(driver.getTitle());
		lp.clickLogin(un, pwd);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		lp.verifyErrMsg();
		
	}

}
