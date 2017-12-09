package cucumberTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

	// public static WebDriver driver = new FirefoxDriver();
	public static WebDriver driver;

	public static void browserSlection(String browserName) {

		switch (browserName) {

		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		case "CHROME":
			driver = new ChromeDriver();
			break;
		default:
			System.out.println("No driver found for : " + browserName);
		}

	}

}
