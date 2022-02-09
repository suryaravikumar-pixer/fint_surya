package pomSalesFroce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoingPage {
@FindBy (id = "username")
private WebElement userNameTxtBox;
@FindBy (id = "password")
private WebElement passwordTxtBox;
@FindBy (name = "Login")
private WebElement submitBtn;

public LoingPage(WebDriver  driver)
{
	PageFactory.initElements(driver, this);
}

public void loginActivity() throws Exception 
{
	FileInputStream envfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\env.properties");
	Properties prop = new Properties();
	prop.load(envfile);
	
	userNameTxtBox.sendKeys(prop.getProperty("username"));	
	passwordTxtBox.sendKeys("password");
	
	submitBtn.click();
}

}
