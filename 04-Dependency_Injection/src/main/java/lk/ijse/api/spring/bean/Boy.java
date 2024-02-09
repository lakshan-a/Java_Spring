package lk.ijse.api.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/9/2024
 */

@Component("Lahiru")
public class Boy {

    @Autowired
    private GoodGirl gf;

    public Boy() {
        System.out.println("Boy - Constructor");
        System.out.println("Have I got a Girl Friend? " + gf);
    }
}
