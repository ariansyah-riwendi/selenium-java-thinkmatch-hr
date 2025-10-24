package com.automation.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.automation.hooks", "com.automation.steps"},
        plugin = {"pretty", "html:target/cucumber-report/cucumber-report.html"},
        tags = "@ViewListEmployee"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
