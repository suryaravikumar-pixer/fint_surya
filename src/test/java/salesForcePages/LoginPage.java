package salesForcePages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseScripts.BaseLibrary;



public class LoginPage extends BaseLibrary {
@FindBy(xpath = "//a[contains(text(),'Login')]")
private WebElement logInButton;
@FindBy (id = "username")
private WebElement userNameTxtBox;
@FindBy (id = "password")
private WebElement passwordTxtBox;
@FindBy (name = "Login")
private WebElement submitBtn;

public LoginPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void loginFunction() throws Exception 
{
	logInButton.click();
	FileInputStream envfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\env.properties");
	Properties prop = new Properties();
	prop.load(envfile);
	System.out.println("Home page opened");
	System.out.println("Login Button clicked");
	System.out.println("Login credentials entered");
	userNameTxtBox.sendKeys(prop.getProperty("username"));	
	passwordTxtBox.sendKeys(prop.getProperty("password"));
	System.out.println("Submit button clicked");
	submitBtn.click();
}

}