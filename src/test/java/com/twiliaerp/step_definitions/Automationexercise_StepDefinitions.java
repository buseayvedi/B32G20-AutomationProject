package com.twiliaerp.step_definitions;

import com.twiliaerp.page.BasePage_US01_Buse;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class Automationexercise_StepDefinitions {
    BasePage_US01_Buse page = new BasePage_US01_Buse();

    @Given("User is on the login page of the application")
    public void user_is_on_the_login_page_of_the_application() {
        Driver.getDriver().get("https://qa.twiliaerp.com/web/login");
    }

    @When("user enters valid \\{username} and \\{password}")
    public void userEntersValidUsernameAndPassword() {
        page.usernameInputBox.sendKeys("posmanager12@info.com");
        page.passwordInputBox.sendKeys("posmanager" + Keys.ENTER);
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Odoo"));
    }

}
