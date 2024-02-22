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
        return new SpringBean2();
    }

    @Bean
    public SpringBean4 springBean4(){
        return new SpringBean4();
    }


}
