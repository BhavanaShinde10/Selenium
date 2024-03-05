package commonUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener{
	ExtentReports report;
	

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"TestScript execution is started",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"TestScript execution is passed",true);
		//Test
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String message=result.getThrowable().toString();
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"TestScript execution is failed"+message,true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"TestScript execution is skipped",true);
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"TestScript execution is started",true);
	}

	//@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"TestScript execution is started",true);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//String methodName = result.getMethod().getMethodName();
		JavaUtil jutil= new JavaUtil();
		Reporter.log("To start the execution",true);
		//Use ExtentSparkReporter class just to configure extent report
		//Create object of ExtentSparkReporter
		ExtentSparkReporter reporter= new ExtentSparkReporter("./extentreport/report"+jutil.getRandomNumber()+".html");
		reporter.config().setDocumentTitle("vtigercrm");
		//To generate the theme for file
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Bhavana");
		//USe ExtentReports class to generate ExtentReports,Create the object of ExtentReports class
		 report = new ExtentReports();
		report.attachReporter(reporter);
		//We can access os,browser from this method
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Chromeversion", "122");
		report.setSystemInfo("Author", "Bhavana");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//String methodName = result.getMethod().getMethodName();
		Reporter.log("To finish the execution",true);
		report.flush();
		
	}

}
