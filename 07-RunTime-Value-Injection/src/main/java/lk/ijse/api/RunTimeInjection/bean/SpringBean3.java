package lk.ijse.api.RunTimeInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

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
    }

    @PostConstruct
    public void initialize(){
        System.out.println(env.getProperty("USERNAME"));
        System.out.println(env.getProperty("USERDOMAIN"));
        System.out.println(env.getProperty("POWERSHELL_DISTRIBUTION_CHANNEL"));
        System.out.println(env.getProperty("java.version"));
        System.out.println(env.getProperty("app.env1"));
        System.out.println(env.getProperty("app.env2"));
        System.out.println(env.getProperty("app.env3"));

    }
}
