package com.UI_Automation.pages;

import com.UI_Automation.runner.TestRunner;
import com.UI_Automation.utils.PropertyFile;;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

/**
This class contains page factory and selenium methods which are applied on home page.
 */
public class Form_Details extends TestRunner {

    // Home page Page Objects defined.
    @FindBy(id="FirstName") private static WebElement FirstName;
    @FindBy(id="LastName") private static WebElement LastName;
    @FindBy(id="EmailAddress") private static WebElement EmailAddress;
    @FindBy(name="PhoneNumber") private static WebElement PhoneNumber;
    @FindBy(name="BestTimeToCallYou") private static WebElement BestTimeToCallYou;
    @FindBy(id="ReasonForEnquiry") private static WebElement ReasonForEnquiry;


    private WebDriver driver;
    //Instance driver creation
    public Form_Details(WebDriver driver) {
        this.driver=driver;
    }
    //To open the webpage
    public void openPage(){
        driver.get(PropertyFile.envFile().get("ServerUrl"));
        PageFactory.initElements(driver, Form_Details.class);

    }
// To enter the form details in the home page
    public void form_details (String firstName, String lastName, String
        emailaddress, String contactNumber, String timetocall, String reason) throws InterruptedException {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
FirstName.sendKeys(firstName);
LastName.sendKeys(lastName);
EmailAddress.sendKeys(emailaddress);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,350)","");
PhoneNumber.sendKeys(contactNumber);
BestTimeToCallYou.sendKeys(timetocall);
//Select dropDown=new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ReasonForEnquiry"))));
//dropDown.selectByVisibleText(reason);
//driver.findElement(By.id("OptInEmail")).isSelected();
//driver.findElement(By.id("OptInEmail")).click();

/*
        // Code to Handle Static Drop downs
        WebElement StaticDropdown = driver.findElement(By.id("ReasonForEnquiry"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;

                js.executeScript("window.scrollBy(0,350)","");

        Select dropdown = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ReasonForEnquiry"))));
        dropdown.selectByVisibleText(reason);

        System.out.println(driver.findElement(By.id("OptInEmail")).isSelected());
        driver.findElement(By.id("OptInEmail")).click();

        System.out.println(driver.findElement(By.id("OptInEmail")).isSelected());
        Thread.sleep(1000);*/
        PageFactory.initElements(driver, Form_Details.class);

    }
}
