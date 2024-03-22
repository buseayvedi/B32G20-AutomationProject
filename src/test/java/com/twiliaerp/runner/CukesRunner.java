package com.twiliaerp.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                //Writes the methods near the scenario in terminal
                "pretty",

                // Generates HTML reports in the specified directory
                "html:target/cucumber-report.html",

                // Generates rerun file in the specified directory
                "rerun:target/rerun.txt",

                // Enables Pretty reporting
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        //Specifies the location of feature files
        features = "src/test/resources/features",

        // Specifies the package where step definitions are located
        glue = "com/twiliaerp/step_definitions",


        // Specifies the tags to include/exclude specific scenarios or features
        tags = "@addProduct",
        // Whether to execute a dry run of the feature files
        dryRun = true,


        // Changes the texts color in terminal
        monochrome = true,

        // Whether to publish the results
        publish = true


)


public class CukesRunner {

}
