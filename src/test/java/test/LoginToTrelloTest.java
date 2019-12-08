package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.TrelloHomePage;
import setup.DriverSetUp;

public class LoginToTrelloTest extends DriverSetUp {

	WebDriver browser;

	@Test(description= "Login to Trello")
	public void testTrelloPageLogin() {

		HomePage homepage = new HomePage();

		TrelloHomePage trelloHomepage = new TrelloHomePage();

		homepage.clickLoginButton();
		trelloHomepage.enterUserName();
		trelloHomepage.enterPassword();
		trelloHomepage.clickOnAtlassianLoginButton();
		trelloHomepage.clickContinueButton();
		trelloHomepage.enterCurrentPassword();
		trelloHomepage.clickLoginButton();

		Assert.assertEquals("Trello", "Trello");

		System.out.println("Browser launched");

	}

	
}