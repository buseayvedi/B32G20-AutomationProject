package com.twiliaerp.step_definitions;

import com.twiliaerp.page.LogOutPage_B32G20_136_Tatiana;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutStepDef_B32G20_136_Tatiana {

    LogOutPage_B32G20_136_Tatiana logOut = new LogOutPage_B32G20_136_Tatiana();


    @When("user click account name tab")
    public void user_click_account_name_tab() {
        logOut.clickAccountName();


    }
    @When("user click log out button")
    public void user_click_log_out_button() {
        logOut.logOut();

    }
    @Then("user should lands on log in page again")
    public void user_should_lands_on_log_in_page_again() {

         String expectedURL = ConfigurationReader.getProperty("env");
         String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);


    }

}
