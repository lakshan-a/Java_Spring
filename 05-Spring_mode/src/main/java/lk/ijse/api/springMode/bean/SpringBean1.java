package lk.ijse.api.springMode.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Component

@Configuration
@ComponentScan
public class SpringBean1 {
    public SpringBean1() {
        System.out.println("SpringBean1() - Constructor ");
    }

    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }

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


}
