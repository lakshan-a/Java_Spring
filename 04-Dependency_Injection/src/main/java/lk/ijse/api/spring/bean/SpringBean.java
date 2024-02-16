package lk.ijse.api.spring.bean;

import org.springframework.stereotype.Component;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/16/2024
 */

@Component
public class SpringBean {

   /* public SpringBean(String[] nameList) {
        System.out.println("SpringBean() - Constructor" + nameList);
        System.out.println(Arrays.toString(nameList));

    }*/

    public SpringBean(Map<String,String> nameList) {
        System.out.println("SpringBean() - Constructor" + nameList);
        System.out.println(nameList);
    }

//    public SpringBean(List<String> nameList) {
//        System.out.println("SpringBean() - Constructor" + nameList);
//        System.out.println(nameList);
//    }


}
