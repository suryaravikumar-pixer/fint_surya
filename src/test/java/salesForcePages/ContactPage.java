package salesForcePages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {
//	@FindBy(xpath="(//span[text()='Contacts'])[1]")
	@FindBy(xpath="//*[@data-id='Contact']")
	WebElement contactButton;
	@FindBy(xpath = "(//div[text()='New'])")
	WebElement newButtion;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastNameField;
	@FindBy(xpath = "(//input[@role='combobox'])[3]")
	WebElement accountName;
	@FindBy(xpath = "//ul[@aria-label='Recent Accounts']/li[2]")
	WebElement recentAccountName;
	
public ContactPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}

WebDriverWait wait;
public void CreateContact(WebDriver driver) {
	System.out.println("Contact page started");
	contactButton.click();
	
//	WebDriverWait waitnewBtn = new WebDriverWait(driver,40);
//	waitnewBtn.until(ExpectedConditions.elementToBeClickable(contactButton)).click();
	System.out.println("Contact buttion clicked");
//	contactButton.click();
	newButtion.click();
	System.out.println("New button clicked");
	lastNameField.click();
	
	lastNameField.sendKeys("Honda");
	System.out.println("Data entered in lastfiled");
	
	wait = new WebDriverWait(driver, 10);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(accountName));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
//	wait.until(ExpectedConditions.elementToBeClickable(accountName));
//	accountName.click();
	System.out.println("Account name slected");
	
	recentAccountName.click();
	System.out.println("Clicked on recent account");
	System.out.println("Finally contact created & script closed...");

}	
}










