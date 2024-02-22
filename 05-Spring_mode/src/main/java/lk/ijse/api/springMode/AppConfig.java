package lk.ijse.api.springMode;

import lk.ijse.api.springMode.bean.SpringBean2;
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
    public SpringBean2 springBeanTwo(){
        return new SpringBean2();
    }
}
