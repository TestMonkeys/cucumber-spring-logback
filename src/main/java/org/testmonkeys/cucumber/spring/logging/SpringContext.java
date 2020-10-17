package org.testmonkeys.cucumber.spring.logging;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * SpringContext class is used by CucuberScenarioAppender to retrieve the CucumberScenarioContext bean, as
 * CucumberScenarioAppender is initialized by SpringFramework and CucumberScenearioContext will be handled by
 * Cucumber - we can't autowire it directly
 */
@Component
public class SpringContext implements ApplicationContextAware {
    private static ApplicationContext context;

    public static <T extends Object> T getBean(Class<T> beanClass) {
        return context.getBean(beanClass);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) {
        SpringContext.context = context;
    }
}
