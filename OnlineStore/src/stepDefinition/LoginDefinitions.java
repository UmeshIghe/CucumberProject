package stepDefinition;

import workflows.LoginPageWorkFlow;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberTest.DriverClass;

public class LoginDefinitions {

//	@After
//	public void tearDown() {
//		
//	}

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
