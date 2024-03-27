package com.twiliaerp.step_definitions;

import com.twiliaerp.page.SalesPage_B32G20_141_Buse;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesPageStepDef_B32G20_141_Buse {

    SalesPage_B32G20_141_Buse salesPage = new SalesPage_B32G20_141_Buse();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));


    @Given("user login successfully with valid credentials {string}, {int}")
    public void user_login_successfully_with_valid_credentials(String sheetName, int rowNum) {
        salesPage.loginWithExcelFileCredentials(sheetName,rowNum);
        wait.until(ExpectedConditions.visibilityOf(salesPage.accountName));

    }

    @When("user clicks Sales title and land on the page successfully")
    public void user_clicks_sales_title_and_land_on_the_page_successfully()  {
        salesPage.clickSalesModule();
    }


    @Then("user should see these below titles on the list")
    public void user_should_see_these_on_the_list(List<String> expectedTitles) {
        List<String> actualTitles = new ArrayList<>();

        for (WebElement each : salesPage.listTitles_QuotationsPage){
            actualTitles.add(each.getText());
        }

        Assert.assertEquals("Title verification FAILED", expectedTitles, actualTitles);

    }


    @When("user enters {string} in the search box and hit the enter key")
    public void user_enters_in_the_search_box_and_hit_the_enter_key(String string) throws InterruptedException {
       salesPage.searchProductInSearchBox(string);
       Thread.sleep(5000);

    }

    @Then("user should see the result on the list : {string},{string},{string},{string},{string},{string}")
    public void user_should_see_the_result_on_the_list(String eQuotationNumber, String eQuotationDate, String eCustomer, String eSalesperson, String eTotal, String eStatus) {

        List<String> expectedInfo = new ArrayList<>(Arrays.asList(eQuotationNumber,eQuotationDate,eCustomer,eSalesperson,eTotal,eStatus));

        List<String> actualInfo = new ArrayList<>();

        for (WebElement each : salesPage.searchResultElements){
            actualInfo.add(each.getText());
        }

        Assert.assertEquals(expectedInfo, actualInfo);


    }


}

