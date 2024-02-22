package lk.ijse.api.RunTimeInjection.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Component

public class SpringBean2 {

   /* public SpringBean2(@Value("${USERNAME}") String username,
                       @Value("${USERDOMAIN}") String user,
                       @Value("${POWERSHELL_DISTRIBUTION_CHANNEL}") String dist,
                       @Value("${java.version}") String java,
                       @Value("${app.env1}") String env1,
                       @Value("${app.env2}") String env2,
                       @Value("${app.env3}") String env3) {

        System.out.println("SpringBean2() - Constructor");
        System.out.println("username : " + username);
        System.out.println("USERDOMAIN : " + user);
        System.out.println("Powershell : " + dist);
        System.out.println("version : " + java);
        System.out.println("app.env1 : " + env1);
        System.out.println("app.env2 : " + env2);
        System.out.println("app.env3 : " + env3);

    }*/
}
