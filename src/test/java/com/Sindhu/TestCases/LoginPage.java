package com.Sindhu.TestCases;

import org.testng.annotations.Test;

import com.Sindhu.PageLayer.LoginPageObject;
import com.Sindhu.TestBase.TestBase;

public class LoginPage extends TestBase{

LoginPageObject lpo = new LoginPageObject();
	
	@Test
	
	public void TestCase1() throws InterruptedException {
		
		lpo.Login("hari", "hari123");
		
		/*
		 * MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		 * MyLogger.info("Test Execution Started Test Case 2");
		 */
		
		
		
		 
		 
	}
	@Test
	
	public void TestCase2() throws InterruptedException{
		
		lpo.Login("hari", "hari123");
		
		/*
		 * MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		 * MyLogger.info("Test Execution Started Test Case 2");
		 */
		
	}
}
