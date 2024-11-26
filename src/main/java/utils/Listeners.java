package utils;

import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class Listeners implements ITestListener {

    public void onTestFailure(ITestResult result) {
        String file = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + result.getMethod().getMethodName() + ".png";
        File f1 = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(f1, new File(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
