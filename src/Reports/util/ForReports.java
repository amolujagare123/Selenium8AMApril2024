package Reports.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForReports {

    public static String browserScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign current driver to it. type cast it to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(srcFile,new File("Report\\screenshots\\"+fileName));

        return fileName;

    }

    public static ExtentReports initExtentObject()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Dev Name","Mahesh");
        extent.setSystemInfo("Testers Name","Madhavi");
        extent.setSystemInfo("type of testing","Regression Testing");
        extent.setSystemInfo("Project name","Stock Management");
        extent.setSystemInfo("Description","This software efficiently tracks inventory levels, manages stock orders, and optimizes supply chain operations for businesses.");
        extent.setSystemInfo("version","ver1.501");
        extent.setSystemInfo("Module name","Customer");
        extent.setSystemInfo("OS","Windows 10");
        extent.setSystemInfo("Browser","Chrome");

        return extent;
    }
}
