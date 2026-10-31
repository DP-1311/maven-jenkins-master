package learning_advance_reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class loginTest {

	@Test
	public void login() {

	// Will create the html report	
	ExtentSparkReporter spark = new ExtentSparkReporter("./Advance_Reports/advreports.html");
	spark.config().setDocumentTitle("Automation Testing");
	spark.config().setReportName("Automation Test Report");
	spark.config().setTheme(Theme.DARK);
	
	// Manage the Report, used to configure the report
	ExtentReports report=new ExtentReports(); 
	report.attachReporter(spark);
	report.setSystemInfo("Browser", "Chrome");
	report.setSystemInfo("Operating System", "Mac");

	// To Display the Status of the Test Cases
	ExtentTest test = report.createTest("login");
	test.log(Status.PASS, "This is Passed");
	test.log(Status.FAIL, "This is Failed");
	test.log(Status.SKIP, "This is Skipped");
	test.log(Status.WARNING, "This is Warning");
	test.log(Status.INFO, "This is Information");
	
	report.flush(); // without flush Updated report will not get generated
	
	}
	
}
