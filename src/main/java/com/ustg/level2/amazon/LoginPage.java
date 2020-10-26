package com.ustg.level2.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(className="nav-line-2 nav-long-width")
	private WebElement btn_Signin;
	
	@FindBy(id="ap_email")
	private WebElement txt_mblnumber;
	
	@FindBy(id="continue")
	private WebElement btn_continue;

	@FindBy(id="ap_password")
	private WebElement txt_password;
	
	@FindBy(id="signInSubmit")
	private WebElement btn_login;

	 WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
			
	public void enterusername(String text) {
		txt_mblnumber.sendKeys(text);
    }
	
	
	 public void clickContinue() {
		 btn_continue.click();
	 }

    public void enterpassword(String text) {
        txt_password.sendKeys(text);
    }

    public void clickLogin() {
        btn_login.click();
    }
	
	
    public HomePage validLogin(String username,String password) {
    	enterusername(username);
    	enterpassword(password);
    	clickLogin();
    	HomePage hmpage = new HomePage(driver);
    	return hmpage;
    }

    
}

