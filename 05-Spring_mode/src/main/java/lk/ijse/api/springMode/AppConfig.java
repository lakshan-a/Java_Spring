package lk.ijse.api.springMode;

import lk.ijse.api.springMode.bean.SpringBean2;
import lk.ijse.api.springMode.bean.SpringBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public SpringBean2 springBean2(){
        System.out.println("SpringBean2() method is invoked");
        springBean4();
        springBean4();
        springBean4();
        return new SpringBean2(springBean4());
    }

    @Bean
    public SpringBean4 springBean4(){
        System.out.println("SpringBean4() method is invoked");
        return new SpringBean4();
    }

    public String myString(){
        System.out.println("SpringBean4() method is invoked");
        return "IJSE";
    }


}
