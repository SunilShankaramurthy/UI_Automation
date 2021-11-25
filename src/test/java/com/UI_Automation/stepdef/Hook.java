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
/**
* Hook file is created to take care of the things to perform before starting the test step and after compliting it.
* LaunchBrowser() method initiates the driver depending on the browser provided in cmd.
* teardown() method takes care of taking screenshot if scenario fails.
* AfterScenario() method closes the browser once the testing is completed.
 */


public class Hook{
    private WebDriver driver;
    public static String scenarioName;
    public static String base64Screenshot;

    @Before(order=0)
    public void launchBrowser() throws InterruptedException {
        System.out.println("***********************************************************************************");
        System.out.println("**                                                                               **");
        System.out.println("**               BDD-TestNG-Cucumber Automation test Started!!!             **");
        System.out.println("**                                                                               **");
        System.out.println("***********************************************************************************");
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