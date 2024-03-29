package lk.ijse.gdse66.api.constructor.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Component
public class SpringBean {
    private String name;
    private int age;
    private boolean isMale;
    private float temp;

    /*public SpringBean() {
        System.out.println("SpringBean() - Constructor");
    }*/

    @Autowired(required = false)
    public SpringBean(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        System.out.println("SpringBean(String , Int , Boolean)");
        System.out.printf("name=%s, age=%s , isMale=%s\n",name,age,isMale);
    }

    @Autowired(required = false)
    public SpringBean(String name, int age, boolean isMale,  float temp) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.temp = temp;
        System.out.println("SpringBean(String , Int , Boolean,Float)");
        System.out.printf("name=%s, age=%s , isMale=%s, temp=%s\n",name,age,isMale,temp);
    }

    @Autowired(required = false)
    public SpringBean(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("SpringBean(String , Int )");
        System.out.printf("name=%s, age=%s\n",name,age);
    }

}
