package tests;

import lib.CoreTestCase;
import lib.Platform;
import lib.ui.WelcomePageObject;
import org.junit.Test;

public class GetStartedTest extends CoreTestCase {

	@Test
	public void testPassThroughWelcome() {
		if ((Platform.getInstance().isAndroid()) || (Platform.getInstance().isMW())) {
			return;
		}
		WelcomePageObject welcomePage = new WelcomePageObject(driver);

		welcomePage.waitForLearnMoreLink();
		welcomePage.clickNextButton();

		welcomePage.waitForNewWayToExplorerText();
		welcomePage.clickNextButton();

		welcomePage.waitForAddOrEditPreferredLangText();
		welcomePage.clickNextButton();

		welcomePage.waitForLearnMoreAboutDataCollectedText();
		welcomePage.clickGetStartedButton();
	}
}
