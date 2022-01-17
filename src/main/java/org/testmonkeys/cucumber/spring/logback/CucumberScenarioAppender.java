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
        if (!this.encoder.isStarted())encoder.start();
        byte[] encoded = encoder.encode(iLoggingEvent);
        Scenario cukeScenario = getScenario();
        if (cukeScenario != null)
            cukeScenario.log(new String(encoded));
    }

    public void setEncoder(PatternLayoutEncoder encoder){
        this.encoder = encoder;
    }

    public PatternLayoutEncoder getEncoder(){
        return this.encoder;
    }
}
