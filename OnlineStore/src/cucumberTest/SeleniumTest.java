package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	
 
        public void launchBrowser(WebDriver driver) throws InterruptedException{
        	driver.get("http://test-admin.thesaleshuddle.com/admin/login");
        	Thread.sleep(5000);
        	
        }
 public void login(WebDriver driver, String username, String pwd){
        
 
        driver.findElement(By.name("user_name")).sendKeys(username); 

 
        driver.findElement(By.name("password")).sendKeys(pwd);
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
        driver.findElement(By.xpath("html/body/div[1]/form/div/input[3]")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("Login Successfully");
 }
      
 public void logout(WebDriver driver){
 
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("LogOut Successfully");
 
        // Close the driver
 }



}
