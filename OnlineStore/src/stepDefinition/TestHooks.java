package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumberTest.DriverClass;

public class TestHooks {

	WebDriver driver;

	@Before
	public void befoireScenario() {
		String browserName = System.getProperty("browser");
		System.out.println(browserName);
		DriverClass.browserSlection(browserName);
	}

	@After
	public void afterScenario() {
		System.out.println("this is after");
		DriverClass.driver.quit();
	}
}
