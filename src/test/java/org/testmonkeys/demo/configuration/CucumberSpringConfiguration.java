package org.testmonkeys.demo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.testmonkeys.cucumber.spring.logging.CucumberSpringLoggingConfiguration;


@Configuration
@ComponentScan("org.testmonkeys.demo")
@Import({CucumberSpringLoggingConfiguration.class})
public class CucumberSpringConfiguration {

}
