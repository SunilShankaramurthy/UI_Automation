package com.UI_Automation.base;

import org.openqa.selenium.WebDriver;


/*
This class will set the WebDriver to run the test. It configured with Java Threadlocal
in order to synchronise the parallel sessions created while running the test concurrently.
 */
public class DriverFactory {
   // public WebDriver driver;

    public DriverFactory(){

    }
    public WebDriver driver;
    public static ThreadLocal<WebDriver> localDriver=new ThreadLocal<WebDriver>();
    public static synchronized WebDriver getDriver(){
        return localDriver.get();
    }

    public void setDriver(String browser) throws InterruptedException{
        localDriver.set(new BrowserFactory().OpenBrowser(browser));
        getDriver().manage().deleteAllCookies();
    }

    // To close/ quite the WebDriver after the test.
    public void removeDriver(){
        System.out.println("In removeDriver"+Thread.currentThread().getId());
        localDriver.get().quit();
        localDriver.remove();
    }
/*    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(String browser) {
    //driver = BrowserFactory.OpenBrowser("Chrome");
    driver=BrowserFactory.OpenBrowser(System.getProperty("browser"));
    getDriver().manage().deleteAllCookies();
    getDriver().manage().window().maximize();
}*/
}
