package testScripts;

import org.testng.annotations.Test;

import baseScripts.BaseLibrary;
import salesForcePages.LoginPage;
import salesForcePages.TaskPage;
public class TaskTest extends BaseLibrary {
	@Test
	public void taskTestFunction() throws Exception{
	LoginPage loginPage = new LoginPage(driver);
	loginPage.loginFunction();
	TaskPage task = new TaskPage(driver);
	task.createTask();
}
}