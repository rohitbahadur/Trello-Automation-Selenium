package pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import config.ProjectConfig;
import utils.WaitForPagesToLoad;

public class TrelloHomePage extends WaitForPagesToLoad {

	// public static WebElement element = null;

	/* Returns the username element */

	private WebElement userName() {
		element = browser.findElement(By.id("user"));
		return element;
	}

	public void enterUserName() {
		// waitForElementToBeVisible(browser,
		// userName()).sendKeys(ProjectConfig.AccessDetails.userName);

		waitForElementToBeVisible(browser, userName()).sendKeys(ProjectConfig.prop.getProperty("username"));
		// browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Reporter.log("userName Element is detected and userName is entered", true);
	}

	/* Returns the password element */

	public WebElement password() {
		element = browser.findElement(By.id("password"));
		return element;
	}

	public void enterPassword() {
		// waitForElementToBeVisible(browser,
		// password()).sendKeys(ProjectConfig.AccessDetails.passWord);
		waitForElementToBeVisible(browser, password()).sendKeys(ProjectConfig.prop.getProperty("password"));

		Reporter.log("password Element is detected and password is entered", true);
	}

	/* Returns the atlassian button element */

	public WebElement atlassianLoginButton() {
		element = browser.findElement(By.id("login"));
		return element;
	}

	public void clickOnAtlassianLoginButton() {

		waitForElementToBeClickable(browser, atlassianLoginButton()).click();
		browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Reporter.log("atlassianLoginButton Element is detected and clicked", true);
	}

	/* Returns the continue button element */

	private WebElement continueButton() {
		element = browser.findElement(By.xpath("//*[@id=\"login-submit\"]/span/span"));
		return element;
	}

	public void clickContinueButton() {

		waitForElementToBeVisible(browser, continueButton()).click();
		browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		Reporter.log("continueButton Element is detected and clicked", true);
	}

	/* Returns the password element on atlassian page */

	private WebElement currentPassword() {
		element = browser.findElement(By.xpath("//div/input[@id=\"password\"]"));
		return element;
	}

	public void enterCurrentPassword() {

		waitForElementToBeVisible(browser, currentPassword()).sendKeys(ProjectConfig.prop.getProperty("password"));
		// browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		Reporter.log("currentPassword Element is detected and current password is entered", true);
	}

	/* Returns the login button element on atlassian page */

	private WebElement loginButton() {
		element = browser.findElement(By.xpath("//button[@id=\"login-submit\"]/span/span"));
		return element;
	}

	public void clickLoginButton() {

		waitForElementToBeClickable(browser, loginButton()).click();

		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Reporter.log("loginButton Element is detected and clicked", true);
		

		Reporter.log("Verify Title of new window", true);

		Set<String> windows = browser.getWindowHandles();

			for (String window : windows) {
			browser.switchTo().window(window);
			if (browser.getTitle().equals("Trello")) {
				break;

			}

		}

	}

}