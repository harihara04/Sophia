package com.Sindhu.ReuseablePackage;

import org.openqa.selenium.WebElement;

import com.Sindhu.TestBase.ExtentFactory;
import com.aventstack.extentreports.Status;

public class ActionEngine {
	
public void sendkeys_Custom(WebElement element, String fieldName, String valueToBeSent) {
		
		try {
			element.sendKeys(valueToBeSent);
			ExtentFactory.getInstance().getExtent().log(Status.PASS,fieldName+"==> Entered value as :  " + valueToBeSent);
		} catch (Exception e) {
			ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Value enter in field : " +fieldName+" is failed due to exception: " +e);
		}
	}

	
public void click_Custom(WebElement element, String fieldName) {
		
		try {
			element.click();
			ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Clicked Successfully");
		} catch (Exception e) {
			ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Unable to click on field : " +fieldName+" due to exception: " +e);
		}
	}

}
