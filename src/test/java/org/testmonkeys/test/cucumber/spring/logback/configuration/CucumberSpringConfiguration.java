package org.testmonkeys.test.cucumber.spring.logback.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.testmonkeys.cucumber.spring.logback.CucumberSpringLoggingConfiguration;


@Configuration
@ComponentScan("org.testmonkeys.test")
@Import({CucumberSpringLoggingConfiguration.class})
public class CucumberSpringConfiguration {

}
