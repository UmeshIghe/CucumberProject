package stepDefinition;

import workflows.LoginPageWorkFlow;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberTest.DriverClass;

public class LoginDefinitions {

	// @Before
	// public void setUp() {
	//
	// DriverClass.driver
	// .get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.co.in%2F%3Fgfe_rd%3Dcr%26ei%3DiYI7WbC2DcukvwSmkosQ%26gws_rd%3Dssl&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	// }

	@After
	public void tearDown() {
		DriverClass.driver.quit();
	}

	LoginPageWorkFlow lpwf = new LoginPageWorkFlow();

	@Given("^user opens gmail login page with url \"([^\"]*)\"$")
	public void user_opens_gmail_login_page_with_url(String url) {
		// Write code here that turns the phrase above into concrete actions
		DriverClass.driver.get(url);
	}

	@Given("^User login with invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_with_invalid_and(String username, String pwd) {
		lpwf.login(username, pwd);
	}

	@Then("^error message \"([^\"]*)\" should be display$")
	public void error_message_should_be_display(String msg) {
		lpwf.assertErrorMsg(msg);
	}

}
