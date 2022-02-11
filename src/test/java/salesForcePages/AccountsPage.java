package salesForcePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseScripts.BaseLibrary;

public class AccountsPage extends BaseLibrary{

	@FindBy (xpath = "//span[text()='Accounts']//parent::a/..")
	 WebElement accntBtn;
	@FindBy(xpath="//div[text()='New']//parent::a/..")
	WebElement newBtn;
	@FindBy(xpath="(//input[@role='combobox'])[3]")
	WebElement accntField;
	@FindBy(xpath="(//ul[@role='presentation'])[5]//child::li[2]")
	WebElement selectAccnt;
	@FindBy(xpath="//button[@title='Save']")
	WebElement saveBtn;

public AccountsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
//	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
}


public void CreateAccount(WebDriver driver){
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(accntBtn)).click();
//	accntBtn.click();
	System.out.println("account btn clicked");
	WebDriverWait waitnewBtn = new WebDriverWait(driver,40);
	waitnewBtn.until(ExpectedConditions.elementToBeClickable(newBtn)).click();
//	newBtn.click();
	WebDriverWait waitAccountField = new WebDriverWait(driver,20);
	waitAccountField.until(ExpectedConditions.elementToBeClickable(accntField)).click();
	System.out.println("new btn clicked");
//	accntField.clear();
	accntField.sendKeys("apple");
//	accntField.click();
	
//	WebDriverWait wait2 = new WebDriverWait(driver,30);
//	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='listContent'])[2]")));
//	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@role='presentation']")));
//	accntField.sendKeys(Keys.SPACE);
	
	System.out.println("expanded");
	WebDriverWait waitSelectAccountList = new WebDriverWait(driver,30);
	waitSelectAccountList.until(ExpectedConditions.elementToBeClickable(selectAccnt)).click();
//			(selectAccnt)).click();
//	selectAccnt.click();
	System.out.println("child acccount selected");
	saveBtn.click();
	System.out.println("SAaved");
}

}