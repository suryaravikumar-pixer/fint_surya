package testScripts;

import org.testng.annotations.Test;

import baseScripts.BaseLibrary;
import salesForcePages.LoginPage;

public class LoginTest  extends BaseLibrary {
	@Test
	public void loginFunction() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginFunction();
		
	}
}