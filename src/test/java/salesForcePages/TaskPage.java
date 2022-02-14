package salesForcePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	@FindBy(xpath = "(//span[text()='Tasks'])[1]//parent::a/..")
	
//	@FindBy(xpath = "//one-app-nav-bar-item-root[@data-id='Task']/a")
	WebElement tasksButton;
	
	@FindBy(xpath = "//a[@title='Show one more action']//parent::div/.")
	WebElement tasksDropDownButton;
	
	@FindBy(xpath = "//div[@role='menu']/ul/li/a")
	WebElement newTaskButton;
	
	@FindBy(xpath = "(//input[@role='combobox'])[3]")
	WebElement subjectField;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement saveButton;
	

	public TaskPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void createTask() {
		System.out.println("Task started...");
		tasksButton.click();
		System.out.println("tasks button clicked");
		tasksDropDownButton.click();
		System.out.println("Drop down button clicked");
		newTaskButton.click();
		System.out.println("New button clicked");
		subjectField.sendKeys("Quality engineer");
		System.out.println("Data sent to the subject field");
		saveButton.click();
		System.out.println("save button clicked");
		System.out.println("Hola!, finally new task is created");
		
		
		
	}
}
