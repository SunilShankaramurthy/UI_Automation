package com.UI_Automation.stepdef;

import com.UI_Automation.base.DriverFactory;
import com.UI_Automation.utils.PropertyFile;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hook{
    private WebDriver driver;
    public static String scenarioName;
    public static String base64Screenshot;

    @Before(order=0)
    public void launchBrowser() throws InterruptedException {
        DriverFactory driverFactory = new DriverFactory();
       driverFactory.setDriver("Chrome");
       driver=DriverFactory.getDriver();
    }

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {

             byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            scenario.attach( screenshot,"image/png", "screenshot"); // ... and embed it in the report.
            //driver.quit();
        }
    }

    @After
    public void AfterScenario(){
        driver.close();
    }
}