package com.UI_Automation.runner;

import com.UI_Automation.base.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports.html",
                "com.UI_Automation.Listeners.extentReports.CustomReportListener",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                 },
        features = "features/",
        glue= "com.UI_Automation.stepdef",
        monochrome=true
)

public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
    private DriverFactory driverFactory;
    private WebDriver driver;
    public void startTest() throws InterruptedException{
        System.out.println("Test Started");
    }


}
