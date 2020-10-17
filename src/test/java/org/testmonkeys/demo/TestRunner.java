package org.testmonkeys.demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber/cucumber.json"},
        features = "classpath:features/",
        tags = "",
        glue = {"classpath:org.testmonkeys.demo.configuration",
                "classpath:org.testmonkeys.demo.stepDefs",
                "classpath:org.testmonkeys.cucumber.spring.logging"}

)
public class TestRunner {
}
