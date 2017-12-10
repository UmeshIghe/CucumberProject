package cucumberTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtil {
	static String path = "C:\\Users\\Umesh\\git\\OnlineStore\\OnlineStore\\resources\\ScrShot\\";

	public static WebElement getElement(String xpath) {
		WebElement ele = waitForElement(xpath);
		return ele;
	}

	public static WebElement waitForElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(DriverClass.driver, 20);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated((By.xpath(xpath))));
		return element;
	}

	public static void enterTextBox(String xpath, String textData) {
		getElement(xpath).sendKeys(textData);
	}

	public static void click(String xpath) {
		getElement(xpath).click();
	}

	public static String getText(String xpath) {
		return getElement(xpath).getText();
	}

	public static void launchBrowser(String url) {
		DriverClass.driver.get(url);
		DriverClass.driver.manage().timeouts()
				.pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	public static void takeScreenShot() {

		File file = ((TakesScreenshot) DriverClass.driver)
				.getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(file, new File(path.toString() + File.separator
					+ timeStamp() + ".jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String timeStamp() {
		Date d = new Date();
		String timeStamp = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss")
				.format(d);
		return timeStamp;
	}
}
