package genericScripts;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pomSalesFroce.HomePage;
import pomSalesFroce.LoingPage;

public class BaseLib {
	public WebDriver wdriver;
	public EventFiringWebDriver driver;
	public FileInputStream file1;
	public Properties prop1;
		
	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser) throws Exception
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-popup-blocking");
		options.addArguments("disable-extensions");
		options.addArguments("--disable-notifications");
//		ChromeDriver driver = new ChromeDriver(options);
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
		wdriver = new ChromeDriver(options);
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\geckodriver.exe");
					wdriver=new FirefoxDriver();
		}
		driver=new EventFiringWebDriver(wdriver);
//		wdriver.manage().window().maximize();
		Thread.sleep(2000);
		file1=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\env.properties");
		prop1 = new Properties();
		prop1.load(file1);
		driver.get(prop1.getProperty("url1"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(prop1.getProperty("username"));
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys(prop1.getProperty("password"));
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("Login")).click();

}
@AfterTest	
public void closeBrowser()
{
	
wdriver.quit();
}
}
