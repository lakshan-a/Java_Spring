package lk.ijse.api.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/9/2024
 * */

//@PostConstruct
//@PreDestroy
@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean() {
        System.out.println("SpringBean instance is created");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory : " + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName : " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext : " +applicationContext);
    }

    @PostConstruct
    public void initialize(){
        System.out.println("initialize instance is created");
    }

    @PreDestroy
    public void disposable(){
        System.out.println("disposable instance is created");
    }
}
