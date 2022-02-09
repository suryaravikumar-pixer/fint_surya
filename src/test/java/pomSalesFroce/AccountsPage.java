package pomSalesFroce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountsPage {
//	@FindBy (xpath = "//a[@title='Accounts']")
//	private WebElement AccntBtn;
//	@FindBy (className = "slds-icon-utility-add slds-icon-text-default slds-m-right--x-small slds-shrink-none slds-icon_container")
//	private WebElement newBtn;
//	@FindBy (xpath = "//div[@class='autocompleteWrapper slds-grow']/input[1]")

	@FindBy (xpath = "//span[text()='Accounts']//parent::a/..")
	 WebElement accntBtn;
	@FindBy(xpath="//div[text()='New']//parent::a/..")
	WebElement newBtn;
//	//@FindBy(xpath="//input[@class='default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup']//parent::div/..")
	//@FindBy(xpath="//input[@class='default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup']")
	@FindBy(xpath="(//input[@role='combobox'])[3]")
	WebElement accntField;
	@FindBy(xpath="(//ul[@role='presentation'])[5]//child::li[1]")
//	@FindBy(xpath="//div[@title='Tata Motors Ltd']")
	WebElement selectAccnt;
//	@FindBy(xpath="(//span[text()='Save'])[2]")
	@FindBy(xpath="//button[@title='Save']")
	WebElement saveBtn;

public AccountsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public void CreateAccount(WebDriver driver) throws Exception {
	accntBtn.click();
	newBtn.click();
//	WebDriverWait wait = new WebDriverWait(driver, 15);
//	wait.until(ExpectedConditions.elementToBeClickable(accntField));
//	accntField.click();
//	.switchTo().alert().dismiss();
	Thread.sleep(5000);
	accntField.sendKeys("js");
	selectAccnt.click();
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	saveBtn.click();
}



//By accntBtn = By.xpath("//a[@title='Accounts']");
//public void CeateAccournt(WebDriver driver)
//{
//
//
////	driver.findElement(accntBtn).click();
//	//AccntBtn.click();
//	System.out.println("Acclount btn clicked");
////	newBtn.click();
//	
//}

}