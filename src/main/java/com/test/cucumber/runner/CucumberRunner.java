package com.test.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "json:target/cucumber.json" },
        // name of directory which has feature files, staring from root of project
        features = { "src/main/resources/com/test/cucumber/features" },
        // name of directory containing step definition files
        // as its a maven project , compiler will try to find this directory inside
        // directories
        // src/main/java
        glue = { "com/test/cucumber/stepdef" })

public class CucumberRunner {

}
