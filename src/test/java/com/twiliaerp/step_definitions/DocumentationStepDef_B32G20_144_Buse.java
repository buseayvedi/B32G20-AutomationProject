package com.twiliaerp.step_definitions;

import com.twiliaerp.page.DocumentationPage_Buse;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DocumentationStepDef_B32G20_144_Buse {

    DocumentationPage_Buse documentationPage = new DocumentationPage_Buse();

    @When("user clicks {string} button")
    public void user_clicks_button(String string) {

        documentationPage.clickingDocumentationButton(string);

    }

    @Then("user should see {string} message in a new window")
    public void user_should_see_odoo_documentation_message_in_a_new_window(String str) {

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String handle : windowHandles){
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().contains(str)){
                break;
            }
        }

        Assert.assertEquals(str, documentationPage.odooDocMessage.getText());

    }

    @Then("user should see these main document topics:")
    public void user_should_see_these_main_document_topics(List<String> expectedList) {

        List<String> actualList = new ArrayList<>(documentationPage.getMainTopicsOfOdooDocPage());

        Assert.assertEquals(expectedList, actualList);

    }



}
