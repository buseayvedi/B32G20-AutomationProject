package com.twiliaerp.step_definitions;

import com.twiliaerp.page.RepairsPage_B32G20_141_Buse;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepairsPage_StepDef_B32G20_142_Buse {

    RepairsPage_B32G20_141_Buse repairsPage = new RepairsPage_B32G20_141_Buse();

    @When("user clicks Repairs title and land on the page successfully")
    public void user_clicks_repairs_title_and_land_on_the_page_successfully() {
       repairsPage.repairModuleClick();
    }


    @Then("user verify there are these columns to show the detail of the repair orders on the page")
    public void user_verify_there_are_these_columns_to_show_the_detail_of_the_repair_orders_on_the_page(List<String> expectedList) {
        Assert.assertEquals("Titles verification FAILED", expectedList, repairsPage.titlesList());
    }

    @When("user enters {string} in the search box on the Repairs page and hit the enter key")
    public void user_enters_in_the_search_box_on_the_repairs_page_and_hit_the_enter_key(String string) {
       repairsPage.sendKeysSearchBox(string);
    }

    @Then("user should see the result on the Repair Order list : {string},{string},{string},{string},{string},{string}")
    public void user_should_see_the_result_on_the_repair_order_list(String string, String string2, String string3, String string4, String string5, String string6) {
        List<String> expectedList = new ArrayList<>(Arrays.asList(string,string2,string3,string4,string5,string6));
        Assert.assertEquals(expectedList, repairsPage.searchResultElements());


    }



}
