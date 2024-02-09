package lk.ijse.api.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/9/2024
 */
@Component
public class Sachini implements GoodGirl{
    public Sachini() {
        System.out.println("Sachini - Constructor");
    }

    @Override
    public void love() {
        System.out.println("Sachini loves him");
    }
}
