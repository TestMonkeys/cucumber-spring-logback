# cucumber-spring-logback
This is a cucumber-jvm, spring and logback integration to provide an appender that will write logs to the cucumber report.

# usage
either copy the classes defined in java/main or use the project packaged
to tie it to your tests please import the spring configuration class ```org.testmonkeys.cucumber.spring.logback.CucumberSpringLoggingConfiguration.class``` and add the ```org.testmonkeys.cucumber.spring.logback``` package to your glue.
to configure logging use your logback.xml file and define the cucumber appender:
```
<configuration>
    <appender name="Cucumber" class="org.testmonkeys.cucumber.spring.logback.CucumberScenarioAppender"/>

    <root leve="info">
        <appender-ref ref="Cucumber"/>
    </root>
</configuration>
```
