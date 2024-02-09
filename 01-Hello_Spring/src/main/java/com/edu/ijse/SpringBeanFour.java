package com.edu.ijse;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class SpringBeanFour {

    public SpringBeanFour() {
        System.out.println("SpringBeanFour instance is created");

    }

}
