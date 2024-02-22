package lk.ijse.api.springMode;

import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Component
public class AppConfig {
    public AppConfig() {
        System.out.println("Spring Bean One");
    }
}
