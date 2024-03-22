package com.twiliaerp.step_definitions;

import com.twiliaerp.page.LoginPage_B32G20_135_Rana;
import com.twiliaerp.page.SalesPageNavigation_B32G20_145_Rana;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ManagersQuotationsSelectAll_B32G20_145_StepDefs_Rana {

    LoginPage_B32G20_135_Rana login = new LoginPage_B32G20_135_Rana();
    SalesPageNavigation_B32G20_145_Rana salesPageNavigation = new SalesPageNavigation_B32G20_145_Rana();

    @Given("Given user is on {string} page")
    public void givenUserIsOnPage(String loginPage) {
        Driver.getDriver().get(loginPage);
    }

    @When("user enters valid {string}")
    public void userEntersValid(String username) {
        login.usernameInputBox.sendKeys(username);
    }

    @And("user enters valid {string} and click enter")
    public void userEntersValidAndClickEnter(String password) {
        login.passwordInputBox.sendKeys(password + Keys.ENTER);
    }

    @When("user click on sales page")
    public void userClickOnSalesPage() {
        salesPageNavigation.SalesMenuOption.click();
    }

    @And("user check all quotations checkBox")
    public void userCheckAllQuotationsCheckBox() {
        salesPageNavigation.selectAllCheckBox.click();
    }

    @Then("user should be able to select all quotations")
    public void userShouldBeAbleToSelectAllQuotations() {
        Assert.assertTrue(salesPageNavigation.selectAllCheckBox.isSelected());
    }

}
