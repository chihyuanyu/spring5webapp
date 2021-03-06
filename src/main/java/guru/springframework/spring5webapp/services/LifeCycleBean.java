package guru.springframework.spring5webapp.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleBean() {
        System.out.println("# The LifeCycleBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("# The Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("# The Bean name is: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("# The LifeCycle Bean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("# The LifeCycleBean has its Properties set!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("# The Application context has been set");
    }

    @PostConstruct
    public void postConstruct() throws BeansException {
        System.out.println("# The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() throws BeansException {
        System.out.println("# The preDestroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("# Before Init - Called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("# After Init - Called by Bean Post Processor");
    }

}
