package testScripts;

import org.testng.annotations.Test;

import baseScripts.BaseLibrary;
import salesForcePages.AccountsPage;
import salesForcePages.LoginPage;

public class AccountTest extends BaseLibrary{
	@Test
	public void accountTestFunction() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginFunction();
		AccountsPage account = new AccountsPage(driver);
		account.CreateAccount(driver);
	}
}
