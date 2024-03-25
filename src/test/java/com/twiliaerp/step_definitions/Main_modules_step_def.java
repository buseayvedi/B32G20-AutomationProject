package com.twiliaerp.step_definitions;

import com.twiliaerp.page.BasePage_US04_manal;
import com.twiliaerp.page.DiscussPage;
import com.twiliaerp.page.LoginPage;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Main_modules_step_def extends LoginPage {

    LoginPage loginPage = new LoginPage();
DiscussPage discussPage = new DiscussPage();

    @When("user logged in to the Twiliaerp application.")
    public void user_logged_in_to_the_twiliaerp_application() {
        Driver.getDriver().get("twiliaerp_URL");
        loginPage.login(ConfigurationReader.getProperty("pos_manager_username"),ConfigurationReader.getProperty("pos_manager_password"));
    }
    @Then("user should land on Discuss page and has access to {int} main modules.")
    public void user_should_land_on_discuss_page_and_has_access_to_main_modules(Integer int1) {
       discussPage.mainModules.get(1).click();
       discussPage.mainModules.get(2).click();
       discussPage.mainModules.get(3).click();
       discussPage.mainModules.get(4).click();
       discussPage.mainModules.get(5).click();
       discussPage.mainModules.get(6).click();
       discussPage.mainModules.get(7).click();
       discussPage.mainModules.get(8).click();
       discussPage.mainModules.get(9).click();
       discussPage.mainModules.get(10).click();
       discussPage.mainModules.get(11).click();
       discussPage.mainModules.get(12).click();
       discussPage.mainModules.get(13).click();
       discussPage.mainModules.get(14).click();
       discussPage.mainModules.get(15).click();
       discussPage.mainModules.get(16).click();
       discussPage.mainModules.get(17).click();
       discussPage.mainModules.get(18).click();
       discussPage.mainModules.get(19).click();
       discussPage.mainModules.get(20).click();
       discussPage.mainModules.get(21).click();
       discussPage.mainModules.get(22).click();

    }












}
