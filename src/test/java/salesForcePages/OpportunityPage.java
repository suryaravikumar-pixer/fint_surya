package salesForcePages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpportunityPage {
	@FindBy (xpath = "//span[text()='Opportunities']//parent::a/..")
	private WebElement opportunityButton;
	@FindBy (xpath = "//div[text()='New']")
	private WebElement newButton;
	@FindBy (xpath = "//input[@name='Name']")
	private WebElement opportunityNameField;
	@FindBy (xpath = "(//input[@role='combobox'])[3]")
	private WebElement accountNameField;
	@FindBy (xpath="//ul[@role='group']/li[2]/lightning-base-combobox-item")
	private WebElement selectedAccountName;
	@FindBy(xpath="//input[@name='CloseDate']")
	WebElement  closeDate;
	@FindBy(xpath="(//input[@aria-readonly='true'])[2]")
	WebElement stage;
	@FindBy(xpath="(//div[@role='listbox'])[4]/lightning-base-combobox-item[3]")
	WebElement stageSelect;			
	@FindBy(xpath="//button[@name='SaveEdit']")
	WebElement save;
	public OpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	WebDriverWait wait;
	public void createOpportunity(WebDriver driver) {
		System.out.println("Oppertunity page stared...");
		opportunityButton.click();
		System.out.println("");
		newButton.click();
		System.out.println("");
		
		
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
		System.out.println("closed date entered");
		stage.click();
		System.out.println("stage entered");
		stageSelect.click();
		System.out.println("stage selected");
		save.click();
		System.out.println("save  clicked");
		System.out.println("opportunity script closed");
	}
}
	
