package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtil {

	public static WebElement getElement(String xpath) {
		WebElement ele = waitForElement(xpath);
		return ele;
	}

	public static WebElement waitForElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(DriverClass.driver, 20);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated((By
						.xpath(xpath))));
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
}
