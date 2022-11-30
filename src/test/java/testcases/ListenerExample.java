package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample  implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("********** The test has started ******************");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("********** The test has succeded ******************");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("Screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
