package webpages;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import cucumberTest.WebUtil;

public class GmailHomePage {

	String userNameTxtBx = "//*[@id='identifierId']";
	String pwdTxtBx = "//*[@id='password']/div[1]/div/div[1]/input";
	String nextBtn = "//content[@class='CwaK9']/span";
	String errMsg = "//*[@id='password']/div[2]/div[2]";

	public void enterUserName(String username) {
		try {
			WebUtil.enterTextBox(userNameTxtBx, username);
			WebUtil.click(nextBtn);
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterPwd(String password) {
		try {
			WebUtil.enterTextBox(pwdTxtBx, password);
			WebUtil.click(nextBtn);
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String verifyErrMsg() {
		String msg = null;
		try {
			msg = WebUtil.getText(errMsg);
			WebUtil.takeScreenShot();
		} catch (ElementNotFoundException e) {
			WebUtil.takeScreenShot();
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

}
