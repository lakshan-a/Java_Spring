package lk.ijse.api.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/9/2024
 */

@Configuration
@ComponentScan
public class AppConfig {

   /* public AppConfig() {
        System.out.println("appConfig instance is created");
    }*/

    @Order(2)
    @Bean
    public String myString(){
        return "IJSE";
    }

    @Order(3)
    @Bean
    public String myString2(){
        return "ESOFT";
    }

    @Order(1)
    @Bean
    public String myString3(){
            return "SLIIT";
    }



}
