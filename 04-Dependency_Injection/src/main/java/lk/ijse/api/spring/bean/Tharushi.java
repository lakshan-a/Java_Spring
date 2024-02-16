package lk.ijse.api.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/16/2024
 */

@Component
@Primary
@Qualifier("Long Hair")
public class Tharushi implements GoodGirl{

    @Override
    public void love() {
        System.out.println("Tharushi loves him so much");
    }

}
