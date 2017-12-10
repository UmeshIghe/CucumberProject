package TestNgScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webpages.GmailHomePage;
import cucumberTest.DriverClass;
import cucumberTest.WebUtil;

public class SeleniumTestNg {
	String gmailUrl = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	GmailHomePage gmailHomePage = new GmailHomePage();

	@BeforeMethod
	public void beforeMethod() {
		String browserName = System.getProperty("browser");
		System.out.println(browserName);
		DriverClass.browserSlection(browserName);
	}

	@Test
	public void gmailLogin() {
		WebUtil.launchBrowser(gmailUrl);
		gmailHomePage.enterUserName("umeshghe");
		gmailHomePage.enterPwd("5464");
		Assert.assertEquals(gmailHomePage.verifyErrMsg(),
				"Wrong password. Try again or click Forgot password to reset it.");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after");
		DriverClass.driver.quit();
	}

}
