package salesForcePages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpportunityPage {
//	@FindBy(xpath = "//span[text()='Opportunities']//parent::a/..")
//	@FindBy(xpath = "//one-app-nav-bar-item-root[@data-id='Opportunity']")
	@FindBy(xpath = "//*[@data-id='Opportunity']")
	
	private WebElement opportunityButton;
//	@FindBy(xpath = "//div[text()='New']")
	@FindBy(xpath = "//div[text()='New']//parent::a/..")
	private WebElement newButton;
	@FindBy(xpath = "//input[@name='Name']")
	private WebElement opportunityNameField;
	@FindBy(xpath = "(//input[@role='combobox'])[3]")
	private WebElement accountNameField;
	@FindBy(xpath = "//ul[@role='group']/li[2]/lightning-base-combobox-item")
	private WebElement selectedAccountName;
	@FindBy(xpath = "//input[@name='CloseDate']")
	WebElement closeDate;
//	@FindBy(xpath="(//input[@aria-readonly='true'])[2]")
//	@FindBy(xpath = "(//button[@type='button']//parent::div/..)[32]")
	@FindBy(xpath = "(//span[@class='slds-truncate'][normalize-space()='--None--'])[2]")
	WebElement stage;
	
	@FindBy(xpath = "(//div[@role='listbox'])[4]/lightning-base-combobox-item[3]")
//	@FindBy(xpath = "(//button[@data-value='--None--'])[2]")
	WebElement stageSelect;
	
	@FindBy(xpath = "//button[@name='SaveEdit']")
	WebElement save;

	public OpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait;

	public void createOpportunity(WebDriver driver) {
		System.out.println("Oppertunity page stared...");
//		wait = new WebDriverWait(driver, 10);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(opportunityButton)); 
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		opportunityButton.click();
		System.out.println("oppertunity button clicked");
		
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(newButton)).click();
//		newButton.click();
		System.out.println("new button clicked");

		opportunityNameField.sendKeys("Production");
		System.out.println("opportunity name entered");
		opportunityNameField.sendKeys(Keys.TAB);

		accountNameField.sendKeys(Keys.ENTER);
		System.out.println("Account name field clicked");

		wait = new WebDriverWait(driver, 20, 500);
		wait.until(ExpectedConditions.visibilityOf(selectedAccountName));
		accountNameField.sendKeys(Keys.ENTER);
		System.out.println("Account list opened");

		closeDate.click();
		closeDate.sendKeys("2/23/2022");
		closeDate.sendKeys(Keys.TAB);
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].setAttribute('value','28/02')", closeDate);
		System.out.println("closed date entered");
		wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOf(stage)); 
//		wait.until(ExpectedConditions.elementToBeClickable(stage));
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(stage));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
//		stage.click();
		System.out.println("stage entered");

		stageSelect.click();
		System.out.println("stage selected");

		save.click();
		System.out.println("save  clicked");
		System.out.println("opportunity script closed");
	}
}
