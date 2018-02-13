package scripts;

import org.testng.annotations.Test;
import generic.Base_Test;
import generic.Excel;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pom.HomePage;
import pom.LoginPage;
/**
 * This test case verifies the actitime version
 * @author anusha_sharavanababu
 *
 */

public class VerifyActitimeVersion extends Base_Test
{
	@Test
	public void testVerifyActitimeVersion() throws InterruptedException
	{
		String un=Excel.getCellValue(PATH, "VerifyActitimeVersion", 1,0);
		String pwd=Excel.getCellValue(PATH, "VerifyActitimeVersion", 1,1);
		String lp_title=Excel.getCellValue(PATH, "VerifyActitimeVersion", 1,2);
		String hp_title=Excel.getCellValue(PATH, "VerifyActitimeVersion", 1,3);
		String version=Excel.getCellValue(PATH, "VerifyActitimeVersion", 1,4);
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
		Thread.sleep(3000);
		hp.clickHelp();
		Thread.sleep(3000);
		hp.about();
		Thread.sleep(3000);
		hp.verifyActitimeVersion(version);
		hp.click_close();
		Thread.sleep(3000);
	
		hp.vclickLogout();
		Thread.sleep(3000);
		lp.verifyLoginPage(lp_title);
		
	}
}