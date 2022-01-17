package org.testmonkeys.cucumber.spring.logback;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import io.cucumber.java.Scenario;

/**
 * CucumberScenarioAppender appends logs to the current cucumber scenario output
 */
public class CucumberScenarioAppender extends AppenderBase<ILoggingEvent> {

    private PatternLayoutEncoder encoder;

    private Scenario getScenario() {
        return SpringContext.getBean(CucumberScenarioContext.class).getCurrentScenario();
    }

    @Override
    protected void append(ILoggingEvent iLoggingEvent) {
        String message = this.encode(iLoggingEvent);
        Scenario scenario = getScenario();
        if (scenario != null) scenario.log(message);
    }

    private String encode(ILoggingEvent loggingEvent) {
        if (this.encoder == null) return loggingEvent.getFormattedMessage();
        return new String(this.encoder.encode(loggingEvent));
    }

    public void setEncoder(PatternLayoutEncoder encoder) {
        this.encoder = encoder;
        this.encoder.start();
    }
}
