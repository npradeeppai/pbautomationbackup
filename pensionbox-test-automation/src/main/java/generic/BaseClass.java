package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@SuppressWarnings("unused")

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports exReports;
    public static ExtentTest testest;
    public static WebDriverUtils wdu;
	@BeforeSuite
	public void initializeExReports(){
        ExtentSparkReporter sparkReporter_All=new ExtentSparkReporter("First.html");
        exReports = new ExtentReports();
        exReports.attachReporter(sparkReporter_All);
        exReports.setSystemInfo("OS",System.getProperty("os.name"));
     }
	
	@BeforeSuite
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        wdu=new WebDriverUtils();
        wdu.waitImplicitTime(driver, 10);
	}
	
	@AfterSuite
	public void generateExReports(){
        exReports.flush();
	}
	@AfterSuite
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
	
	//@BeforeClass
	
	//@AfterClass
	
	//@BeforeTest
	
	//@AfterTest
	
	//@BeforeMethod
	
	//@AfterMethod 
	
}
