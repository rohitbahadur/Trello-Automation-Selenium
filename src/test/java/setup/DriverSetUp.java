package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ProjectConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {

	/* Initialize WebDriver */
	
	public static WebDriver browser;

	@BeforeMethod
	public static void openBrowser() {

		/*
		 * WebDriverManager.firefoxdriver().setup(); browser = new FirefoxDriver();
		 * 
		 */

		/* setup ChormeDriver using WebDriverManager */

		WebDriverManager.chromedriver().setup();

		/* Create an object Webdriver for Chrome */

		browser = new ChromeDriver();
		browser.get(ProjectConfig.prop.getProperty("baseurl"));
		browser.manage().window().maximize();
	}

	@AfterMethod
	public static void closeBrowser() {

		browser.quit();
	}
}
