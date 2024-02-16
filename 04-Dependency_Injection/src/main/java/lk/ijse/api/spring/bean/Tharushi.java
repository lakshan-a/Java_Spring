package lk.ijse.api.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/16/2024
 */

@Component
public class Tharushi implements GoodGirl{

    @Override
    public void love() {
        System.out.println("Tharushi loves him so much");
    }
}
