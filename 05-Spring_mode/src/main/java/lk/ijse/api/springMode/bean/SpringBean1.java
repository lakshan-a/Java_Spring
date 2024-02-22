package lk.ijse.api.springMode.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Component
public class SpringBean1 {
    public SpringBean1() {
        System.out.println("SpringBean1() - Constructor ");
    }

    @Bean
    public SpringBean3 sprinBeanThree(){
        return new SpringBean3();
    }
}
