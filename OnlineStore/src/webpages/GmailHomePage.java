package webpages;

import cucumberTest.WebUtil;

public class GmailHomePage {

	String userNameTxtBx = "//*[@id='identifierId']";
	String pwdTxtBx = "//*[@id='password']/div[1]/div/div[1]/input";
	String nextBtn = "//content[@class='CwaK9']/span";
	String errMsg = "//*[@id='password']/div[2]/div[2]";

	public void enterUserName(String username) {
		WebUtil.enterTextBox(userNameTxtBx, username);
		// DriverClass.driver.findElement(By.xpath(userNameTxtBx)).sendKeys(username);
		WebUtil.click(nextBtn);
		// clickNext();
	}

	public void enterPwd(String password) {
		WebUtil.enterTextBox(pwdTxtBx, password);
		WebUtil.click(nextBtn);
	}

	public String verifyErrMsg() {
		return WebUtil.getText(errMsg);

	}

}
