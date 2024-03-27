package com.twiliaerp.step_definitions;

import com.twiliaerp.page.BasePage_US04_manal;
import com.twiliaerp.page.DiscussPage;
import com.twiliaerp.page.LoginPage;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Main_modules_step_def  {

    LoginPage loginPage = new LoginPage();
DiscussPage discussPage = new DiscussPage();

WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));



    @When("user logged in to the Twiliaerp application with posmanager credentials")
    public void user_logged_in_to_the_twiliaerp_application_with_posmanager_credentials() {
        Driver.getDriver().get("env");
        loginPage.login(ConfigurationReader.getProperty("POS_username"),ConfigurationReader.getProperty("POS_password"));

    }



    @Then("user should land on Discuss page and has access to the following modules.")
    public void user_should_land_on_discuss_page_and_has_access_to_the_following_modules(List<String>  expectedMainModules)  {
     wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));

        List<String> actualMainModules = new ArrayList<>();

        for (WebElement eachMainModule : discussPage.mainModules) {
            actualMainModules.add(eachMainModule.getText());
        }

        Assert.assertEquals(expectedMainModules,actualMainModules);

    }










}












