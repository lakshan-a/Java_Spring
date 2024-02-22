package lk.ijse.api.springMode.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */


public class SpringBean4 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean4() {
        System.out.println("SpringBean4() - Constructor : " +this);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean4 - setBeanFactory : " + this );
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("SpringBean4 - setBeanName : " + this );

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean4 - destroy : " + this);

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean4 - afterPropertiesSet : " + this);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean4 - setApplicationContext : " + this);
    }
}
