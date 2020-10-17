package org.testmonkeys.demo.configuration;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;


@CucumberContextConfiguration
@ContextConfiguration(classes = CucumberSpringConfiguration.class)
public class Hooks {

}
