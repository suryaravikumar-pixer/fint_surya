package salesForcePages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AccountsPage{

	@FindBy (xpath = "//span[text()='Accounts']//parent::a/..")
	private WebElement accntBtn;
	@FindBy(xpath="//div[text()='New']//parent::a/..")
	private WebElement newBtn;
	@FindBy(xpath="(//input[@role='combobox'])[3]")
	private WebElement accntField;

	@FindBy(xpath="(//li[@role='presentation'])[3]")
	private WebElement selectAccnt;
	@FindBy(xpath="(//div[@role='listbox']//div[@class='listContent']//ul//li/a)[1]")
	private WebElement myAccount;
	@FindBy(xpath="//button[@title='Save']")
	private WebElement saveBtn;

public AccountsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

WebDriverWait wait;
public void CreateAccount(WebDriver driver) throws InterruptedException{
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(accntBtn)).click();
//	accntBtn.click();
	System.out.println("account btn clicked");
	
	WebDriverWait waitnewBtn = new WebDriverWait(driver,40);
	waitnewBtn.until(ExpectedConditions.elementToBeClickable(newBtn)).click();
//	newBtn.click();
	System.out.println("new btn clicked");
	
	WebDriverWait waitAccountField = new WebDriverWait(driver,30);
	waitAccountField.until(ExpectedConditions.elementToBeClickable(accntField));

	Thread.sleep(4000);

	
	accntField.sendKeys("Ibm");
	accntField.sendKeys(Keys.SPACE);
	accntField.sendKeys(Keys.BACK_SPACE);
	accntField.sendKeys(Keys.ENTER);
	System.out.println("Data entered in account field");

	wait = new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.visibilityOf(selectAccnt)).click();
	System.out.println("expanded");

	System.out.println("child acccount selected");
	saveBtn.click();
	System.out.println("SAaved");
}

}