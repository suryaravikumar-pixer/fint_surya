package executerScripts;

import org.testng.annotations.Test;

import genericScripts.BaseLib;
import pomSalesFroce.AccountsPage;

public class AccountTest extends BaseLib{
	@Test
	public void accountTestFunction() throws Exception {
		AccountsPage ap = new AccountsPage(driver);
		ap.CreateAccount(driver);
	}
}
