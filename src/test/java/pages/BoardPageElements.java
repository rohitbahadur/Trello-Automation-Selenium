
package pages;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.testng.Reporter;

import utils.WaitForPagesToLoad;

public class BoardPageElements extends WaitForPagesToLoad {

	//public static WebElement element = null;

	/* Returns webelement to create new board */
	
	private WebElement createNewBoard() {
		element = browser.findElement(By.xpath("//div[@title='Interest']"));
		return element;
	}

	public void clickOnCreateNewBoardElement() {

		waitForElementToBeClickable(browser, createNewBoard()).click(); //
Reporter.log("CreateNewBoard Element is detected and clicked", true);
	}

	/* returns WebElement to make the board Public/Private */

	private WebElement permissionToMakePrivatePublic() {
		element = browser.findElement(By.xpath("//a[@id=\"permission-level\"]/span[contains(text(),'')]"));
		return element;
	}

	public void clickOnPermissionToMakePrivatePublic() {

		waitForElementToBeClickable(browser, permissionToMakePrivatePublic()).click(); //
		Reporter.log("permissionToMakePrivatePublic Element is detected and clicked", true);
	}

	/* returns WebElement to make the board Public/Private */

	private WebElement changeVisibilityClickPublicButton() {
		element = browser.findElement(By.xpath("//span[@class='icon-sm vis-icon icon-public']"));
		return element;
	}

	public void clickOnchangeVisibilityClickPublicButton() {

		waitForElementToBeClickable(browser, changeVisibilityClickPublicButton()).click(); //
		// browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Reporter.log("changeVisibilityClickPublicButton Element is detected and clicked", true);
	}

	/* returns WebElement to make the board Public/Private */

	private WebElement makeBoardPrivate() {
		element = browser.findElement(By.xpath("//a[@name='private']"));
		return element;
	}

	public void clickOnmakeBoardmakePrivate() {

		waitForElementToBeClickable(browser, makeBoardPrivate()).click(); // //
		browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Reporter.log("makeBoardPrivate Element is detected and clicked", true);
	}

	/* returns WebElement to make the board Public/Private */

	private WebElement makeBoardPublicButton() {
		element = browser.findElement(By.xpath("//button[contains(text(),'Yes, Make Board Public')]"));
		return element;
	}

	public void clickOnmakeBoardPublicButton() {

		waitForElementToBeClickable(browser, makeBoardPublicButton()).click(); // //
		browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Reporter.log("makeBoardPublicButton Element is detected and clicked", true);
	}

}
