package lk.ijse.api.RunTimeInjection.bean;

import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Component
public class SpringBean3 {

    public SpringBean3() {
        System.out.println("SpringBean3() - Constructor");
    }
}
