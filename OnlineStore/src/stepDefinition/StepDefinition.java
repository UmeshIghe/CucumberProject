package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberTest.SeleniumTest;

public class StepDefinition extends SeleniumTest {

	public WebDriver driver;

//	@Before
//	public void setUp() {
//		driver = new FirefoxDriver();
//	}

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		launchBrowser(driver);

	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void I_enter_Username_as_and_Password_as(String username, String pwd) {
		login(driver, username, pwd);

	}

	@Then("^User goes to Sales Huddle page$")
	public void message_displayed_Login_Successfully() throws Throwable {
		assertEquals("Sales Huddle", driver.getTitle());

	}

//	@After
//	public void cleanUp() {
//		driver.close();
//	}
}
