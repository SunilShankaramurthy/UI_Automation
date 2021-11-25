package com.UI_Automation.stepdef;

import com.UI_Automation.base.DriverFactory;
import com.UI_Automation.utils.PropertyFile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.UI_Automation.pages.Form_Details;

/**
Stepdefinition class for home page.
 */
public class HomePage_StepDef {

Form_Details form_details=new Form_Details(DriverFactory.getDriver());

    @Given("User is in Contact-us page")
    public void user_is_in_contact_us_page() {
        form_details.openPage();
    }

    @When("User enters the below details in the Request Call back form {string},{string},{string},{string},{string},{string}")
    public void user_enters_the_below_details_in_the_request_call_back_form
            (String FirstName,String Lastname,String Emailaddress,String Contactnumber,String Timetocall,String Reason) throws InterruptedException {
       form_details.form_details(FirstName,Lastname,Emailaddress,Contactnumber,Timetocall,Reason);
    }

    @Then("user should be able to see the entered details in the form")
    public void user_should_be_able_to_see_the_entered_details_in_the_form() {
        // Write code here that turns the phrase above into concrete actions
    }
}
