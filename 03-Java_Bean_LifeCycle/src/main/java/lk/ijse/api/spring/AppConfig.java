package lk.ijse.api.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/9/2024
 */

@Configuration
@ComponentScan
public class AppConfig {

    public AppConfig() {
        System.out.println("AppCofig instance is created");
    }
}
