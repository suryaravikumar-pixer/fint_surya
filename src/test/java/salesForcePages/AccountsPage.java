package salesForcePages;


import org.openqa.selenium.By;
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
//	@FindBy(xpath="(//ul[@role='presentation'])[5]//child::li[2]")
//	@FindBy(xpath="(//a[@role='option'])[1]")
	@FindBy(xpath="//div[@class='listContent']/ul/li[1]")
	private WebElement selectAccnt;
	@FindBy(xpath="//button[@title='Save']")
	private WebElement saveBtn;

public AccountsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


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
	accntField.clear();
	Thread.sleep(5000);
	accntField.sendKeys("hsbc");
//	accntField.sendKeys(Keys.ENTER);
//	accntField.sendKeys(Keys.ARROW_DOWN);
	accntField.click();
	accntField.clear();
	accntField.sendKeys("tesla");
	
//	WebDriverWait wait2 = new WebDriverWait(driver,50);
//	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='listContent'])[2]")));
//	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='listContent']")));
//	accntField.sendKeys(Keys.SPACE);
	Thread.sleep(5000);
	WebDriverWait waitSelectAccountList = new WebDriverWait(driver, 120);
	waitSelectAccountList.until(ExpectedConditions.elementToBeClickable(selectAccnt)).click();
//	waitSelectAccountList.until(ExpectedConditions.visibilityOf(selectAccnt)).click();
	System.out.println("expanded");
//			(selectAccnt)).click();
//	selectAccnt.click();
	System.out.println("child acccount selected");
	saveBtn.click();
	System.out.println("SAaved");
}

}