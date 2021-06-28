package com.course.testng.groups;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * @author KyrianSun
 * @create 2021-06-27 22:19
 */
public class TestNGListenerScreenShot extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        takeScreen(tr);
    }
    private void takeScreen(ITestResult tr){
        BaseDriver b = (BaseDriver)tr.getInstance();
        b.takeScreenShot();
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
super.onTestSkipped(tr);
    }
}
