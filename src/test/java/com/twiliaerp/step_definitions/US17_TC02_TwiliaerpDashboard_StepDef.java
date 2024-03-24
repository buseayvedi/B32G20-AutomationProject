package com.twiliaerp.step_definitions;

import com.twiliaerp.page.US17_TC02_TwiliaerpDashboardPage;
import com.twiliaerp.utilities.BrowserUtilities;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US17_TC02_TwiliaerpDashboard_StepDef {

    US17_TC02_TwiliaerpDashboardPage dashboardPage = new US17_TC02_TwiliaerpDashboardPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));


    @Then("sales manager should be able to see following modules")
    public void sales_manager_should_be_able_to_see_following_modules(List<String> expectedDashModules) {

        BrowserUtilities.waitForTitleContains("#Inbox - Odoo");

        List<String> actualAllTopSMMenModules = new ArrayList<>();

        for (WebElement eachTopModule : dashboardPage.allTopSMMenModules) {

            actualAllTopSMMenModules.add(eachTopModule.getText());

            if(eachTopModule.getText().contains("Maintenance")){
                break;

            }


        }

        System.out.println("actualAllTopSMMenModules = " + actualAllTopSMMenModules);


        Assert.assertEquals(expectedDashModules, actualAllTopSMMenModules);
        //Assert.assertTrue(actualAllTopSMMenModules.contains(expectedDashModules));

        //String actualTitle = Driver.getDriver().getTitle();
        //        Assert.assertTrue(actualTitle.contains(expectedInTitle));



    }

    @Then("sales manager should be able to click on every module and access the correct module by the title name")
    public void sales_manager_should_be_able_to_click_on_every_module_and_access_the_correct_module_by_the_title_name(List<String> expectedModuleTitles) {

        List<String> actualModuleTitles = new ArrayList<>();
        int i = 0;
        for (WebElement eachTopModule : dashboardPage.allTopSMMenModules) {

            eachTopModule.click();

            wait.until(ExpectedConditions.titleIs(expectedModuleTitles.get(i)));

            actualModuleTitles.add(Driver.getDriver().getTitle());

            i++;
            if(eachTopModule.getText().contains("Maintenance")){
                break;

            }
        }

        System.out.println("actualModuleTitles = " + actualModuleTitles);

        Assert.assertEquals(expectedModuleTitles,actualModuleTitles);


    }

    @Then("sales manager should be able to see More module with following dropdown options")
    public void sales_manager_should_be_able_to_see_more_module_with_following_dropdown_options(List<String> expectedMoreDropOpt){

        //BrowserUtils.sleep(10);

        wait.until(ExpectedConditions.visibilityOf(dashboardPage.moreDropdownModule));
        dashboardPage.moreDropdownModule.click();

        List<String> actualAllMoreDropOpt = new ArrayList<>();

        for (WebElement eachMoreDropOpt : dashboardPage.allMoreDropdownModules){
            actualAllMoreDropOpt.add(eachMoreDropOpt.getText());
        }
        System.out.println("actualAllMoreDropOpt = " + actualAllMoreDropOpt);

        Assert.assertEquals(expectedMoreDropOpt, actualAllMoreDropOpt);
    }

    @Then("sales manager should be able to click on More options module and access the correct module by the title name")
    public void sales_manager_should_be_able_to_click_on_more_options_module_and_access_the_correct_module_by_the_title_name(List<String> expectedMoreModuleTitle) {

        //BrowserUtils.sleep(10);
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.moreDropdownModule));
        dashboardPage.moreDropdownModule.click();

        List<String> actualMoreModuleTitle = new ArrayList<>();

        int i = 0;

        for (WebElement eachMoreDropOpt : dashboardPage.allMoreDropdownModules){

            wait.until(ExpectedConditions.visibilityOf(dashboardPage.moreDropdownModule));
            dashboardPage.moreDropdownModule.click();

            wait.until(ExpectedConditions.visibilityOf(eachMoreDropOpt));

            //BrowserUtils.sleep(10);

            eachMoreDropOpt.click();

            //BrowserUtils.sleep(10);

            wait.until(ExpectedConditions.titleIs(expectedMoreModuleTitle.get(i)));

            actualMoreModuleTitle.add(Driver.getDriver().getTitle());

        }

        System.out.println("actualMoreModuleTitle = " + actualMoreModuleTitle);

    }



    @And("sales manager should be able to see sales manager account name")
    public void sales_manager_should_be_able_to_see_sales_manager_account_name() {

        String actualSMAccName = dashboardPage.smAccountName.getText();
        String expectedSMAccName = "SalesManager";

        System.out.println("actualSMAccName = " + actualSMAccName);

        Assert.assertTrue(actualSMAccName.contains(expectedSMAccName));

    }

}


