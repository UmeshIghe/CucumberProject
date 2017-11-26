package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OperaionsStepDef {
	int c;

	@Given("^user wants to do addition of \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_wants_to_do_addition(int a, int b) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		c = a + b;
	}

	@Then("^addition should be \"([^\"]*)\"$")
	public void addition_should_be(int sum) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(sum == c);
	}

	@Then("^addition should not be \"([^\"]*)\"$")
	public void addition_should_not_be(int sum) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertFalse(sum == c);
	}

	@Given("^user wants to do addition of (\\d+) and (\\d+)$")
	public void wants_to_do_addition_of_and(int arg1, int arg2)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		c = arg1 + arg2;
	}

	@Then("^addition should be (\\d+)$")
	public void addition_should(int sum) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(sum == c);
	}
}
