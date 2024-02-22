package lk.ijse.api.RunTimeInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Component
public class SpringBean3 {

    @Autowired
    private Environment env;

    public SpringBean3() {
        System.out.println("SpringBean3() - Constructor");
        System.out.println(env);
    }

    public void initialize(){
        System.out.println(env);
    }
}
