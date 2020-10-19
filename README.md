# cucumber-spring-logback
[![TestMonkeys](https://circleci.com/gh/TestMonkeys/cucumber-spring-logback.svg?style=svg)](https://circleci.com/gh/TestMonkeys/cucumber-spring-logback)

This is a cucumber-jvm, spring and logback integration to provide an appender that will write logs to the cucumber report. 

This helps make use of logs provided by other libraries, as well as using logs in your tests, customizing the log level wanted in the report.

To use this you just need to log some information using your logger:
```
@When("I log a message")
public void logAMessage() {
  log.info("LoggedInformation");
}
```
And this will be automatically added to the output of this step:

![Image of the report](https://github.com/TestMonkeys/cucumber-spring-logback/blob/master/util/CucumberReportSample.PNG)

To test this project - clone it then run:
```
mvn test -Dtest=org.testmonkeys.test.cucumber.spring.logback.TestRunner
```
this will generate the cucumber.json report, then run 
```
mvn cucumber-reporting:generate
```
to generate the masterthought html report in target/report/


# integration in your project
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
