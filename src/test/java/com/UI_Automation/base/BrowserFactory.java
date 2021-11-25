package com.UI_Automation.base;


import com.UI_Automation.utils.PropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/*
* This class helps us to initiate the browsers according the browser which we provide while running the test.
* As of now this contains details about Chrome and Firefox. We can expand it to other browsers if require.
* */
public class BrowserFactory {
    public WebDriver OpenBrowser(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("Chrome")) //Chrome browser
        {
            System.setProperty("webdriver.chrome.driver", "./chromedriver");
            ChromeOptions opt = new ChromeOptions();
           // opt.addArguments("--headless");
            driver = new ChromeDriver(opt);

        } else if (browserName.equalsIgnoreCase("Firefox"))  // Firefox browser
        {
            System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");

            FirefoxOptions opt= new FirefoxOptions();
            driver = new FirefoxDriver(opt);
            driver.manage().window().maximize();
        }
        return driver;
    }
}