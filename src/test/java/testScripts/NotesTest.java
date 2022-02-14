package testScripts;

import org.testng.annotations.Test;

import baseScripts.BaseLibrary;
import salesForcePages.LoginPage;
import salesForcePages.NotesPage;

public class NotesTest extends BaseLibrary{
	@Test
	public void notesTestFunction() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginFunction();
		NotesPage notes = new NotesPage(driver);
		notes.createNotes(driver);
	}
}
