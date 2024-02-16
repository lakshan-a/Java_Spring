package lk.ijse.api.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/9/2024
 */

@Component
@Primary
public class Sachini implements GoodGirl, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {



    public Sachini() {

        System.out.println("Sachini - Constructor");
    }

    @Override
    public void love() {
        System.out.println("Sachini loves him so much");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Sachini- setBeanFactory..............");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Sachini- setBeanName...............");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Sachini- destroy.............");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Sachini- afterPropertiesSet.................");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Sachini-setApplicationContext..................");
    }
}
