package lk.ijse.gdse66.api.constructor.bean;

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

    /*public SpringBean(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        System.out.println("SpringBean(String , Int , Boolean)");
        System.out.printf("name=%s, age=%s , isMale=%s\n",name,age,isMale);
    }*/

    public SpringBean(String name, int age, boolean isMale, float temp) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.temp = temp;
    }
}
