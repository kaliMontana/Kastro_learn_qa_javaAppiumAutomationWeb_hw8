package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

public class AuthorizationPageObject extends MainPageObject {
	private static final String
			LOGIN_BUTTON = "xpath://body//div/a[text()='Log in']",
			LOGIN_INPUT = "css:input[name='wpName']",
			PASSWORD_INPUT = "css:input[name='wpPassword']",
			SUBMIT_INPUT = "css:button#wpLoginAttempt";

	public AuthorizationPageObject(RemoteWebDriver driver) {
		super(driver);
	}

	public void clickAuthButton() {
		this.waitForElementPresent(LOGIN_BUTTON, "Cannot find auth button", 5);
		//this.waitForElementAndClick(LOGIN_BUTTON, "Cannot find and click auth button", 10);
		this.tryClickElementWithFewAttempts(LOGIN_BUTTON, "Cannot find and click auth button", 10);
	}

	public void enterLoginData(String login, String password) {
		this.waitForElementAndSendKeys(LOGIN_INPUT, login, "Cannot find and put a login to the login input", 5);
		this.waitForElementAndSendKeys(PASSWORD_INPUT, password, "Cannot find and put a password to the password input", 5);
	}

	public void submitFrom() {
		this.waitForElementAndClick(SUBMIT_INPUT, "Cannot find and click submit auth button", 5);
	}
}