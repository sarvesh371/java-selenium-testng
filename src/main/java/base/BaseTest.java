package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import utils.Constants;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {


    public static WebDriver driver;
    public ExtentReports extent;
    public ExtentSparkReporter spark;
    public ExtentTest logger;

    @BeforeTest
    public void beforeTest(){
        spark = new ExtentSparkReporter(System.getProperty("user.dir")+ File.separator+"reports"+File.separator+"test-report.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);

    }

    @AfterTest
    public void afterTest(){
        extent.flush();
    }

    @BeforeMethod
    @Parameters("browser")
    public void beforeMethod(String browser, Method method){
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new FirefoxDriver();
        }
        driver.get(Constants.url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.TIMEOUT));
        logger = extent.createTest(method.getName());
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

}
