package testScripts;

import org.testng.annotations.Test;

import baseScripts.BaseLibrary;

import salesForcePages.LoginPage;
import salesForcePages.OpportunityPage;

public class OpportunityTest extends BaseLibrary {
	@Test
	public void accountTestFunction() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginFunction();
		OpportunityPage account = new OpportunityPage(driver);
		account.createOpportunity(driver);
	}
}
