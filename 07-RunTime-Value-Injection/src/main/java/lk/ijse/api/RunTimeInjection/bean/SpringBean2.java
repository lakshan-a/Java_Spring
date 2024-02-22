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
    public SpringBean2(@Value("${USERNAME}") String username,
                       @Value("${USERDOMAIN}") String user,
                       @Value("${POWERSHELL_DISTRIBUTION_CHANNEL}") String dist) {
        System.out.println("SpringBean2() - Constructor");
        System.out.println("username : " + username);
        System.out.println("userrdomain : " + user);
        System.out.println("Powershell : " + dist);
    }
}
