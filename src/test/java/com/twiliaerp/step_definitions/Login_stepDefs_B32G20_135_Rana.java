package com.twiliaerp.step_definitions;

import com.twiliaerp.page.LoginPage_B32G20_135_Rana;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_stepDefs_B32G20_135_Rana {


    // login for all users
    LoginPage_B32G20_135_Rana loginPg = new LoginPage_B32G20_135_Rana();

    @Given("user is on the {string} page")
    public void userIsOnThePage(String loginPage) {
        Driver.getDriver().get(loginPage);
    }


    @When("When user enters valid {string}")
    public void whenUserEntersValid(String username) {
        loginPg.usernameInputBox.sendKeys(username);
    }


    @And("user enters valid {string} then click enter")
    public void userEntersValidThenClickEnter(String password) {
        loginPg.passwordInputBox.sendKeys(password + Keys.ENTER);
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Odoo"));
    }


    @When("user enters invalid {string} and valid {string}")
    public void userEntersInvalidAndValid(String username, String password) {
        loginPg.usernameInputBox.sendKeys(username);
        loginPg.passwordInputBox.sendKeys(password + Keys.ENTER);
    }

    @When("user enters valid {string} and invalid {string}")
    public void userEntersValidAndInvalid(String username, String password) {
        loginPg.usernameInputBox.sendKeys(username);
        loginPg.passwordInputBox.sendKeys(password + Keys.ENTER);
    }


    @Then("verify {string} message displayed")
    public void verify_message_displayed(String message) {
        String actualMessage = loginPg.errorMessage.getText();
        Assert.assertEquals(actualMessage, message);
    }

    @When("user gets “Please fill out this field” for blank fields")
    public void userGetsPleaseFillOutThisFieldForBlankFields() {

        String actualUsernameValMessage = loginPg.usernameInputBox.getAttribute("validationMessage");
        String expUsernameValMessage = "Please fill out this field.";
        Assert.assertEquals(actualUsernameValMessage, expUsernameValMessage);

        String actualPasswordValMessage = loginPg.passwordInputBox.getAttribute("validationMessage");
        String expPasswordValMessage = "Please fill out this field.";
        Assert.assertEquals(actualPasswordValMessage, expPasswordValMessage);
    }

}

