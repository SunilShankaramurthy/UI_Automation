package com.UI_Automation.base;

import org.openqa.selenium.WebDriver;

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
