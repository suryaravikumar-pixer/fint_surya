package salesForcePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement subject;
	@FindBy(xpath = "//button[@name='Save']")
	WebElement save;
	@FindBy(xpath = "//button[@name='Cancel']")
	WebElement cancel;

	public TaskPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void createTask() {
		subject.sendKeys("Quality engineer");
		save.click();
		cancel.click();
		
	}
}
