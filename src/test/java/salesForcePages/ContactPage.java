package salesForcePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {
	@FindBy(xpath="(//span[text()='Contacts'])[1]")
	WebElement contactButton;
	@FindBy(xpath = "(//div[text()='New'])")
	WebElement newButtion;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastNameField;
	@FindBy(xpath = "(//input[@role='combobox'])[4]")
	WebElement accountName;
	@FindBy(xpath = "(//li[@role='presentation'])")
	WebElement recentAccountName;
	
public ContactPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}

public void CreateContact(WebDriver driver) {
	
	WebDriverWait waitnewBtn = new WebDriverWait(driver,40);
	waitnewBtn.until(ExpectedConditions.elementToBeClickable(contactButton)).click();
//	contactButton.click();
	newButtion.click();
	lastNameField.click();
	lastNameField.sendKeys("Honda");
	accountName.click();
	recentAccountName.click();
	
	
}
	
	
}










