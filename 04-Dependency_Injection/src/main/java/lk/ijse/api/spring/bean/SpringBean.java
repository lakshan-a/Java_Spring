package lk.ijse.api.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/16/2024
 */

@Component
public class SpringBean {

    public SpringBean(String name) {
        System.out.println("SpringBean() - Constructor");
    }
}
