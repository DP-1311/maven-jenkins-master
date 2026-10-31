package listerners_utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base_utility.BaseClass;
import generic_utility.JavaUtility;

public class List_Imp implements ITestListener {

	ExtentReports report;

	//@Override
	public void onStart(ITestContext context) {
		long time=JavaUtility.getTodaysDateTime();
				
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReportsListeners/" +time+ ".html");
		spark.config().setDocumentTitle("Automation Testing");
		spark.config().setReportName("Automation Test Report");
		spark.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Operating System", "Mac");
	}
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentTest test = report.createTest(result.getName());
		test.log(Status.PASS, result.getName() + " got passed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		ExtentTest test = report.createTest(result.getName());
		test.log(Status.FAIL, result.getName() + " got Failed");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://49.249.29.4:8888/");
		
		TakesScreenshot tks=(TakesScreenshot)driver;  //BaseClass.sdriver;
		String ss=tks.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(ss);
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentTest test = report.createTest(result.getName());
		test.log(Status.SKIP, result.getName() + " got Skipped");
	}

}
