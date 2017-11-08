package com.belatrix.connect;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "html:target/cucumber-html-reports",
        "json:target/cucumber-html-reports/cucumber.json",
        "junit:target/surefire-reports/cucumber-junit.xml" },
        features = {"src/test/resources/features/"},
        format = { "pretty","html:target/cucumber-htmlreport",
                "json:target/cucumber-html-reports/cucumber.json" },
        tags = "@MyFirstCucumberFeature",
        glue = { "com.belatrix.connect.steps" })



public class AppTest extends AbstractTestNGCucumberTests{

}
