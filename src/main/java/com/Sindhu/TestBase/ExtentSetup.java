package com.Sindhu.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.Sindhu.ReuseablePackage.PropertiesOperation;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentSetup {
	
static ExtentReports extent;
	
	public static ExtentReports setupExtentReport() throws Exception {
		
		SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy HH.mm.ss");
		Date date = new Date();
		String actualDate = format.format(date);
		String reportPath = System.getProperty("user.dir")+"/ExtentReports/ExecutionReport_"+actualDate+".html";
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		
		sparkReport.config().setDocumentTitle("Execution Report");
		sparkReport.config().setTheme(Theme.STANDARD);
		sparkReport.config().setReportName("Test Link Execution Report");
		
		extent.setSystemInfo("Executed on Environment", PropertiesOperation.getPropertyValueByKey("SUrl"));
		extent.setSystemInfo("Executed on Browser", PropertiesOperation.getPropertyValueByKey("SBrowser"));
		extent.setSystemInfo("Executed on OS", System.getProperty("os.name"));
		extent.setSystemInfo("Executed on OS", System.getProperty("user.name"));
		
		return extent;
		
	}

}
