package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BoardPageElements;
import pages.HomePage;
import pages.TrelloHomePage;
import setup.DriverSetUp;

class ActionsOnBoardPageToPrivateTests extends DriverSetUp {

	WebDriver browser;
	
	BoardPageElements boardPage = new BoardPageElements();
	
	TrelloHomePage trelloHomepage = new TrelloHomePage();
	
	HomePage homepage = new HomePage();
	
	@Test(description ="Actions performed on Trello Board Page")
	public void createNewBoard() throws InterruptedException {

		/* Create and instance of Home Page */
		
	

		/* Create and instance of TrelloHomePage */
		
		

		/******************** Strings to be used for page asserstions********************/
		String trelloHomePageTitle = DriverSetUp.browser.getTitle();
		
		String expectedTitle = "Trello";
		
		/************** Actions performed on the pages ***************/
		
		homepage.clickLoginButton();
		trelloHomepage.enterUserName();
		trelloHomepage.enterPassword();
		trelloHomepage.clickOnAtlassianLoginButton();
		trelloHomepage.clickContinueButton();
		trelloHomepage.enterCurrentPassword();
		trelloHomepage.clickLoginButton();
		
		
		boardPage.clickOnCreateNewBoardElement();
		//Thread.sleep(5000); // have included this just to make a view of  the page.
		
		boardPage.clickOnPermissionToMakePrivatePublic();
		//Thread.sleep(5000); // have included this just to make a view of  the page that Public Page has been made Private
		
		boardPage.clickOnchangeVisibilityClickPublicButton();
		//boardPage.clickOnmakeBoardmakePrivate();
		//Thread.sleep(5000); // have included this just to make a view of  the page that Public Page has been made Private
		
		
		Assert.assertEquals(trelloHomePageTitle, expectedTitle);
		
	}
}