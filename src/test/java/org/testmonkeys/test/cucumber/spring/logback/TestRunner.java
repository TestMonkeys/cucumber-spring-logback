package org.testmonkeys.test.cucumber.spring.logback;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber/cucumber.json"},
        features = "classpath:features/",
        tags = "",
        glue = {"classpath:org.testmonkeys.test.cucumber.spring.logback.configuration",
                "classpath:org.testmonkeys.test.cucumber.spring.logback.stepDefs",
                "classpath:org.testmonkeys.cucumber.spring.logback"}

)
public class TestRunner {
}
