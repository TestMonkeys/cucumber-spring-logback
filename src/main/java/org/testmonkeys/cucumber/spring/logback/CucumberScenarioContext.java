package org.testmonkeys.cucumber.spring.logback;

import io.cucumber.java.Scenario;
import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

/**
 * CucumberScenarioContext is a holder for the current Cucumber Scenario object
 * <p>
 * current scenario should be assigned in before hooks
 */
@Component
@ScenarioScope
public class CucumberScenarioContext {
    private Scenario currentScenario;

    public Scenario getCurrentScenario() {
        return currentScenario;
    }

    public void setCurrentScenario(Scenario scenario) {
        currentScenario = scenario;
    }
}
