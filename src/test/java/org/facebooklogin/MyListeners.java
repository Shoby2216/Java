package org.facebooklogin;

import java.io.IOException;

import org.base.utils.BaseClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class MyListeners extends BaseClass implements ITestListener, IRetryAnalyzer{
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test passed").getClass().getName();
		//test.pass("Test passed").getClass().getName();
	}

	@Override
	public void onTestFailure(ITestResult result) {
			
			
				try {
					test.log(Status.FAIL, "fail with screenshot", MediaEntityBuilder.createScreenCaptureFromPath(addScreenshot()).build()).getClass().getName();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					test.log(Status.INFO, result.getThrowable().getMessage());
				}
			
			//reportStatus("fail with screenshot", "not correct page");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, "Test skipped").getClass().getName();
		test.log(Status.INFO, result.getThrowable().getMessage());
	}

	int retryCount=0;
	int maxRetryCount=3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(retryCount<maxRetryCount) {
			retryCount++;
			return true;
		}
		
		return false;
	}
	
	
	/*
	 * @Override public void onTestFailedButWithinSuccessPercentage(ITestResult
	 * result) { System.out.println("on test sucess failerpercentage " +
	 * result.getName()); }
	 * 
	 * 
	 * 
	 * @Override public void onFinish(ITestContext context) {
	 * System.out.println("on test finish " + context.getName()); }
	 */
	
}
