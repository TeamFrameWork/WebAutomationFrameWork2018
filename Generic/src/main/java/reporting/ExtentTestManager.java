package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {

    /*static Map<Integer, ExtentTest> extentTestMap = new HashMap();
    private static ExtentReports extent = ExtentManager.getInstance();
    private static ExtentReports extentUpdate = ExtentManager.getInstance();

    public ExtentTestManager() {
    }

    public static synchronized ExtentTest getTest() {
        return (ExtentTest)extentTestMap.get((int)Thread.currentThread().getId());
    }

    public static synchronized void endTest() {
        extent.endTest((ExtentTest)extentTestMap.get((int)Thread.currentThread().getId()));
    }

    public static synchronized ExtentTest startTest(String testName) {
        return startTest(testName, "");
    }

    public static synchronized ExtentTest startTestClass(String className, String testName) {
        return startTest(className, testName, "");
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = extent.startTest(testName, desc);
        extentTestMap.put((int)Thread.currentThread().getId(), test);
        return test;
    }

    public static synchronized ExtentTest startTest(String className, String testName, String desc) {
        ExtentTest test = extentUpdate.startTest(testName, desc);
        extentTestMap.put((int)Thread.currentThread().getId(), test);
        return test;
    }*/

}
