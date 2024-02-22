package lk.ijse.api.SpringConfiguration.bo;

import org.springframework.context.annotation.Configuration;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Configuration
public class BOSpringBean {

    /*public BOSpringBean() {
        System.out.println("BOSpringBean() - Constructor");
    }*/

    public BOSpringBean boSpringBean(){
        return new BOSpringBean();
    }
}
