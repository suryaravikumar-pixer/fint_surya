package testScripts;

import org.testng.annotations.Test;

import baseScripts.BaseLibrary;
import salesForcePages.ContactPage;
import salesForcePages.LoginPage;

public class ContactTest extends BaseLibrary {
	@Test
	public void contactTestFunction() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginFunction();
		ContactPage contact = new ContactPage(driver);
		contact.CreateContact(driver);
	}
}
