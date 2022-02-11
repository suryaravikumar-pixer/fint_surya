package baseScripts;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseLibrary {
	public WebDriver driver;
//	public EventFiringWebDriver driver;
	public FileInputStream file1;
	public Properties prop1;
		
	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser) throws Exception
	{
		// chrome options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\geckodriver.exe");
					driver=new FirefoxDriver();
		}
//		driver=new EventFiringWebDriver(driver);
		file1=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\env.properties");
		prop1 = new Properties();
		prop1.load(file1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop1.getProperty("url1"));

}
@AfterTest	
public void closeBrowser()
{
	
driver.quit();
}
}
