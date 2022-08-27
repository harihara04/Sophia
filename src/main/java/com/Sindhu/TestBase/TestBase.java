package com.Sindhu.TestBase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Sindhu.ReuseablePackage.ActionEngine;
import com.Sindhu.ReuseablePackage.PropertiesOperation;

public class TestBase extends ActionEngine{
	
	BrowserFactory bf = new BrowserFactory();
	
	
	@BeforeMethod
	public void LaunchInstance() throws Exception {
				
		String browser = PropertiesOperation.getPropertyValueByKey("SBrowser");
		
		System.out.println(browser);
		String Url = PropertiesOperation.getPropertyValueByKey("SUrl");
			
		  
			DriverFactory.getInstance().setDriver(bf.createBrowserInstance(browser));
		
		 
		  // WebDriver driver = DriverFactory.getInstance().getDriver();
		 
		  
			DriverFactory.getInstance().getDriver().manage().window().maximize();
		System.out.println(DriverFactory.getInstance().getDriver());
		  DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		  DriverFactory.getInstance().getDriver().navigate().to(Url);
	}
	
	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
		
		
	}

}
