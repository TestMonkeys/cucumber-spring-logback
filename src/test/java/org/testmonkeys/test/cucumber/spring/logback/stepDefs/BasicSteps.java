package org.testmonkeys.test.cucumber.spring.logback.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testmonkeys.cucumber.spring.logback.CucumberScenarioContext;

public class BasicSteps {

    Logger log = LoggerFactory.getLogger(BasicSteps.class);

    @Autowired
    private CucumberScenarioContext scenarioContext;

    @When("I log a message")
    public void logAMessage() {
        log.info("LoggedInformation");

    }

    @Then("The message is written to the scenario output")
    public void checkScenarioOutput(){
        log.info("The log will be checked in a separate junit test, by reading the json report");
    }
}
