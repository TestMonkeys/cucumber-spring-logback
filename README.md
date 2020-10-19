# cucumber-spring-logback
This is a cucumber-jvm, spring and logback integration to provide an appender that will write logs to the cucumber report. 

This helps make use of logs provided by other libraries, as well as using logs in your tests, customizing the log level wanted in the report.


# usage
Either copy the classes defined in java/main or use the project packaged

To tie it to your tests:
* import the spring configuration class ```org.testmonkeys.cucumber.spring.logback.CucumberSpringLoggingConfiguration.class``` 
* add the ```org.testmonkeys.cucumber.spring.logback``` package to your glue.
* configure your logback.xml file and define the cucumber appender:
```
<configuration>
    <appender name="Cucumber" class="org.testmonkeys.cucumber.spring.logback.CucumberScenarioAppender"/>

    <root leve="info">
        <appender-ref ref="Cucumber"/>
    </root>
</configuration>
```
