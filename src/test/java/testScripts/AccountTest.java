package testScripts;

import org.testng.annotations.Test;

import baseScripts.BaseLibrary;
import salesForcePages.AccountsPage;

public class AccountTest extends BaseLibrary{
	@Test
	public void accountTestFunction() throws Exception {
		AccountsPage ap = new AccountsPage(driver);
		ap.CreateAccount(driver);
	}
}
