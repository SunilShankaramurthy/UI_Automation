package com.UI_Automation.base;


import com.UI_Automation.utils.PropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {
    public WebDriver OpenBrowser(String browserName) {
        WebDriver driver = null;
       // browserName=PropertyFile.envFile().get("Browser");
        if (browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "./chromedriver");
            ChromeOptions opt = new ChromeOptions();
           // opt.addArguments("--headless");
            driver = new ChromeDriver(opt);

        } else if (browserName.equalsIgnoreCase("Firefox"))
        {
            //browserName.equalsIgnoreCase("Firefox"));
            System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");

            FirefoxOptions opt= new FirefoxOptions();
            driver = new FirefoxDriver(opt);
            driver.manage().window().maximize();
        }
        return driver;
    }
}