package workflows;

import junit.framework.Assert;
import webpages.GmailHomePage;

public class LoginPageWorkFlow {
	// GmailHomePage gmail = PageFactory.initElements(DriverClass.driver,
	// GmailHomePage.class);
	GmailHomePage gmail = new GmailHomePage();

	public void login(String username, String pwd) {

		gmail.enterUserName(username);
		gmail.enterPwd(pwd);
	}

	public void assertErrorMsg(String message) {

		Assert.assertEquals(message, gmail.verifyErrMsg());

	}

}
