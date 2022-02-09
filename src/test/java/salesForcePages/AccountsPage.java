package salesForcePages;

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

	@FindBy (xpath = "//span[text()='Accounts']//parent::a/..")
	 WebElement accntBtn;
	@FindBy(xpath="//div[text()='New']//parent::a/..")
	WebElement newBtn;
	@FindBy(xpath="(//input[@role='combobox'])[3]")
	WebElement accntField;
	@FindBy(xpath="(//ul[@role='presentation'])[5]//child::li[1]")
	WebElement selectAccnt;
	@FindBy(xpath="//button[@title='Save']")
	WebElement saveBtn;

public AccountsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public void CreateAccount(WebDriver driver) throws Exception {
	accntBtn.click();
	newBtn.click();
	Thread.sleep(5000);
	accntField.sendKeys("js");
	selectAccnt.click();
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	saveBtn.click();
}

}