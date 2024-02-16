package lk.ijse.api.spring.bean;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/16/2024
 */

@Component
public class SpringBean {

    public SpringBean(String[] nameList) {
        System.out.println("SpringBean() - Constructor" + nameList);
        System.out.println(Arrays.toString(nameList));
    }
}
