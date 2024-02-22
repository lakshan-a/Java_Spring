package lk.ijse.api.springMode.bean;

import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

public class SpringBean2 {
    public SpringBean2(SpringBean4 springBean4) {
        System.out.println("SpringBean2() - Constructor : " + springBean4);
    }
}
