package lk.ijse.gdse66.api.constructor;

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
    public String myString(){
        return "amal";
    }

    @Bean
    public Integer myInt(){
        return 21;
    }

}
