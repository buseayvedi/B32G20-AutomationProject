package com.twiliaerp.step_definitions;

import com.twiliaerp.page.LoginPage_US01;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewProductToInventory_StepDef_B32G20_140 {



    @Given("I am on twiliaerp main page")
    public void iAmOnTwiliaerpMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("I log in as a POS Manager")
    public void iLogInAsAPOSManager() {

    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
    }


    @Given("I am logged in as POS Manager")
    public void iAmLoggedInAsPOSManager() {
        String email = "posmanager6@info.com";
        String password = "posmanager";
        LoginPage_US01 loginPage = new LoginPage_US01();
        loginPage.usernameInputBox.sendKeys(email);
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.loginBtn.click();
    }

    @Given("I am on the inventory management page")
    public void iAmOnTheInventoryManagementPage() {


    }
    @When("I add a new product with name {string}")
    public void iAddANewProductWithName(String arg0) {
    }

    @Then("{string} should be added to inventory")
    public void shouldBeAddedToInventory(String arg0) {
    }











}
