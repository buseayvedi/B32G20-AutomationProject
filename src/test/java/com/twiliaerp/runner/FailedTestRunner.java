package com.twiliaerp.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        // Specifies the location of the failed test scenarios list
        features = "@target/rerun.txt",
        
        // Specifies the package where step definitions are located
        glue = "com/cydeo/step_definitions"
)

public class FailedTestRunner {


}
