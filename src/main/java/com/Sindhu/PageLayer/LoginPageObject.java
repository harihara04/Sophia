package com.Sindhu.PageLayer;

import org.openqa.selenium.By;

import com.Sindhu.TestBase.DriverFactory;
import com.Sindhu.TestBase.TestBase;

public class LoginPageObject extends TestBase{
	
	By Login_Name = By.id("login");
	By Login_Pass = By.name("tl_password");
	By Login_Button = By.name("login_submit");
	
	
	public void Login(String Username, String Password) {
		
		  sendkeys_Custom(DriverFactory.getInstance().getDriver().findElement(Login_Name), "Login Name Field", Username);
		  sendkeys_Custom(DriverFactory.getInstance().getDriver().findElement(Login_Pass), "Login Password Field", Password);
		  click_Custom(DriverFactory.getInstance().getDriver().findElement(Login_Button), "Login Button");
		
	}

}
