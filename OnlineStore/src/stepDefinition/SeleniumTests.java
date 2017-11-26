package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTests {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");

		String han = driver.getWindowHandle();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Select sel = new Select(driver.findElement(By
		// .xpath("//*[@id='searchDropdownBox']")));
		// for (WebElement el : sel.getOptions()) {
		//
		// System.out.println(el.getText());
		//
		// }
		// sel.selectByVisibleText("Electronics");

		WebElement serachTx = driver.findElement(By
				.xpath("//*[@id='twotabsearchtextbox']"));

		serachTx.sendKeys("mobile");

		WebElement serachBtn = driver.findElement(By
				.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
		serachBtn.click();
	}

}
