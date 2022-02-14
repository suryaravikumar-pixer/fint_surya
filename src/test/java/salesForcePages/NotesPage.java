package salesForcePages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotesPage {

	
	
	@FindBy(xpath = "//span[text()='Notes']//parent::a/..")
	WebElement notesButton;
	@FindBy(xpath = "//ul[@role='listbox']/li[1]")
	WebElement recentNotes;
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement deletebutton;
	@FindBy(xpath = "//div[@title='New']")
	WebElement newButton;
	@FindBy(xpath = "//input[@class='inputText notesTitle flexInput input']")
	WebElement title;
	@FindBy(xpath = "//div[@data-placeholder='Enter a note...']")
	WebElement note;
	@FindBy(xpath = "//span[text()='Add to Records']//parent::button")
	WebElement addButton;
	@FindBy(xpath = "(//span[text()='Done'])[2]//parent::button/.")
	WebElement doneButton;

	public NotesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	WebDriverWait wait;
	public void createNotes(WebDriver driver) throws InterruptedException {
		System.out.println("Create Notes ....");
		notesButton.click();
		System.out.println("notes button clicked");
//		Thread.sleep(2000);
//		recentNotes.click();
//		deletebutton.click();
		
		newButton.click();
		System.out.println("new notes button clicked");
		
		title.clear();
		Thread.sleep(4000);
		title.sendKeys("My notes");
		System.out.println("title created");
		
		note.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		note.sendKeys("Read about Waits");
		note.sendKeys(Keys.ENTER);
		note.sendKeys("HELOW");
		System.out.println("notes entered in text field");
		
		wait=new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(addButton));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		System.out.println("notes added to records");
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(doneButton)).click();
//		doneButton.click();
		System.out.println("yeah! finally notes created");
		

	}

}
