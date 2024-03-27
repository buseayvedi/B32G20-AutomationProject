package com.twiliaerp.step_definitions;

import com.twiliaerp.page.*;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateEvent_step_def  {

    LoginPage loginPage = new LoginPage();
    DiscussPage discussPage = new DiscussPage();
    CalendarPage calendarPage = new CalendarPage();
    EventInputPage event_input_page = new EventInputPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    @Given("user is already logged in to the Twiliaerp application and landed on the discuss page.")
    public void user_is_already_logged_in_to_the_twiliaerp_application_and_landed_on_the_discuss_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("twiliaerp_URL"));
        loginPage.login(ConfigurationReader.getProperty("pos_manager_username"),ConfigurationReader.getProperty("pos_manager_password"));
    }
    @When("user go to calendar and clicks on any time box.")
    public void user_go_to_calendar_and_clicks_on_any_time_box() {

    discussPage.calendar_Btn.click();

        calendarPage.timeBox.click();
        calendarPage.event_input_page.isDisplayed();
    }
    @Then("user can create an event.")
    public void user_can_create_an_event() {

        event_input_page.event_input.click();
        event_input_page.event_input.sendKeys("lunch");
        event_input_page.create_Btn.click();
    }


    @When("user goes to calendar and clicks on created event.")
    public void user_goes_to_calendar_and_clicks_on_any_created_event() {
        discussPage.calendar_Btn.click();
        calendarPage.created_event.click();
    }
    @Then("user can see details of created event.")
    public void user_can_see_details_of_created_event() {

        calendarPage.event_details.isDisplayed();
    }




}
