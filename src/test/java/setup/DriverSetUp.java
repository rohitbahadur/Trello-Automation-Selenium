package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ProjectConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {

	/* Initialize WebDriver */

	public static WebDriver browser;

	@BeforeMethod
	public static void openBrowser() {

		Reporter.log("Test initiated ", true);
		/*
		 * WebDriverManager.firefoxdriver().setup(); browser = new FirefoxDriver();
		 * 
		 */

		/* setup ChormeDriver using WebDriverManager */

		WebDriverManager.chromedriver().setup();

		browser = new ChromeDriver();

		Reporter.log("Chrome borwser is launched ", true);

		browser.get(ProjectConfig.prop.getProperty("baseurl"));
		
		Reporter.log("trello home page is launched ", true);

		browser.manage().window().maximize();
	}

	@AfterMethod
	public static void closeBrowser() {

		Reporter.log("Tests Completed", true);

		browser.quit();

		Reporter.log("Browser is quit", true);
	}

}
