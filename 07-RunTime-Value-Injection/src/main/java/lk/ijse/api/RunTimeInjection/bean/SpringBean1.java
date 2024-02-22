package lk.ijse.api.RunTimeInjection.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

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

    public SpringBean1 (@Value("IJSE") String myString,
                        @Value("6") int myInt,
                        @Value("6.2") double myDouble,
                        @Value("true") boolean myBoolean,
                        @Value("1,2,3,4,5") int[] myIntArray,
                        @Value("1,2,3,4,5") List<String> List,
                        @Value("1,2,3,4,5")Set set,
                        @Value("1") char myChar){
        System.out.println("My String : " + myString);
        System.out.println("My Int : " + myInt);
        System.out.println("My Double : " + myDouble);
        System.out.println("My Boolean : " + myBoolean);
        System.out.println("My Array : " + Arrays.toString(myIntArray));
        System.out.println("My Char : " + myChar);
        System.out.println("My ArrayList : " + List);
        System.out.println("My Set : " + set);
        System.out.println("name :" + name);
    }

    @PostConstruct
    public void initialize(){
        System.out.println("name : " +name);
    }

}
