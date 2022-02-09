package executerScripts;

import org.testng.annotations.Test;

import genericScripts.BaseLib;
import pomSalesFroce.AccountsPage;
import pomSalesFroce.HomePage;
import pomSalesFroce.LoingPage;

public class LoginScript extends BaseLib {
	@Test
	public void loginFunction() throws Exception {
		HomePage homePage = new HomePage(driver);
		LoingPage loginPage = new LoingPage(driver);

		homePage.clickSignIn();
		loginPage.loginActivity();
	}
}
