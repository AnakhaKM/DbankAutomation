package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Feature",
        glue = "com.automation.steps",
//        tags =  "@login and @check"
        plugin={"json:target/report.html","html:target/report.html"}


//        dryRun = true
)
public class TestRunner {

}


