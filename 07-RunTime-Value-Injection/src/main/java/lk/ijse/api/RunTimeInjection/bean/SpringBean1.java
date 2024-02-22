package lk.ijse.api.RunTimeInjection.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Configuration
@Component
public class SpringBean1 {

    @Value("Amal")
    private String name;

    public SpringBean1 (@Value("IJSE") String myString){
        System.out.println("SpringBean1() - Constructor : " + myString);
        System.out.println("name :" + name);
    }

    @PostConstruct
    public void initialize(){
        System.out.println("name : " +name);
    }



}
