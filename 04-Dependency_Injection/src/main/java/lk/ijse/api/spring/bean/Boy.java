package lk.ijse.api.spring.bean;

import lk.ijse.api.spring.util.Injector;
import lk.ijse.api.spring.util.WhiteFace;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/9/2024
 */

@Component("lahiru")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Boy implements /*Injector,*/ BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    /* @Autowired
    private GoodGirl gf;

    private GoodGirl goodGirl(GoodGirl goodGirl){
        this.gf =goodGirl;
    }*/

    private GoodGirl gf;

    /*@Override
    public void inject(GoodGirl gf) {
        this.gf =gf;
    }*/

    /*  public Boy(GoodGirl gf) {
        System.out.println("Boy - Constructor");
        System.out.println("Have I got a Girl Friend? " + gf);

        GoodGirl sachini = new Sachini();
        sachini.love();
    }*/

    @Autowired
    public Boy(@Qualifier("Long Hair") @WhiteFace GoodGirl gf){
        this.gf=gf;
        System.out.println("Boy - Constructor");
        System.out.println("Have I got a Girl Friend? " + gf);
        gf.love();

    }

    public Boy(){
        System.out.println("Boy() - Constructor");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Have I got a Girl Friend? " + gf);
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Sachini - setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Sachini - setBeanName");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Sachini - destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Sachini - afterPropertiesSet");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Sachini - setApplicationContext");

    }


}
