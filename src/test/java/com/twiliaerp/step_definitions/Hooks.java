package com.twiliaerp.step_definitions;

import com.twiliaerp.utilities.Driver;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setupMethod(){
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO ");
    }

    @After
    public void tearDown(Scenario scenario){

        // Take screenshot of the current state of the browser
        if (scenario.isFailed()){

            // Attach the screenshot to the scenario report
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        }

        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");

        Driver.closeDriver();

    }

}
