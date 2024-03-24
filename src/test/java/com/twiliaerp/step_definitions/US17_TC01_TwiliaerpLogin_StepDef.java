package com.twiliaerp.step_definitions;

import com.twiliaerp.page.US17_TC01_TwiliaerpLoginPage;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US17_TC01_TwiliaerpLogin_StepDef {

    US17_TC01_TwiliaerpLoginPage loginPage = new US17_TC01_TwiliaerpLoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @Given("sales manager is on the login page")
    public void sales_manager_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("twiliaerp_URL"));
    }
    @When("Twiliaerp sales manager login with {string},{string}")
    public void twiliaerp_sales_manager_login_with(String smLogEmail, String smPassword ) {
        loginPage.login(smLogEmail, smPassword );

    }
    @Then("Twiliaerp sales manager should be able to login")
    public void twiliaerp_sales_manager_should_be_able_to_login() {
        wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));

    }

}
