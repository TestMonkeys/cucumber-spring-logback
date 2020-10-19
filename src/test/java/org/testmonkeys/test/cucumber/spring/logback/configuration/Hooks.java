package org.testmonkeys.test.cucumber.spring.logback.configuration;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;


@CucumberContextConfiguration
@ContextConfiguration(classes = CucumberSpringConfiguration.class)
public class Hooks {

}
