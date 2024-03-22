package com.twiliaerp.step_definitions;

import com.twiliaerp.page.BasePage_US04_manal;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateEvent_step_def extends BasePage_US04_manal {

    BasePage_US04_manal loginPage = new BasePage_US04_manal();
    BasePage_US04_manal discussPage = new BasePage_US04_manal();
    BasePage_US04_manal calendarPage = new BasePage_US04_manal();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    @Given("user is on the login page of the Twiliaerp application.")
    public void user_is_on_the_login_page_of_the_twiliaerp_application() {
        Driver.getDriver().get("https://qa.twiliaerp.com/web/login");
    }
    @When("user enters the POS Manager username and password.")
    public void user_enters_the_pos_manager_username_and_password() {
        loginPage.login(ConfigurationReader.getProperty("pos_manager_username"), ConfigurationReader.getProperty("pos_manager_password"));
    }
    @Then("user should be able to login and land on the Discuss page.")
    public void user_should_be_able_to_login_and_land_on_the_discuss_page() {
    loginPage.login_Btn.click();

    }


    @When("user go to calendar and clicks on any time box.")
    public void user_go_to_calendar_and_clicks_on_any_time_box() {

    discussPage.calendar_Btn.click();
    }
    @Then("user can create an event.")
    public void user_can_create_an_event() {
    calendarPage.timeBox.click();
    calendarPage.event_input.sendKeys("lunch");
    calendarPage.create_Btn.click();
    }


    @When("user goes to calendar and clicks on created event.")
    public void user_goes_to_calendar_and_clicks_on_any_created_event() {
        calendarPage.created_event.click();
    }
    @Then("user can see details of created event.")
    public void user_can_see_details_of_created_event() {
    calendarPage.event_details.isDisplayed();
    }




}
