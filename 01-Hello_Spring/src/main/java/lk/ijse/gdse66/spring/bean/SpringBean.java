package lk.ijse.gdse66.spring.bean;

import lk.ijse.gdse66.spring.AppConfig;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component(value = "sb")
@Scope("prototype")
@Component
public class SpringBean {
    public SpringBean(){
        System.out.println("SpringBean instance is created");
    }

    public void myMethod () {
        System.out.println("myMethod is invoke");

    }
}
